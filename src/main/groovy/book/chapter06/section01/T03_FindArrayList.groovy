package book.chapter06.section01

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/23 18:06
 */
class T03_FindArrayList {
    def list = [1, 2, 3, 4, 5]

    @Test
    void test1() {
        println(list.find { it == 3 })
        //第一个就不等于3，所以返回第一个
        println(list.find { it != 3 })
    }

    @Test
    void test2() {
        println(list.findAll({ it > 2 }))
    }

}
