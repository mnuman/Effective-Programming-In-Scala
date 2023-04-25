enum Grade:
  case Bad, Mediocre, Inadequate, Passable, Good, VeryGood, Excellent

Grade.Good.ordinal  

def euclideanDivision(dividend: Int, divisor: Int): (Int, Int) =
  val quotient  = dividend / divisor
  val remainder = dividend % divisor
  (quotient, remainder)

val (q,r) = euclideanDivision(10,3)  
val result = euclideanDivision(10, 3)
result