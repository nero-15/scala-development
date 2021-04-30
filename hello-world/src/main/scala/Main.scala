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
}
