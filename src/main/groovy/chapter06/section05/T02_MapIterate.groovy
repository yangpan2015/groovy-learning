package chapter06.section05

import org.junit.Test

import java.time.Period

/**
 * @author Pan Yang
 * @since 2020/12/24 21:52
 */
class T02_MapIterate {
    def map = [abc: 'abc1', mnt: 'bcd1', 'C++': 'aaa2']

    /**
     * 1个参数会传entry
     */
    @Test
    void test1() {
        map.each {
            e -> println("${e.key} -> ${e.value}")
        }
    }

    /**
     * 两个参数会赋值key和value
     * collect() find()也是这样1个参数就传的entry，两个参数就传key value。
     */
    @Test
    void test2() {
        map.each {
            key, value -> println("${key} -> ${value}")
        }
    }
    /**
     * Map的collect方法返回1个List
     */
    @Test
    void test3() {
        println(map.collect {
            key, value -> value
        }.reverse())
    }
    /**
     * find 和 findAll
     */
    @Test
    void test4() {
        def data = map.collect { key, value ->
            value
        }.find { it.startsWith('a') }
        println(data)

        println('-----------------------------')
        //findAll
        def data1 = map.collect { key, value ->
            value
        }.findAll({ it.startsWith('a') })
        println(data1)
    }

    @Test
    void test5(){
        abc=new Object()
    }
}
