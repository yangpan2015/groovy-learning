package book.chapter06.section01

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/23 18:17
 */
class T04_ListOtherMethods {
    def list = [1, 2, 3, 4, 5]

    @Test
    void test3() {
        def myList = ['hello', 'world']
        println(myList.collect { it.length() }.sum())
    }

    @Test
    void test4() {
        println(list.join(' '))
        println(list.join(','))
    }
    /**
     * 如果join有null的处理
     */
    @Test
    void test5() {
        def myList = ['abcd', null, 'efg']
        println(myList.join(','))
    }

    /**
     * 想过滤null呢。目前不知道怎么用filter
     */
    @Test
    void test6() {
        def myList = ['abcd', null, 'efg']
        println(myList.collect({ it != null && '' != it }) )
    }
}
