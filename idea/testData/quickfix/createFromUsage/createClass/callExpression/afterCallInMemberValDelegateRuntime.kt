// "Create class 'Foo'" "true"
// ERROR: <html>Class 'Foo' must be declared abstract or implement abstract member<br/><b>public</b> <b>abstract</b> <b>fun</b> get(thisRef: A&lt;T&gt;, desc: kotlin.PropertyMetadata): B <i>defined in</i> kotlin.properties.ReadOnlyProperty</html>

import kotlin.properties.ReadOnlyProperty

open class B

class A<T>(val t: T) {
    val x: B by Foo(t, "")
}

class Foo<T>(t: T, s: String) : ReadOnlyProperty<A<T>, B> {

}
