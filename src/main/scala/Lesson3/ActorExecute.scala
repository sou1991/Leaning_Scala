import java.util.concurrent.TimeUnit

import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.Actor
import trans.Request

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object ActorExecute {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("square_root_Actor")
    val squareRoot = system.actorOf(Props[SquareRootActor],"square_root")
    for (i <- 1 to 10) {
      squareRoot ! Request(i)
      }
    Await.ready(system.whenTerminated,Duration(1, TimeUnit.MINUTES))
    }

}