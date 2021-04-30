object Main extends App {
    println(1) // 1
    println(1 + 1) // 2
    println("Hello!") // Hello!
    println("Hello," + " world!") // Hello, world!

    //val x = 1 + 1
    //println(x)

    val x: Int = 1 + 1
    println(x)

    var v = 1 + 1
    v = 3 // "x"は"var"キーワードで宣言されているので、これはコンパイルされます。
    println(v * v) // 9

    // block
    println({
        val x = 1 + 1
        x + 1
    }) // 3

    // function
    val addOne = (x: Int) => x + 1
    println(addOne(1)) // 2

    //val add = (x: Int, y: Int) => x + y
    //println(add(1, 2)) // 3

    val getTheAnswer = () => 42
    println(getTheAnswer()) // 42

    // method
    def add(x: Int, y: Int): Int = x + y
    println(add(1, 2)) // 3

    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
    println(addThenMultiply(1, 2)(3)) // 9

    def name: String = System.getProperty("user.name")
    println("Hello, " + name + "!")

    def getSquareString(input: Double): String = {
      val square = input * input
      square.toString
    }
    println(getSquareString(2.5)) // 6.25

    // class
    class Greeter(prefix: String, suffix: String) {
      def greet(name: String): Unit =
        println(prefix + name + suffix)
    }

    val greeter = new Greeter("Hello, ", "!")
    greeter.greet("Scala developer") // Hello, Scala developer!

    // case class
    case class Point(x: Int, y: Int)
    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2, 2)

    if (point == anotherPoint) {
      println(point + " と " + anotherPoint + " は同じです。")
    } else {
      println(point + " と " + anotherPoint + " は異なります。")
    } // Point(1,2) と Point(1,2) は同じです。

    if (point == yetAnotherPoint) {
      println(point + " と " + yetAnotherPoint + " は同じです。")
    } else {
      println(point + " と " + yetAnotherPoint + " は異なります。")
    } // Point(1,2) と Point(2,2) は異なります。
}
