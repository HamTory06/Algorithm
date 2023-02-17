import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    var n = Array<Int>(t){0}
    for(i in 0 until t){
        n[i] = sc.nextInt()
    }
}