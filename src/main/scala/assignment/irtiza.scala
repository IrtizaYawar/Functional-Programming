import scala.::
import scala.math.sqrt
object Assignment2 {
  def main(args: Array[String]): Unit = {
    //Ex 1
    def func(x: Int): Int = {
      val a = 3
      val b = 5
      val c = 7
      val y = a * math.pow(x, 2).toInt + b * x + c
      y
    }

    val list1 = Range(-3, 4).toList
    println(s"main list $list1")

    val list2 = for {
      x <- list1
    } yield func(x)

    println(s"list after functions applied: $list2")


    //EX:3
import scala.::
import scala.collection.mutable
import scala.util.Random
import scala.math.sqrt
package assignment

object irtiza {

  def calculateEuclideanNorm(vector: List[Int]): Double = {
      val squaredSum = vector.map(x => x * x).sum
      sqrt(squaredSum)
    }

    def main(args: Array[String]): Unit = {
      // Example usage
      val inputVector = List(3, 4) //
      val euclideanNorm = calculateEuclideanNorm(inputVector)

      println(s"The Euclidean norm of the vector $inputVector is: $euclideanNorm")
    }
  }

    //Ex 2
    val zippedWithIndex = list1.zip(list2).zipWithIndex.map {
      case ((x, fx), index) => (x, fx, index)
    }

    println(s"this is zipped list with index $zippedWithIndex")

    val meanFx = list2.sum.toDouble / list2.length
    val fmean = zippedWithIndex.find { case (_, fx, _) => fx == meanFx }

    println(fmean)




