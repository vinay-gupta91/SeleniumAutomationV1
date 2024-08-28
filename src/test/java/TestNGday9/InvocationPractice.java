package TestNGday9;

import org.testng.annotations.Test;

public class InvocationPractice {

    @Test(invocationCount = 3)
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test
    public void test12(){
        System.out.println("This is test 2");
    }
}
