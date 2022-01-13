
import scala.io.StdIn.readLine
import Console.{RESET, BOLD, UNDERLINED}

object getNameAge {
    def getNameAndAge()={
        println("Please enter your Name.");
        val name = readLine();
        println("Please enter your age");
        val age = readLine();
        println(s"${RESET}${BOLD}Name:${UNDERLINED}$name")
        println(s"${RESET}${BOLD}Age:${RESET}" + age)

    }
    def main(args: Array[String]): Unit = {
        getNameAndAge()
    }
}
