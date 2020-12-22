package chapter02.section01

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/22 13:43
 */
class T04_RuntimeTest {
    @Test
    void test1(){
        //居然可以这样用，直接用groovy -v是不可以的。
        println 'cmd /C groovy -v'.execute().text
    }
}
