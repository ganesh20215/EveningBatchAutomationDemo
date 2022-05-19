package testng.extendsreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExtendsReportsExample {

    ExtentReports report = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("EveningBatchReport.html");
    ExtentTest test;

    @BeforeTest
    void beforeTest(){
        report.attachReporter(spark);
    }

    @Test
    public void verifyReport1(){
        test = report.createTest("Launch the browser").assignAuthor("Ravi").assignDevice("chrome");
        test.info("User is opening the browser");
        System.out.println("Hiiiii Method 1");
        test.pass("your test is passed");
    }

    @Test
    public void verifyReport2(){
        SoftAssert softAssert = new SoftAssert();
        test = report.createTest("Launch the browser").assignAuthor("Akshay").assignDevice("Firefox");
        test.info("User is opening the browser");
        System.out.println("Hiiiii Method 2");
        softAssert.assertEquals("Ganesh", "Test", "The Value should be match");
        test.fail("your test is failed");
        softAssert.assertAll();
    }

    @Test
    public void verifyReport3(){
        test = report.createTest("Launch the browser").assignAuthor("Sneha").assignDevice("Edge");
        test.info("User is opening the browser");
        System.out.println("Hiiiii Method 3");
        test.pass("your test is passed");
    }

    @AfterTest
    void reportClosed(){
        report.flush();
    }
}
