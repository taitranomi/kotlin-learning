package my.demo

import java.util.Collections.shuffle

/**
 * R-1.10
 */
class Flower constructor(name: String, petals: Int, price: Float) {
    val name: String = name

    var petals: Int = petals

    var price: Float = price
}

/**
 * C-1.19
 */
fun divideTwo(num: Int): Int {
    var i:Int = num
    var c:Int = 0

    if(i < 2) {
        println("This number can't be lower than 2")
    }
    else {

        while((i/2) >= 1) {
            i = i/2
            c++
        }
    }

    return c
}

/**
 * C-1.20
 */
fun differentFloatNumber(fList: FloatArray): String {
    var i:Float = fList[0]
    val noRepeating:String = "No Fucking repeating"
    val repeating:String = "Oh shit!!!"

    for(x in 1..fList.size - 1) {
        if(fList[x] == i) {
            return repeating
        }
        else{
            i = fList[x]
        }
    }

    return noRepeating
}

/**
 * C-1.21
 */
fun randomArray(intList: MutableList<Int>): MutableList<Int> {
    shuffle(intList)

    return intList
}



fun main() {
    val floatList: FloatArray = floatArrayOf(1.1f, 1.1f)
    val intList = listOf(2,3,4).toMutableList()
    println(floatList.size)
    println(differentFloatNumber(floatList))
    println(randomArray(intList))

    val x = 'a'
    val y = 't'

    println("$x $y")

}