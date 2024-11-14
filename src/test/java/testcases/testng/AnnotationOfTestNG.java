package testcases.testng;

import org.testng.annotations.*;

public class AnnotationOfTestNG {

    @BeforeMethod
    public void testforBefore(){
        System.out.println("This is Before Method");
    }

    @Test
    public void testcase_1(){
        System.out.println("Test Case 1");
    }

    @Test
    public void testcase_2(){
        System.out.println("Test Case 2");
    }

    @Test
    public void testcase_3(){
        System.out.println("Test Case 3");
    }


    @AfterMethod
    public void testforAfter(){
        System.out.println("This is After Method");
    }

    //Run Before Method of Class
    @BeforeClass
    public void beforeclasstestmethod(){
        System.out.println("Before Class Method");
    }
    //Runs after All Method
    @AfterClass
    public void Afterclasstestmethod(){
        System.out.println("After Class Method");
    }

}
