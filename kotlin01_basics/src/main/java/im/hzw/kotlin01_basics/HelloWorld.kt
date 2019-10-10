package im.hzw.kotlin01_basics

/**
 * Hello World
 *
 * @author : hzw
 * @mail : mail2him@qq.com
 * @date : 2019-10-10
 * @version : 1
 */


/**
 * Kotlin 程序入口是 main 函数
 */
fun main() {

    println("Hello World!")

    var a = 6
    var b = 7
    println("$a + $b = ${sum(a, b)}")
}


fun sum(a: Int, b: Int): Int {
    return a + b
}