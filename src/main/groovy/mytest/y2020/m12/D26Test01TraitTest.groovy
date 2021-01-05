package mytest.y2020.m12

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/26 22:32
 */
class D26Test01TraitTest {
    static trait Swimming{
        def swim(){
            println('i can swim')
        }
    }
    static trait Fly{
        def fly(){
            println('i can fly')
        }
        //trait中的this关键字代表了trait的实现的实例
        def printClassName(){
            println("class name is :${this.getClass().name}")
        }
    }
    class SpecialAirplane implements Swimming,Fly{

    }
    @Test
    void test0(){
        //感觉像多从继承。
        def plane= new SpecialAirplane()
        plane.fly()
        plane.swim()
        plane.printClassName()
    }
}
