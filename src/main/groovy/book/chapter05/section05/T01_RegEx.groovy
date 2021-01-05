package book.chapter05.section05

import org.junit.Test

/**
 * 将~应用于String会创建一个Pattern实例
 * @author Pan Yang
 * @since 2020/12/23 15:50
 */
class T01_RegEx {
    @Test
    void test0() {
        def object = ~"hello"
        println(object.class.name)
    }

    @Test
    void test1() {
        //创建的正则表达式不用\\转义
        def object = ~/\d*\w*/
        println(object.class.name)
    }

    /**
     * =~返回1个matcher对象
     */
    @Test
    void test2() {
        println('abc' =~ ~/^\w{3}$/.class.name)
        if ('abc' =~ ~/^\w{3}$/) {
            println('matched')
        }
    }
    @Test
    void test3(){
        println ~/^\w.*/
    }
}
