spark-submit --class main.scala.chapter2.MnMcount C:\Users\pasca\Documents\GitHub\PR7BIGDATA\processe\job.01\mnmcount\scala\target\scala-2.12\main-scala-mnm_2.12-1.0.jar C:/Users/pasca/Documents/GitHub/PR7BIGDATA/getData/storage/Data15jours4.json

spark-submit --class main.scala.chapter2.Elastik --packages org.elasticsearch:elasticsearch-spark-30_2.12:7.17.16 C:\Users\pasca\Documents\GitHub\PR7BIGDATA\processe\job.01\mnmcount\scala\target\scala-2.12\main-scala-mnm_2.12-1.0.jar

spark-submit --class main.scala.mnm.MnMcount --packages org.elasticsearch:elasticsearch-spark-30_2.12:7.17.16 /Users/juniortemgoua/Downloads/mnmcount/scala/target/scala-2.12/main-scala-mnm_2.12-1.0.jar

spark-submit --class main.scala.chapter2.Elastik --packages org.elasticsearch:elasticsearch-spark-30_2.12:8.12.0 C:\Users\pasca\Documents\GitHub\PR7BIGDATA\processe\job.01\mnmcount\scala\target\scala-2.12\main-scala-mnm_2.12-1.0.jar