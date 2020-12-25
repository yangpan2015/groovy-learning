package chapter06.section05

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/24 21:41
 */
class T01_Map {
    /**
     * 定义map，默认为LinkedHashMap
     * 这个地方的C++必须有单引号
     */
    def map = [abc: 'abc1', mnt: 'bcd1', 'C++': 'aaa']

    @Test
    void test0() {
        println(map)
        println(map.getClass().name)
    }
    /**
     * []来访问值
     */
    @Test
    void test1() {
        //这个地方abc必须加单引号
        println(map['abc'])
    }

    /**
     * 通过.来访问值
     * 这儿就是说明了一个问题，不能使用map.class来访问Class对象，因为map.class表示的意思是从map中查找键为class的值。
     */
    @Test
    void test2() {
        println(map.abc)
        //可以这样访问
        println(map.'C++')
    }
}

