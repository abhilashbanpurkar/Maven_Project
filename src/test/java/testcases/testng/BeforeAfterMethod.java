package testcases.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
    public static WebDriver driver;

    @BeforeMethod
    public void preRequisite() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testCheckForFacebook() {
        driver.get("https://www.flipkart.com/");
    }
    @Test
    public void testCheckForAmazon() {
        driver.get("https://www.Amazon.in/");
    }
    @Test
    public void testCheckForgoogle() {
        driver.get("https://www.google.com/");
    }

    @AfterMethod
    public void postRequisite() {
        driver.close();

    }
}