package com.github.pvasilyev.round1

/**
  * @author pvasilyev
  * @since 7/19/17
  */
object Main extends App {

  println("Hello World!")

}

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
