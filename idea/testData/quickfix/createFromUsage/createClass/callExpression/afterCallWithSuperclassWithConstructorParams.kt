// "Create class 'Foo'" "true"
// ERROR: No value passed for parameter n

open class A(n: Int)

fun test(): A = Foo(2, "2")

class Foo(i: Int, s: String) : A() {

}