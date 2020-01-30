package testng;

import org.testng.annotations.Test;

/**
 * @author Yanzhan Gou
 * @date 2020-01-29 08:34:58
 */
public class ignoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 执行！");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行！");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行！");
    }


}
