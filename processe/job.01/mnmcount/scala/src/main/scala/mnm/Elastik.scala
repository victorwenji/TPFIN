//scalastyle:off println
package main.scala.chapter2

import org.apache.spark.sql.{SparkSession, SaveMode}
import org.elasticsearch.spark.sql._

object Elastik{
  def main(args: Array[String]): Unit = {
    val index = "meteo"
    val typeName = "temp"
    val options = Map(
      "es.nodes" -> "localhost",
      "es.port" -> "9200",
      "es.resource" -> s"$index",
    )
    // Configuration Spark
    val spark = SparkSession.builder
      .appName("ParquetToElasticsearch")
      .config("es.nodes", "127.0.0.1")
      .config("es.port", "9200")
      .config("es.resource", s"$index")
      .config("es.index.auto.create", "true")
      .config("es.nodes.wan.only", "true")
      .getOrCreate()

    //val parquetData =  spark.read.parquet("C:/Users/ptcho/Downloads/scala/data/parquet/*.parquet")
    //getData\storage\jointureDF2
    
    print("Start**************************************************************************")
    val parquetData = spark.read.csv("C:/Users/pasca/Documents/GitHub/PR7BIGDATA/getData/storage/jointureDF2/*.csv")
    
    print("END*****************************************************************************")

    parquetData.write
      .format("org.elasticsearch.spark.sql")
      .option("es.resource", s"$index")
      .mode(SaveMode.Append) // Changez le mode selon vos besoins (Append, Overwrite, Ignore, etc.)
      .save()

    print(f"SAVING ON ELASTIC SEARCH******************************************************")

    // Arrêt de la session Spark
    spark.stop()
  }
}