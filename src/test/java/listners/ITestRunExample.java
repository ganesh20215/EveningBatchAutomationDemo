package listners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import rerunfailtestcases.IAnnotationTransformerExample;

//@Listeners({IAnnotationTransformerExample.class})

public class ITestRunExample {

   @Test
    public void test1(){
        System.out.println("test 1");
    }

   @Test
    public void test2(){
        System.out.println("test 2");
        Assert.assertTrue(false);
    }

   @Test
    public void test3(){
        System.out.println("test 3");
        Assert.assertTrue(false);
    }

   @Test
    public void test4(){
        System.out.println("test 4");
    }

   @Test
    public void test5(){
        System.out.println("test 5");
    }
}
