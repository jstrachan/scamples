package scamples

/**
 * @version $Revision: 1.1 $
 */

case class Person(name: String, age: Int)

object PeopleThingy {
  def people = List(Person("James", 39), Person("Issy", 2), Person("Lauren", 1), Person("Lisa", 36))

  def	main (args : Array[java.lang.String]) : Unit = {
    val (minors, adults) = minorsAndAdults()

    println("Minors = " + minors)
    return
  }

  def minorsAndAdults() = people partition (_.age < 18 )
}