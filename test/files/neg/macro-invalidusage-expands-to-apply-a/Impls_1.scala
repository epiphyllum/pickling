import scala.reflect.macros.{Context => Ctx}

class C
object Impls {
  def foo(c: Ctx)(x: c.Expr[Int]) = {
    import c.universe._
    Apply(Ident(TypeName("C")), List(x.tree))
  }
}
