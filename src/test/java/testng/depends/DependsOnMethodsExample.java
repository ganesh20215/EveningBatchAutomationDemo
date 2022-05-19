package testng.depends;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsExample {

    @Test(groups = "smoke")
    public void dependsExample1(){
        String s = "Ganesh";
        System.out.println("Depends on methods 1");
//        Assert.assertEquals(s, "Test", "should be match");
    }

    @Test(dependsOnGroups = "smoke")
    public void dependsExample2(){
        System.out.println("Depends on methods 2");
    }

    @Test(dependsOnGroups = "smoke", enabled = false)
    public void dependsExample3(){
        System.out.println("Depends on methods 3");
    }


    @Test(dependsOnMethods = "dependsExample1", alwaysRun = true)
    public void dependsExample4(){
        System.out.println("Depends on methods 4");
    }

    @Test(dependsOnMethods = "dependsExample1")
    public void dependsExample5(){
        System.out.println("Depends on methods 5");
    }
}
