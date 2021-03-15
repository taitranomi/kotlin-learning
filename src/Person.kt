class Person(val name: String, val age: Int) {
    var firstName: String = name
    var ageRef: Int = age

    constructor(name: String, age: Int, id: Int) : this(name, age) {
        println("Secondary")
    }
}

fun main() {
    var p = Person("Tai",18)
    println("OOP: " + p.firstName)
}