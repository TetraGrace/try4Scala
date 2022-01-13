import scala.collection.mutable.ListBuffer

object numberList {
  def main(args: Array[String]): Unit = {
    var numList = ListBuffer[Int]();
    for(i:Int<-100 to 110){
        numList += i
    }
    numList.foreach(println);
  }
}
