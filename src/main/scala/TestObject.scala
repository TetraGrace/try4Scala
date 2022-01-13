object TestObject {
    //print all odd numbers between a range
    def printOdds(start:Int,end:Int):Unit= {
        if(start > end || start == end) {
            println("You can't have a bigger start then your end, nor can they be the same number")
            return
        }
        for(i <- start to end){
            if(i%2 !=0){
                println(i)
            }
        }
    }
  def main(args: Array[String]): Unit = {
      printOdds(10,100)   
  }
}
