package im.hzw.kotlin01_basics

/**
 * 控制流
 *
 * @author : hzw
 * @mail : mail2him@qq.com
 * @date : 2019-10-10
 * @version : 1
 */

fun main() {

    //sample1()
    //sample2()
    //sample3()
    //sample4()
    sample5()
}


/**
 * IF 传统用法
 */
fun sample1() {
    val a = 1
    val b = 2
    var max = 2
    if (a < b) max = b
    println(max)
}

/**
 * IF 传统用法
 */
fun sample2() {
    val a = 1
    val b = 2
    if (a > b) {
        println(a)
    } else {
        println(b)
    }
}

/**
 * IF 作为表达式
 */
fun sample3() {
    val a = 1
    val b = 2
    var max = if (a > b) {
        a
    } else {
        b
    }
    println("max = $max")
}

/**
 * WHEN 表达式，类似 Java 的 Switch语句
 */
fun sample4() {
    var x = 3

    // 传统用法
    when (x) {
        1 -> println("Hey, You Win!")
        2 -> println("Sorry, You lose!")
        else -> {
            println("Error!")
        }
    }

    // 也可以多个分支放在一起
    when (x) {
        1, 2 -> println("You win!")
        else -> {
            println("You lose!")
        }
    }

    // 也可以作为表达式
    var y: Int = when (x) {
        1 -> 1
        2 -> 2
        else -> {
            0
        }
    }

    // 区间
    when (x) {
        in 1..10 -> println("x is in the range")
        !in 20..50 -> println("x is not in the range")
        else -> println("none of the above")
    }

    // 可以用来取代 if-else-if 链
    when {
        (x < 0) -> println("x less then zero")
        (x < 10) -> print("x less then ten")
        else -> print("x more then ten")
    }
}

/**
 * FOR 循环
 */
fun sample5() {
    // 遍历数组
    var numbers: IntArray = intArrayOf(1, 2, 3)
    for (it: Int in numbers) {
        println(it)
    }

    // 指定区间，[0,5]，包括0和5
    for (num: Int in 0..5) {
        println(num)
    }

    // 指定区间，[0,5)，包括0，不包括5
    for (num: Int in 0 until 5) {
        println(num)
    }

    // 倒序，并指定步差
    for (num: Int in 10 downTo 1) {

    }
}



