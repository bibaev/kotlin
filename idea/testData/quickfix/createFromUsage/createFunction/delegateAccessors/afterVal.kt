// "Create function 'get'" "true"
class F {
    fun get(x: X, propertyMetadata: PropertyMetadata): Int {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class X {
    val f: Int by F()
}
