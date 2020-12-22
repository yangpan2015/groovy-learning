package chapter02.section01

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/22 13:58
 */
class T06_ExceptionHandling {
    @Test
    void test1() {
        //就是不需要强制捕获Java中的受检异常。
        new FileInputStream("d:/abcd.txt")
    }

    @Test
    void test2() {
        try {
            //就是不需要强制捕获Java中的受检异常。
            new FileInputStream("d:/abcd.txt")
            //可以处理自己关心的异常
        } catch (FileNotFoundException ex) {
            println 'file not found:' + ex
            //只能捕获Exception 不能捕获Error和Throwable
        } catch (ex) {
            throw new RuntimeException(ex)
        }
    }
}
