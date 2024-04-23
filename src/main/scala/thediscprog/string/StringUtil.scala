package thediscprog.string

object StringUtil {

  def isFieldDefined(field: String): Boolean =
    Option(field).forall(_.trim.nonEmpty) && Option(field).isDefined
}
