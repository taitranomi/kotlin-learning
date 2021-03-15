fun main() {
    var autom = Automobile("X5", "bmw");
    var eAutom = ElectricCar("X5", "bmw", 85.0);

    eAutom.drive(5.0)
    println(autom.avgSpeed)
}

abstract class Vehicle {
    abstract val type: String
    abstract val avgSpeed: Double

}

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake()
}

open class Automobile(val name: String, val brand: String): Drivable, Vehicle() {
    var range: Double = 0.0

    fun extendRange(amount: Double) {
        if(amount > 0)
            range += amount
    }

    open fun drive(distance: Double) {
        println("Drive for $distance KM")
    }

    override val avgSpeed: Double = 25.0

    override val type: String = "Car"

    override val maxSpeed: Double
        get() = 200.0

    override fun drive(): String {
        return "Motherfucker"
    }

    override fun brake() {
        println("Yoo brother")
    }
}

class ElectricCar(name: String, brand: String, batteryLife: Double) : Automobile(name, brand) {
    override fun drive(distance: Double) {
        println("E-Car Drive for $distance KM")
    }
}


