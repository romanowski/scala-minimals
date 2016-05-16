package lib

import implicits.Bar

class Baz {
  val fooImpl = implicitly[Foo[String]]
}
