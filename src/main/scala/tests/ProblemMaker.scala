object ProblemMaker {
  def equalTo[X](x: X) = new Matcher[X](){}
  val b = Problem2.allOf(equalTo("f"),equalTo("g"))
}
