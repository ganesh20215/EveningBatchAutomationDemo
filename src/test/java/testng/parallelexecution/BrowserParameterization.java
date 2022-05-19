package testng.parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserParameterization {
    WebDriver driver;

//    @BeforeMethod
//    @Parameters({"browser"})
//    void beforeMethod(String browser) {
//        switch (browser) {
//            case "chrome":
//                System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
//                driver = new ChromeDriver();
//                break;
//            case "firefox":
//                System.setProperty("webdriver.gecko.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//                driver = new FirefoxDriver();
//                break;
//            case "edge":
//                System.setProperty("webdriver.edge.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//                driver = new EdgeDriver();
//                break;
//            default:
//                System.out.println("please select correct browser");
//                break;
//        }
//    }

    @Test
    @Parameters({"value1", "value2"})
    public void test1(String value1, String value2) throws InterruptedException {
        driver.get("https://courses.letskodeit.com/practice");
        driver.findElement(By.id("name")).sendKeys(value1);
        Thread.sleep(3000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(value2);
        Thread.sleep(3000);
    }
}
