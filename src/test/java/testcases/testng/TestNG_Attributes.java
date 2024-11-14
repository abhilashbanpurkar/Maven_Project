package testcases.testng;

import org.testng.annotations.Test;

public class TestNG_Attributes {

    // will get Exception ThreadtimeOut Exception
    @Test (invocationCount = 10000, invocationTimeOut = 2)
    public void testMethodAttributes(){
        System.out.println("Test Method Attributes");
    }
}
