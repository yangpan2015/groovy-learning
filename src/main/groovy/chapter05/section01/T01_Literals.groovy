package chapter05.section01

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/23 13:28
 */
class T01_Literals {
    /**
     * 双引号可以放到字符串中
     */
    @Test
    void test0() {
        println 'helle,"pan"'
    }

    @Test
    void test1() {
        println('abc'.class.name)
        println("abc".class.name)
    }
    /**
     * 单引号字符串是纯粹的字面量
     * 双引号字符串则会求值
     */
    @Test
    void test2() {
        def abc = 'mmm'
        println('$abc')
        //要怎么分割
        println("$abc")
        //没有这个属性会抛异常
        //println("$abcd")
        //可以用大括号括起来
        println("${abc}d")
    }

    @Test
    void test3() {
        def abcd = ''
        def abcd2 = null
        //打印1个空的字符串
        println("$abcd")
        //null就打印1个字符串null。
        println("$abcd2")
    }
    /**
     * 正斜杠或者双引号创建表达式，一般双引号定义字符串表达式，正斜杠属于正则表达式
     */
    @Test
    void test4(){
        def abcd='aaaaaa'
        println(/$abcd/)

        //双引号中字符串$需要转义
        def money=12
        println("abcd \$${money}")
    }

    @Test
    void test5(){
        def str='hello'
        println(str[4])
    }

}
