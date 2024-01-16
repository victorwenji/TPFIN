val cheminpath ="C:/Users/pasca/Documents/GitHub/PR7BIGDATA/getData/storage"
val datajours =spark.read
                    .option("inferSchema" ,true)
                    .option("header" , true)
                    .option("multiline","true")
                    .option("mode","DROPMALFORMED")
                    .json(s"$cheminpath/Datajours4.json")

datajours.printSchema()

datajours.select("city.country").show()

// afficher les dates

 val datadate =spark.read.option("inferSchema" ,true)
   .option("header" , true)
   .option("multiline","true")
   .option("mode","DROPMALFORMED")
   .json(s"$cheminpath/Datajours4.json")

   Selection du champs "list" et ses sous champs
    val dateDF= datadate.select(explode(col("list")).as("list_element")).select("list_element.dt_txt")

    dateDF.show(false)
val jourleplusfroid = tempMIN.orderBy("temp_min").select("date","temp_min",explode(col("list")).as("list_element")).select("list_element.dt_txt"))


    