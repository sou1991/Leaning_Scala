package Lesson2

case class Fibonacci(){
  def searchFibonacci (num : Int): Int ={
    if(num <= 1) 1
    else searchFibonacci(num - 2) + searchFibonacci(num - 1)
  }
}

case class Euclid(){
  def createEuclidt (term1 : Int, term2 : Int): Int ={
    if(term1 < term2 ) println("第一引数を大きい数に設定してください")
    if(term1 % term2 == 0) term2
    else createEuclidt(term2, term1 % term2)
  }
}

