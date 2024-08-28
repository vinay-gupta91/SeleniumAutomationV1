package TestNGday8;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPractice2 {

    @Test
    @Parameters("soft")
    public void test1(String a){
        System.out.println("It is a software company" + a);
    }

    @Test
    @Parameters("auto")
    public void test2(String b){
        System.out.println("It is a automobile company" + b);
    }
}
