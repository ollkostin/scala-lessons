package lessons._3scope.baz

import lessons._3scope.foo.Foo.{name => _} //import Foo, but not Foo.name

object Baz {
  val baz = "baz"
}
