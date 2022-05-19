package testng.priority;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 5, groups = "smoke")
    public void testA(){
        System.out.println("Test A");
    }

    @Test(priority = 4)
    public void testD(){
        System.out.println("Test D");
    }

    @Test(priority = 2)
    public void testB(){
        System.out.println("Test B");
    }

    @Test(priority = 3, groups = "p1")
    public void testC(){
        System.out.println("Test C");
    }

    @Test(groups = "smoke")
    public void testZ(){
        System.out.println("Test Z");
    }
}
