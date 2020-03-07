import akka.actor.Actor
import trans.{Request, Response}


class CalcSquareRootActor extends Actor {
  def receive = {
    case Request(num) => sender()! Response(Math.sqrt(num))
  }
}





