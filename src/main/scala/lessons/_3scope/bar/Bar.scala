package lessons._3scope.bar

import lessons._3scope.foo.Foo.{name => bobName} // we can rename imported

object Bar {
  lazy val name = bobName
}
