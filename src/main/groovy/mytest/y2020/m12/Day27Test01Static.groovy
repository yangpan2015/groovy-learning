package mytest.y2020.m12

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/27 9:27
 */
class Day27Test01Static {
    /**
     * 看了下class文件编译会编译成public static final
     */
    static final DATA = [a: 'hehe']

    @Test
    void test0() {
        println(DATA['a'])
    }
}
