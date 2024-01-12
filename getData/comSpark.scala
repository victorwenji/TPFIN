val cheminpath ="C:/Users/ervan/Documents/GitHub/PR7BIGDATA/getData/storage"
val datajours =spark.read
                    .option("inferSchema" ,true)
                    .option("header" , true)
                    .option("multiline","true")
                    .option("mode","DROPMALFORMED")
                    .json(s"$cheminpath/Datajours4.json")

datajours.printSchema()

datajours.select("city.country").show()