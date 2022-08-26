package testng.annoration;

import org.testng.annotations.*;

public class AnnotationExample {
    @BeforeClass
    public void runBeforeClass(){
        System.out.println("Run Before class");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    @BeforeMethod
    public void runBefore(){
        System.out.println("Before Method is running");
    }

    @Test(groups = "smoke")
    public void runFirstMethod1() {
        System.out.println("run First Method 1");
    }

    @Test
    public void runFirstMethod2() {
        System.out.println("run First Method 2");
    }

    @AfterMethod
    public void runAfter(){
        System.out.println("After Method is running");
        System.out.println("Hello Good Morning");
        System.out.println("Hello Good Morning");
    }

    @AfterClass
    public void runAfterClass(){
        System.out.println("Run After class");
    }
}
