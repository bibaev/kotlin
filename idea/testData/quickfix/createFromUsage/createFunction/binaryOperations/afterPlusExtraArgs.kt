// "Create function 'plus'" "true"

class A<T>(val n: T) {
    fun plus(): A<T> = throw Exception()

    fun plus(t: T): A<T> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun test() {
    val a: A<Int> = A(1) + 2
}