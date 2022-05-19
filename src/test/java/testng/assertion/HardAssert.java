package testng.assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {

    @Test
    public void verifyAssertion(){
        String s = "Digital";
        SoftAssert softAssert = new SoftAssert();
        System.out.println("hiiiii");
        softAssert.assertEquals("Ganesh", "Ganesh", "Ganesh String should match");
        System.out.println("hiiiii");
        System.out.println("hiiiii");
        System.out.println("hiiiii");
        softAssert.assertFalse(s.contains("Ganesh"), "s contains Digital");
        softAssert.assertAll();
    }

    public void add(int c, int d){
        int a =c;
        int b =d;
        System.out.println(a+b);
    }
}
