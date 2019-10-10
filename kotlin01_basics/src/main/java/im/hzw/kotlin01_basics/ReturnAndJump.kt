package im.hzw.kotlin01_basics

/**
 * 返回与跳转
 *
 * @author : hzw
 * @mail : mail2him@qq.com
 * @date : 2019-10-10
 * @version : 1
 */

class ReturnAndJump {

    /**
     * RETURN，返回 Int
     */
    fun sample1(): Int {
        return 1
    }

    /**
     * 使用标签返回
     */
    fun sample2() {

        println("Start loop")
        loopHere@for (num: Int in 1..100) {
            // ba la ba la
            if (num > 50) {
                println("perform break expression")
                break@loopHere
            }
        }
    }
}

fun main() {
    var obj: ReturnAndJump = ReturnAndJump()

    var num1: Int = obj.sample1()

    obj.sample2()
}

