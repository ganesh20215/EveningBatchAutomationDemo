package testng.parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecution {

    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

    @Test
    public void test1() {
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "google");
    }

//    @Test
//    public void test2() {
//        System.out.println(driver.getTitle());
//    }
//
//    @Test
//    public void test3() {
//        System.out.println(driver.getTitle());
//    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
