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
        if(b < array[i][2] || b < array[i][5]){ //내접
            if(array[i][0] == array[i][3] && array[i][1] == array[i][4] && array[i][2] == array[i][5]){
                println(-1)
            } else if(b < abs(array[i][2] - array[i][5])){
                println(0)
            } else if(b == abs(array[i][2] - array[i][5])){
                println(1)
            }
        } else { //외접
            if(b == a){
                println(1)
            } else if(b > a){
                println(0)
            } else{
                println(2)
            }
        }
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