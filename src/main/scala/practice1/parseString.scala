
object parseString {
    def main(args: Array[String]): Unit = {
    val inString = "Vanilla Donut 10 2.25".split(" ");
    val donutName = inString(0) + " " + inString(1);
    val amount = inString(2).toInt;
    val cost = inString(3).toDouble;
    println("Donut Type: " + donutName)
    println("Purchased Amount: " + amount)
    println("Donut Price: " + cost)
    }
}
