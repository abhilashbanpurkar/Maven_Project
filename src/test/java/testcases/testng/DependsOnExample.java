package testcases.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnExample {

    @Test
    public void verifylogin(){
        Assert.assertTrue(false,"Login verification failed");
        System.out.println("Verify Login");
    }
    @Test(dependsOnMethods = "verifylogin")
    public void verifyTransaction(){
        System.out.println("Verify Transaction");
    }

    @Test(dependsOnMethods = "verifylogin")
    public void onboardNewUser(){
        System.out.println("Verify  of New User");
    }
}
