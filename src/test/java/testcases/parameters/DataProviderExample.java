package testcases.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name ="testCheck")
    public Object[][] testData() {

    return new Object[][]

            {
                    {"Java", "Delhi"}
                    ,
                    {"Selenium", "Mumbai"},
                    {"API Testing ", "Pune"}

            };
}

 @Test(dataProvider ="testCheck")
public void verifyGoogleSearch(String coursename, String Cityname) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    WebElement searchtextbox = driver.findElement(By.name("q"));
    searchtextbox.sendKeys(coursename, Cityname);
    searchtextbox.sendKeys(Keys.ENTER);
    Thread.sleep(3000);
    //driver.close();
}
}

