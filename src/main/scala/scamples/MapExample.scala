package scamples

/**
 * @version $Revision: 1.1 $
 */

object MapExample {
  val names = List("James", "Lisa", "Issy", "Lauren")

  def lengths = names map (_.size)

  def greetings = names map ("Hello " + _)

  def main(args: Array[String]) {
    println("greetings: " + greetings)
    println("lengths: " + lengths)
  }
}