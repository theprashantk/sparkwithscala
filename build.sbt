name.:=("sparkwithscala")

version.:=("1.0")

scalaVersion.:=("2.12.2")

libraryDependencies.+=("org.apache.spark" % "spark-core_2.10" % "2.1.1")
libraryDependencies ++= Seq.apply(
  "org.apache.spark" % "spark-sql_2.10" % "2.1.1" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy"),
  "org.apache.hadoop" % "hadoop-common" % "2.7.0" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy"),
  "org.apache.spark" % "spark-sql_2.10" % "2.1.1" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy"),
  "org.apache.spark" % "spark-hive_2.10" % "2.1.1" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy"),
  "org.apache.spark" % "spark-yarn_2.10" % "2.1.1" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy")
)