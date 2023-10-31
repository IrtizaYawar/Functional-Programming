import scala.::
import scala.collection.mutable
import scala.util.Random
package assignment

object irtiza {
  def charArray(start: Int): List[Char] = {
    @annotation.tailrec
    def loop(current: Int, acc: List[Char]): List[Char] = {
      if (current <= 'z'.toInt) {
        loop(current + 1, (current.toChar) :: acc)
      } else {
        acc.reverse
      }
    }

    loop(start, Nil)
  }

  val result = charArray(98)
  println(result)

}
