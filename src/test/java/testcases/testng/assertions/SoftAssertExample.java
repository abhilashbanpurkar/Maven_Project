package testcases.testng.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void verifyTestMethod(){
        WebDriver driver = new ChromeDriver();
        // We have create Object for Soft Assert
        SoftAssert sf = new SoftAssert();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //Soft Assert will Continue even if Condition Fails
        sf.assertEquals(driver.getTitle(),"facebook","Title should be Match");
        sf.assertTrue(driver.findElement(By.id("login1")).isDisplayed(),"Username Textbox Should be Displayed");
        sf.assertAll();
        System.out.println("Good Morning");
    }
}


