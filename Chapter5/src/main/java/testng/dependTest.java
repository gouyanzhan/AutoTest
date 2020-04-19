package testng;

import org.testng.annotations.Test;

/**
 * @author Yanzhan Gou
 * @date 2020-01-30 08:55:19
 */
public class dependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

}
