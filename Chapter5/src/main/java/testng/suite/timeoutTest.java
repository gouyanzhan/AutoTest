package testng.suite;

import org.testng.annotations.Test;

/**
 * @author Yanzhan Gou
 * @date 2020-02-04 12:05:19
 */
public class timeoutTest {
    @Test(timeOut = 3000) //单位为毫秒值
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException{
        Thread.sleep(3000);
    }

}
