fun main(){
    try {
        println("Введите числа x, y, m, n")
        var x = readLine()!!.toDouble()
        var y = readLine()!!.toDouble()
        var m = readLine()!!.toDouble()
        var n = readLine()!!.toDouble()
        var xy = (x-y)
        var mn = (m/n)
        if (xy>mn){
            x++
            println("Число x =" + x)
        }
        else
            println("расность x и y не больше остатка от деления m и n")
        println(mn)
    }catch (e:Exception){
        println("Введен символ")
    }
}