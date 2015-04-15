package tests

object MissingLineNumbers extends App{
  val foo: Class[_] = classOf //error without position, line or file
  //val foo1: Class[_] = classOf[X] //good error, all info contained
}
