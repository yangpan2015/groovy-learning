package book.chapter02.section02

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/22 14:16
 */
class GroovyCarTest {
    static class GroovyCar {
        def miles = 0
        final year

        GroovyCar(year) {
            this.year = year
        }
    }


    @Test
    void test01() {
        GroovyCar groovyCar = new GroovyCar(100)
        println "$groovyCar.year"
        groovyCar.miles = 1800
        println "$groovyCar.miles"


    }

    @Test
    void test02() {
        //能不能这样呢?
        GroovyCar groovyCar1 = null
        //这个地方会报空指针
        println "$groovyCar1.miles"
    }

    @Test
    void test03() {
        //能不能这样呢?
        GroovyCar groovyCar1 = new GroovyCar(100)
        //双引号里面用?.不是想象中如果groovyCar1为null就什么都不打印或者其他怎么处理，如果groovyCar1不为null就直接打印
        //就是双引号里面不能这样用
        println "$groovyCar1?.miles"
    }
}
