case class UserID private(value: Long)

object UserID:
    // the object is a singleton, parse is a factor method
    def parse(string: String): Option[UserID] = 
        string.toLongOption.map( id => UserID(id))

val milco = UserID.parse("42")
val numan = UserID.parse("43")        

numan == milco
