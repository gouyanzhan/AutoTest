package extendDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author Yanzhan Gou
 * @date 2020-02-05 09:52:58
 */
public class TestMethodsDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaa","aa");
    }

    public void logDemo(){
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我自己的运行时异常");
    }

}
