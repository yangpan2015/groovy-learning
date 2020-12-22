package chapter02.section01

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/22 11:04
 */
class T03_WaysToLoop {
    static void main(String[] args) {
        //Integer可以有这些函数
        0.upto(2, { println 'ho ' })
        println 'world'
    }
    //Integer 方法测试
    @Test
    void integerMethodTest() {
    }
    /**
     * $it 返回的是索引值
     */
    @Test
    void testIt() {
        3.times {
            //这个地方用'$it'不行，目前原因不明，只有双引号的"$it"才可以替换
            println "$it"
        }
    }
    /**
     * 测试step
     */
    @Test
    void testStep() {
        2.step(10, 3, {
            println "$it"
        })
    }

    /**
     * 重写greeting
     */
    @Test
    void testGreeting() {
        3.times {
            println 'ho '
        }
        println 'groovy'
    }
}
