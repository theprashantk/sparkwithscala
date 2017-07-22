package misc

/**
  * Created by thegod on 7/22/17.
  */
class SparkConnection {


  import org.apache.spark.SparkContext
  import org.apache.spark.SparkConf

  /**
    * Created by toddmcgrath on 6/15/16.
    */
  object SimpleScalaSpark {

    def main(args: Array[String]) {
      val logFile = "/Users/toddmcgrath/Development/spark-1.6.1-bin-hadoop2.4/README.md" // Should be some file on your system
      val conf = new SparkConf().setAppName("Simple Application").setMaster("local[*]")
      val sc = new SparkContext(conf)
      val logData = sc.textFile(logFile, 2).cache()
      val numAs = logData.filter(line => line.contains("a")).count()
      val numBs = logData.filter(line => line.contains("b")).count()
      println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
    }

  }

}
