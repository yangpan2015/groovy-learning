package book.chapter05.section03

import org.junit.Test

/**
 * @author Pan Yang
 * @since 2020/12/23 15:32
 */
class MultiLineString {
    @Test
    void test0() {
        def data = 'mmmm'
        //三个双引号的字符串可以替换
        def sum0 = '''
                    asbcd dfdfdff
                    dfdfdf ${mmm}
                '''
        def sum1 = """
                    asbcd dfdfdff
                    dfdfdf ${data}
                """
        println(sum0)
        println(sum1)
    }
}
