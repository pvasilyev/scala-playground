trait Ord {
  def < (that: Any): Boolean
  def <=(that: Any): Boolean = (this < that) || (this == that)
  def > (that: Any): Boolean = !(this <= that)
  def >=(that: Any): Boolean = !(this < that)
  val brand = "BMW"
}

class Obj(n: Int) extends Ord {
  override def <(that: Any): Boolean = that match {
    case i: Int => n < i
    case _ => false
  }
}
val o = new Obj(3)
o < 5
o < 2


class Date(y: Int, m: Int, d: Int) extends Ord {
  def year = y

  def month = m

  def day = d

  override def toString: String = year + "-" + month + "-" + day

  override def <(that: Any) = that match {
    case ddd: Date => y < ddd.year || y == ddd.year && (m < ddd.month || m == ddd.month && (d <= ddd.day))
    case _ => false
  }
}

val d = new Date(2017, 4, 11)
val c = new Date(2017, 7, 12)
d < c

