object shopping {
  def main(args: Array[String]): Unit = {
      val basket1 = List("Cake", "Milk", "Cheese", "Toilet Paper");
      val basket2 = List("Water", "Milk", "Juice", "Bread", "Cheese");
      val basket3 = basket1.intersect(basket2);
      basket3.foreach(println)
  }
}
