import scala.collection.Map

object orderKids {
  def main(args: Array[String]): Unit = {
    var mapf = Map("Bill" -> 9, "Johnny" -> 8, "Tommy" -> 11, "Cindy" -> 13).toSeq.sortBy(_._1).toMap;
    println("Children by Name, decending: " + mapf.toString())
  }
}
