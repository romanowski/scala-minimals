package tests

object ProblemMaker {
  def equalTo[X](x: X) = new Matcher[X](){}

  //This line give us" scala.reflect.internal.FatalError: trying to do lub/glb of typevar ?X
  //adding another equalTo shows the real problems in package object tests
  val b = Problem2.allOf(equalTo("f"),equalTo("g"))
}
