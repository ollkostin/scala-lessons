package lessons._3scope.foo

import lessons._3scope.baz.Baz._ // import all names from scope

object Foo {
  val name = "Bob"
  val d = baz
  def x = "x" // unstable identifier, cause can return different values. import is not allowed
}
