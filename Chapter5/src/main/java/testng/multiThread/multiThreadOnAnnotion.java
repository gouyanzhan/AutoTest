package testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author Yanzhan Gou
 * @date 2020-02-03 12:37:13
 */
public class multiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }

}
