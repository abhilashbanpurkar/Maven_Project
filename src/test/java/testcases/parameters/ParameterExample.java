package testcases.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

    public static WebDriver driver;
    @Parameters("browserName")

    @BeforeMethod
    public void setUp(String browserName) {
        if (browserName.equalsIgnoreCase("Chrome")) {
            WebDriver driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriver driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriver driver = new EdgeDriver();
        }
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
@Parameters({"coursename","Cityname"})
    @Test
    public void verifyGoogleSearch(String coursename ,String Cityname) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchtextbox = driver.findElement(By.name("q"));
        searchtextbox.sendKeys(coursename,Cityname);
        searchtextbox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        //driver.close();
    }
}
