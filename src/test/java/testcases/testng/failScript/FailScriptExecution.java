package testcases.testng.failScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailScriptExecution {


    @Test

    public void testcase_1(){
        System.out.println("Test Case 1");
    }

    @Test
    public void testcase_2(){
        Assert.assertTrue(false);
        System.out.println("Test Case 2");
    }
@Test
    public void testcase_3(){
        System.out.println("Test Case 3");
    }

@Test
    public void testcase_4(){
        System.out.println("Test Case 4");
    }





}
