import CalculationFactory.Add
import CalculationFactory.Subtract
import CalculationFactory.multiply
import CalculationFactory.Divide


object Execute{
  def main(args: Array[String]): Unit = {
      val leftTerm : Int = 10
      val rightTerm : Int = 5
    /***
     * クライアントは下記を自由に選べる
     * Add 足し算
     * Subtract　引き算
     * multiply　掛け算
     * Divide　割り算
     */
      val createOperetor : BaseCaluclation =
        Add(leftTerm, rightTerm)
        //Subtract(leftTerm, rightTerm)
        //multiply(leftTerm, rightTerm)
        //Divide(leftTerm, rightTerm)
      val result : Int = createOperetor.calculate
      println(result)
    }
}
