import java.lang.IllegalArgumentException

fun main() {

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

