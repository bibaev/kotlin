// "Create class 'Foo'" "true"

fun test() {
    val a = Foo { (p: Int) -> p + 1 }
}

class Foo(function: Function1<Int, Int>) {

}