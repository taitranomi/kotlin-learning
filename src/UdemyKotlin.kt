import java.lang.IllegalArgumentException

fun main() {
    val user1 = User(1, "Tai");
    println(user1.name);

    val user2 = User(1, "Tai");
    println(user1.equals(user2));
}

class MobilePhone(osName: String, branch: String, model: String) {
    init {
        println("$branch $model. Here the osName is $osName, brand is $branch, model is $model");
    }
}

class Car {
    lateinit var owner: String

    val myBrand: String = "BMW"

    // Custom getter
    get() {
        return field.toLowerCase()
    }

    var maxSpeed: Int = 250
        get() = field
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Fucker")
        }

    var myModel: String = "M3"
        private set

    init {
        this.owner = "Tai"
    }
}

data class User(val id: Long, val name: String) // data class has to have at least 1 param


