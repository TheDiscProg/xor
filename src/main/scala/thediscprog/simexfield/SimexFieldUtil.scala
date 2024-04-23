package thediscprog.simexfield

object SimexFieldUtil {

  def isFieldDefined(field: String): Boolean =
    Option(field).forall(_.trim.nonEmpty) && Option(field).isDefined

  def isFieldDefined[A](a: A): Boolean =
    Option(a).isDefined
}
