import scala.util.{Try, Success, Failure}
import scala.util.{Either, Left}

val eitherInt = Left(Throwable(":sadface:"))
// val tryInt: Try[Int] = Failure(":sadface:")
val confused: Try[Throwable] = Try(Throwable("Am I a success ?"))
val xyz: Either[String, Int] = Left(":sadface:")





