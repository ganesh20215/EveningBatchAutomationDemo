package testng.exception;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExpectedExceptionExample {

    @Test(expectedExceptions = {ArithmeticException.class},groups = "smoke")
    public void exceptionExample1(){
        System.out.println(10/0);
        System.out.println("Hiiiiiiii");
    }

    @Test(expectedExceptions = {IOException.class})
    public void exceptionExample2() throws Exception{
        throw new IOException();
    }

    @Test(expectedExceptions = {IOException.class, NullPointerException.class})
    public void exceptionExample3() throws Exception{
        throw new Exception();
    }

    @Test(expectedExceptions = {NullPointerException.class})
    public void exceptionExample4(){
        String s = null;
        System.out.println(s.length());
    }
}
