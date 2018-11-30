package binxio

case class Person(name: String, age: Int, address: Address)
case class Address(street: String, housenr: Int)

object ScalaExample {
  val xs = List(1, 2, 3)
  val ys = List(4, 5, 6)

  val add = (x: Int) => (_: Int) + x

  def main(args: Array[String]): Unit = {
    // functional
    val f = add(1)(_)
    val g = add(2)(_)
    val h = add(3)(_)
    val i = f.compose(g).compose(h)
    println(s"Applying composed functions: ${i(3)}")
    println("Iterating xs:")
    xs.foreach(println)
    println("Summing ys:")
    println(ys.sum)

    // object oriented
    val dennis = Person("Dennis", 42, Address("Somewhere", 42))
    println(s"Details of $dennis")
  }
}
