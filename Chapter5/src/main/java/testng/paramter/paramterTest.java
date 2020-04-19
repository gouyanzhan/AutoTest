package testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Yanzhan Gou
 * @date 2020-01-30 09:03:10
 */
public class paramterTest {
    @Test
    @Parameters({"name","age"})
    public void paramterTest1(String name,int age){

        System.out.println("name ="+ name +" ; age = " + age);

    }

}
