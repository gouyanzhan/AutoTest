package testng.groups;

import org.testng.annotations.Test;

/**
 * @author Yanzhan Gou
 * @date 2020-01-29 09:27:29
 */
@Test(groups = "stu")
public class groupsOnClass2 {
        public void stu1(){
            System.out.println("groupsOnClass2中的stu1运行");
        }
            public void stu2(){
                System.out.println("groupsOnClass2中的stu2运行");
            }

}
