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


    val ingredient = ("Sugar" , 25)
    println(ingredient._1) // Sugar
    println(ingredient._2) // 25

    val (name, quantity) = ingredient
    println(name) // Sugar
    println(quantity) // 25

    val planets =
      List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
           ("Mars", 227.9), ("Jupiter", 778.3))
    planets.foreach{
      case ("Earth", distance) =>
        println(s"Our planet is $distance million kilometers from the sun")
      case _ =>
    }

    val numPairs = List((2, 5), (3, -7), (20, 56))
    for ((a, b) <- numPairs) {
      println(a * b)
    }

    abstract class A {
      val message: String
    }
    class B extends A {
      val message = "I'm an instance of class B"
    }
    trait C extends A {
      def loudMessage = message.toUpperCase()
    }
    class D extends B with C

    val d = new D
    println(d.message)  // I'm an instance of class B
    println(d.loudMessage)  // I'M AN INSTANCE OF CLASS B

    abstract class AbsIterator {
      type T
      def hasNext: Boolean
      def next(): T
    }

    class StringIterator(s: String) extends AbsIterator {
      type T = Char
      private var i = 0
      def hasNext = i < s.length
      def next() = {
        val ch = s charAt i
        i += 1
        ch
      }
    }

    trait RichIterator extends AbsIterator {
      def foreach(f: T => Unit): Unit = while (hasNext) f(next())
    }

    class RichStringIter extends StringIterator("Scala") with RichIterator
    val richStringIter = new RichStringIter
    richStringIter foreach println


    val salaries = Seq(20000, 70000, 40000)
    val doubleSalary = (x: Int) => x * 2
    val newSalaries = salaries.map(doubleSalary) // List(40000, 140000, 80000)

    case class WeeklyWeatherForecast(temperatures: Seq[Double]) {

      private def convertCtoF(temp: Double) = temp * 1.8 + 32

      def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF) // <-- convertCtoFメソッドが渡されます
    }

    def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
      val schema = if (ssl) "https://" else "http://"
      (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
    }

    val domainName = "www.example.com"
    def getURL = urlBuilder(ssl=true, domainName)
    val endpoint = "users"
    val query = "id=1"
    val url = getURL(endpoint, query) // "https://www.example.com/users?id=1": String
    println(url)

    def factorial(x: Int): Int = {
       def fact(x: Int, accumulator: Int): Int = {
         if (x <= 1) accumulator
         else fact(x - 1, x * accumulator)
       }
       fact(x, 1)
    }

    println("Factorial of 2: " + factorial(2))
    println("Factorial of 3: " + factorial(3))

    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val res = numbers.foldLeft(0)((m, n) => m + n)
    println(res) // 55
    */


    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numberFunc = numbers.foldLeft(List[Int]()) _
    val squares = numberFunc((xs, x) => xs :+ x*x)
    print(squares) // List(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
    val cubes = numberFunc((xs, x) => xs :+ x*x*x)
    print(cubes)  // List(1, 8, 27, 64, 125, 216, 343, 512, 729, 1000)

    case class Message(sender: String, recipient: String, body: String)
    val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")

    println(message1.sender)  // guillaume@quebec.ca が出力されます
    //message1.sender = "travis@washington.us"  // この行はコンパイルされません

    val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val messagesAreTheSame = message2 == message3  // true

    val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
    val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")
    println(message5.sender)  // travis@washington.us
    println(message5.recipient) // claire@bourgogne.fr
    println(message5.body)  // "Me zo o komz gant ma amezeg"

    import scala.util.Random

    val x: Int = Random.nextInt(10)

    x match {
      case 0 => "zero"
      case 1 => "one"
      case 2 => "two"
      case _ => "other"
    }

    def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "other"
    }
    println(matchTest(3))  // other
    println(matchTest(1))  // one

    abstract class Notification

    case class Email(sender: String, title: String, body: String) extends Notification

    case class SMS(caller: String, message: String) extends Notification

    case class VoiceRecording(contactName: String, link: String) extends Notification

    def showNotification(notification: Notification): String = {
      notification match {
        case Email(sender, title, _) =>
          s"You got an email from $sender with title: $title"
        case SMS(number, message) =>
          s"You got an SMS from $number! Message: $message"
        case VoiceRecording(name, link) =>
          s"you received a Voice Recording from $name! Click the link to hear it: $link"
      }
    }
    val someSms = SMS("12345", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")

    println(showNotification(someSms))  // You got an SMS from 12345! Message: Are you there? が出力されます。

    println(showNotification(someVoiceRecording))  // you received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123 が出力されます。


}
