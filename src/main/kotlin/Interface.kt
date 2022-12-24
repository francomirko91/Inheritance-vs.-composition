fun main() {
    val children2 = Children2("Luca")
    children2.havingBreakfast()

}

interface Parent2 {
    val name: String
    fun havingBreakfast()

}

class Children2(override val name: String) : Parent2 {
    override fun havingBreakfast() {
        println("I'm $name and i'm having breakfast with my family")
    }
}