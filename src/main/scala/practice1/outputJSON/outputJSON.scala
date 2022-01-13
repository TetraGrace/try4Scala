package outputJSON

object outputJSON {
    def oJSON() ={
        println("{ \n\"donut_name:\"Vanilla Donut\",\n\"quantity_purchased\":\"10\",\n\"price\":2.5\n}")
    }
    def main(args: Array[String]): Unit = {
        oJSON()
    }
}
