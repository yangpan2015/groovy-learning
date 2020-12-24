package chapter06.section05

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/24 21:52
 */
class T02_MapIterate {
    def map = [abc: 'abc1', mnt: 'bcd1', 'C++': 'aaa']

    @Test
    void test1() {
        map.each {
            e -> println("${e.key} -> ${e.value}")
        }
    }
}
