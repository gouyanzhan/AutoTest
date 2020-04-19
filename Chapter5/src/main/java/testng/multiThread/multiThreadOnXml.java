package testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author Yanzhan Gou
 * @date 2020-02-03 12:36:04
 */
public class multiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }

}
