package chapter02.section01

import org.junit.Test

/**
 * 可以使用this来引用静态方法的class对象
 *
 * @author Pan Yang
 * @since 2020/12/22 14:10
 */
class T07_StaticTest {
    static class A01 {
        def static f01() {
            println '01'
            this
        }

        def static f02() {
            println '02'
            this
        }
    }

    @Test
    void test01() {
        A01.f01().f02()
    }
}
