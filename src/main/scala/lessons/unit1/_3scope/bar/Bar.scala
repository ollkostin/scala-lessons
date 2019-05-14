package lessons.unit1._3scope.bar

import lessons.unit1._3scope.foo.Foo.{name => bobName} // we can rename imported

object Bar {
  lazy val name = bobName
}
