import scala.math.BigDecimal
import java.text.Bidi
object cost {
  def main(args: Array[String]): Unit = {
    val cost = 2.5
    val amount = 10.0
    val result = BigDecimal(cost*amount).setScale(2, BigDecimal.RoundingMode.HALF_UP).toString()
    println("Total price: $" + result )
  }
}
