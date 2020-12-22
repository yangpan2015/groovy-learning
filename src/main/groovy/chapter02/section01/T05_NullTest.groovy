package chapter02.section01

import org.junit.Test

/**
 * ?预防空指针
 *
 * @author Pan Yang
 * @since 2020/12/22 13:51
 */
class T05_NullTest {
    @Test
    void test0() {
        A01 a = null;
        A01 b = new A01()
        //预防空指针
        a?.foo();
        b?.foo();
    }

    static class A01 {
        def foo() {
            println 'hello'
        }
    }
}
