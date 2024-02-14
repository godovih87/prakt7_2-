fun main(){
    try {
        println("Введите числа x и y")
        var x = readLine()!!.toDouble()
        var y = readLine()!!.toDouble()
        when{
            (x>0&&y>0)-> println("В 1 четверти")
            (x<0&&y>0)-> println("В 2 четверти")
            (x<0&&y<0)-> println("В 3 четверти")
            (x>0&&y<0)-> println("В 4 четверти")
            else-> println("В начале координат")
        }
    }catch (e:Exception){
        println("Введен символ")
    }
}