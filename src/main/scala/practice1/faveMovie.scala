import scala.io.StdIn.readLine

object faveMovie {
  def main(args: Array[String]): Unit = {
    val mov = readLine("What is your favorite movie? ")
    println(mov + " is a good movie!")
  }
}
