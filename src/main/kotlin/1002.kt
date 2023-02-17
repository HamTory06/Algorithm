import java.util.Scanner
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    var max = 0
    var min = 0
    val array = Array(t) {Array(6){0}} //2차원 배열 초기화
    for(i in 0 until t){
        for(j in 0 until 6){
            array[i][j] = sc.nextInt() //2차원 배열 입력
        }
    }
    for(i in 0 until t){
        val a = array[i][2] + array[i][5] //조규현와 류재명, 백승환와 류재명 거리의 합
        val b = distance(plusorminus(array[i][0],array[i][3]),plusorminus(array[i][1],array[i][4])) //조규현과 백승환의 거리
        if(array[i][2] < array[i][5]){
            max = array[i][5]
            min = array[i][2]
        } else {
            max = array[i][2]
            min = array[i][5]
        }
        if(max > b+min)
            println(0)
        else
            println(getananswer(a,b))
    }
}

fun distance(x: Int, y: Int): Int{
//    println("x: $x y: $y")
    val a = x.toDouble().pow(2) + y.toDouble().pow(2)
    return sqrt(a).toInt()
}

fun plusorminus(a: Int, b: Int): Int{
    return if(a>=0 && b>=0){
        abs(a-b)
    } else if(a<=0 && b<=0){
        abs(a+b)
    } else {
        abs(a); abs(b)
        abs(a+b)
    }
}

//a는 조규현와 류재명, 백승환와 류재명 거리의 합
//b는 조규현과 백승환의 거리
fun getananswer(a: Int, b: Int): Int{
    return if(a == b){
        1
    } else if(a > b){
        2
    } else {
        0
    }
}
