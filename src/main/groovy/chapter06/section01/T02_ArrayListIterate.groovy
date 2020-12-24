package chapter06.section01

import org.junit.Test

/**
 * ArrayList迭代
 * @author Pan Yang
 * @since 2020/12/23 17:57
 */
class T02_ArrayListIterate {
    def list = [1, 2, 3, 4, 5]

    @Test
    void test1() {
        list.each { println(it) }
    }

    @Test
    void test2() {
        int sum = 0
        list.each { sum += it }
        println(sum)
    }

    @Test
    void test3() {
        def doubled = []
        list.each {
            doubled << it * 2
        }
        println(doubled)
    }
    /**
     * collect方法
     */
    @Test
    void test4() {
        println(list.collect({ it * 2 }))
    }
}
