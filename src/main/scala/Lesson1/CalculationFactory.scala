
object CalculationFactory {
  def Add (leftTerm : Int, rightTerm : Int) : BaseCaluclation = new Addition(leftTerm, rightTerm)
  def Subtract (leftTerm : Int, rightTerm : Int) : BaseCaluclation = new Subtraction(leftTerm, rightTerm)
  def multiply (leftTerm : Int, rightTerm : Int) : BaseCaluclation = new Multiplication(leftTerm, rightTerm)
  def Divide (leftTerm : Int, rightTerm : Int) : BaseCaluclation = new Division(leftTerm, rightTerm)
}
