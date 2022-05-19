package testng.annoration;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 1, invocationTimeOut = 20)
    public void invocationCountMethod() {
        System.out.println("run First Method 1");
    }

    @Test(description = "This test is an example of the description",groups = "smoke")
    public void descriptionExample() {
        System.out.println("run First Method 1");
    }
}
