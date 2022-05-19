package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
    }

    @Test
    @Parameters({"value1", "value2"})
    public void test1(String value1, String value2) throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys(value1);
        Thread.sleep(3000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(value2);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
