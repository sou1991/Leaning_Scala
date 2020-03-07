import akka.actor.{Actor, ActorSystem, PoisonPill, Props}
import trans.{Request, Response}

class SquareRootActor extends Actor{
  def receive = {
    case req : Request =>
      val calc = context.actorOf(Props[CalcSquareRootActor])
      calc ! req
    case Response(n) =>
      println(n)
      //子アクター停止
      sender() ! PoisonPill
      //10以上の値(平方根)がきたら停止
      if (n > 3.1) context.system.terminate()
  }
}
