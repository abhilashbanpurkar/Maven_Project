package testcases.testng.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifyTestMethod(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Assert.assertEquals(driver.getTitle(),"facebook","Title should be Match");
        Assert.assertTrue(driver.findElement(By.id("login1")).isDisplayed(),"Username Textbox Should be Displayed");
        System.out.println("Good Morning");
    }
}
