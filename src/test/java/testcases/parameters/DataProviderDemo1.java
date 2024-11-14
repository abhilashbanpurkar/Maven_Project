package testcases.parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class DataProviderDemo1 {
    WebDriver driver;

    @BeforeClass
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    void testLogin() {

    }

    @AfterClass
    void tearDown() {

    }
}