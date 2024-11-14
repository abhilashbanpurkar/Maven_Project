package testcases.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicsOfTestNG {

   @Test
    public void testforedso(){

       WebDriver driver =new ChromeDriver();
       driver.get("https://edso.in/");
       driver.manage().window().maximize();
   }
    @Test
    public void testforflipkart(){

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

    }

}
