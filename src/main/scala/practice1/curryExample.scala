object curryExample {
    def square(x: Int) = x*x;
    def byThree(x: Int) = x*3
    def graceTime(words:String)(f: Int=> Int)(sq:Int) =  {
        println(f(sq).toString() + words + f(sq).toString())
    } 
    def main(args: Array[String]): Unit = {
        graceTime("Hello")(byThree)(12);
    }
}
