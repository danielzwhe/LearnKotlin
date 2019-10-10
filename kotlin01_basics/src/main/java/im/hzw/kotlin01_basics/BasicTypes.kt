package im.hzw.kotlin01_basics


/**
 * 基本类型
 *
 * @author : hzw
 * @mail : mail2him@qq.com
 * @date : 2019-10-10
 * @version : 1
 */

fun main() {

    numbers()
    arrays()
}

/**
 * 数字
 */
fun numbers() {
    var byte: Byte = 127
    var short: Short = 32767
    var int: Int = 1000
    var long: Long = 100000
    var money: Float = 1234.12f
    var bigAmount: Double = 1234556.123
    var balance: Double = 22334455.123
}

/**
 * 数组
 */
fun arrays() {
    println("声明的同时初始化")
    var floatNumbers: FloatArray = floatArrayOf(10.1f, 10.3f, 20.5f)
    floatNumbers.forEach { println(it) }

    println("先声明，后赋值")
    var array2: IntArray = IntArray(5)
    for (i: Int in 0 until array2.size) {
        array2[i] = i
    }
    array2.forEach { println(it) }

    println("通过表达式初始化")
    var asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

}
