// "Create function 'contains'" "true"

class A<T>(val n: T)

fun test() {
    2 <caret>!in A(1)
}