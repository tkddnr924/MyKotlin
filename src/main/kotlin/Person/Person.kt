class Person(val name: String, val age: Int) {
    fun isAdult () : Boolean {
        return age >= 20
    }
}