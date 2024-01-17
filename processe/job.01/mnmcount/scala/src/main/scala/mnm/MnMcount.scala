// scalastyle:off println

package main.scala.chapter2

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

/**
  * Usage: MnMcount <mnm_file_dataset>
  */
object MnMcount {
  def main(args: Array[String]) {
    val spark = SparkSession
      .builder
      .appName("MnMCount")
      .getOrCreate()

    if (args.length < 1) {
      print("Usage: MnMcount <mnm_file_dataset>")
      sys.exit(1)
    }
    // get the M&M data set file name
    val mnmFile = args(0)
    // read the file into a Spark DataFrame
    val mnmDF = spark.read.format("csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .load(mnmFile)
    // display DataFrame
    mnmDF.show(5, false)


    val datajours4Df = {
     spark.read
      .option("multiLine", "true")
      .option("mode", "DROPMALFORMED")
      .option("header", "true")
      .option("inferSchema" , "true")
      .json(mnmFile)
    }


   
  }
}
// scalastyle:on println
