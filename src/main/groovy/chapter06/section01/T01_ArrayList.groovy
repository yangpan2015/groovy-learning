package chapter06.section01

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/23 17:32
 */
class T01_ArrayList {
    /**
     * 创建List
     */
    @Test
    void test01() {
        def list = [1, 2, 3, 4, 5]
        println(list)
        println(list.getClass().name)
    }

    @Test
    void test02() {
        def list = [1, 2, 3]
        println(list[0])
        println(list.size())
        //下标可以为负数，-1表示最后1个。
        println(list[-1])
    }
    /**
     * Range对象0..2
     */
    @Test
    void test03() {
        def data = [1, 2, 3, 4, 5]
        //获取的是下标为a到下标为b的所有元素，并且包括下标a的元素，包括下标为b的元素。
        println(data[2..3])
        //可以通过range对象来获取子list
        println(data[2..3].getClass().name)
        //下标也可以为负数，而且可以逆序下面输出[5,4,3]
        println(data[-1..-3])
        //下面输出[3,4,5]
        println(data[-3..-1])
    }
    /**
     * range对象下标得到的并非副本
     */
    @Test
    void test04() {
        def data = [1, 2, 3, 4, 5]
        def subList = data[0..2]
        //[1,2,3]
        println(subList)
        data[1] = 3

        //这是为什么，为什么重新创建1个data[0..2]之后，它值就变了。
        //[1,2,3]
        println(subList)
        //[1,3,3]
        println(data[0..2])
        println(data)
    }
}
