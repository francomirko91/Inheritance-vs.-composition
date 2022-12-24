fun main() {
    val children = Parent.Children("Marco")
    children.havingBreakfast()

}


open class Parent(open var name: String) {
    fun havingBreakfast() {
        println("I'm $name and i'm having breakfast with my family")

    }


    class Children(override var name: String) : Parent(name) {
    }

}