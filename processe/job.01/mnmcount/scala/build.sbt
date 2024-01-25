// Name of the package
name := "main.scala.mnm"

// Version of our package
version := "1.0"

// Version of Scala
scalaVersion := "2.12.18"

// Spark library dependencies
// Change this to the desired Spark version
val sparkVersion = "3.5.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion % "provided"
)

// Optional: Exclude transitive dependencies to avoid conflicts
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.11.0"
dependencyOverrides += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.11.0"
libraryDependencies += "org.elasticsearch" %% "elasticsearch-spark-30" % "8.12.0" % "provided"
