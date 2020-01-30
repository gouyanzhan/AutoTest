package testng.groups;

import org.testng.annotations.Test;

/**
 * @author Yanzhan Gou
 * @date 2020-01-29 09:27:45
 */
@Test(groups = "teacher")
public class groupsOnClass3 {
    public void teacher1(){
        System.out.println("groupsOnClass3中的teacher1运行");
    }
    public void teacher2(){
        System.out.println("groupsOnClass3中的teacher2运行");
    }

}
