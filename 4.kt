import kotlin.math.min
import kotlin.math.max
import kotlin.math.sqrt
import kotlin.math.pow

fun main(){
    try {
        println("Введите три числа a, b, c")
        var a = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()
        var c = readLine()!!.toDouble()
        var p =0!!.toDouble()
        var min1 = min(a, b)
        var min =  min(min1, c)
        var max1 = max(a, b)
        var max = max(max1, c)
        p += (min + max) / 2
        println(p)
    }
    catch (e:Exception) {
        println("Введен символ")
    }
}