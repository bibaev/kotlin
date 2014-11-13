package onObjectHeader

fun main(args: Array<String>) {
    //Breakpoint!
    A.test()
}

object A {
    fun test() {
        lambda {
            foo()
        }
    }

    fun lambda(f: () -> Unit) {
        f()
    }

    private fun foo() {
        val a = 2
    }
}

// STEP_INTO: 7

// EXPRESSION: 1 + 1
// RESULT: 2: I