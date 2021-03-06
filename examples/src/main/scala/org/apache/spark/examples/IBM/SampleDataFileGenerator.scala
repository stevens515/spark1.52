package org.apache.spark.examples.IBM

import java.io.File
import java.util.Random
import java.io.FileWriter

object SampleDataFileGenerator {
  def main(args: Array[String]) {
    val writer = new FileWriter(new File("D:\\eclipse44_64\\workspace\\spark1.5\\examples\\sample_age_data.txt"), false)
    val rand = new Random()
    for (i <- 1 to 10000) {
      writer.write(i + " " + rand.nextInt(100))
      writer.write(System.getProperty("line.separator"))
    }
    writer.flush()
    writer.close()
  }
}