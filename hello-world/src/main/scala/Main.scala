object Main extends App {
    /*
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

    //val greeter = new Greeter("Hello, ", "!")
    //greeter.greet("Scala developer") // Hello, Scala developer!

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

    // object
    object IdFactory {
      private var counter = 0
      def create(): Int = {
        counter += 1
        counter
      }
    }
    val newId: Int = IdFactory.create()
    println(newId) // 1
    val newerId: Int = IdFactory.create()
    println(newerId) // 2

    // trait
    trait Greeter {
      def greet(name: String): Unit =
        println("Hello, " + name + "!")
    }
    class DefaultGreeter extends Greeter

    class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
      override def greet(name: String): Unit = {
        println(prefix + name + postfix)
      }
    }

    val greeter = new DefaultGreeter()
    greeter.greet("Scala developer") // Hello, Scala developer!

    val customGreeter = new CustomizableGreeter("How are you, ", "?")
    customGreeter.greet("Scala developer") // How are you, Scala developer?
    */

    val list: List[Any] = List(
      "a string",
      732,  // integer
      'c',  // character
      true, // boolean value
      () => "文字列を返す無名関数"
    )

    list.foreach(element => println(element))

    val x: Long = 987654321
    val y: Float = x  // 9.8765434E8 (この場合精度が落ちることに注意してください)

    val face: Char = '☺'
    val number: Int = face  // 9786

    class User
    val user1 = new User

    /*
    class Point(var x: Int = 0, var y: Int = 0)

    val origin = new Point  // x と y には共に0がセットされます。
    val point1 = new Point(1)
    println(point1.x)  // 1 が出力されます。
    val point2 = new Point(y=2)
    println(point2.y)  // 2 が出力されます。


    class Point {
      private var _x = 0
      private var _y = 0
      private val bound = 100

      def x = _x
      def x_= (newValue: Int): Unit = {
        if (newValue < bound) _x = newValue else printWarning
      }

      def y = _y
      def y_= (newValue: Int): Unit = {
        if (newValue < bound) _y = newValue else printWarning
      }

      private def printWarning = println("WARNING: Out of bounds")
    }

    val point1 = new Point
    point1.x = 99
    point1.y = 101 // 警告が出力されます。
    */

    trait HairColor
    trait Iterator[A] {
      def hasNext: Boolean
      def next(): A
    }

    class IntIterator(to: Int) extends Iterator[Int] {
      private var current = 0
      override def hasNext: Boolean = current < to
      override def next(): Int =  {
        if (hasNext) {
          val t = current
          current += 1
          t
        } else 0
      }
    }


    val iterator = new IntIterator(10)
    println(iterator.next())  // returns 0
    println(iterator.next())  // returns 1

    import scala.collection.mutable.ArrayBuffer

    trait Pet {
      val name: String
    }

    class Cat(val name: String) extends Pet
    class Dog(val name: String) extends Pet

    val dog = new Dog("Harry")
    val cat = new Cat("Sally")

    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.foreach(pet => println(pet.name))  // Prints Harry Sally


}
