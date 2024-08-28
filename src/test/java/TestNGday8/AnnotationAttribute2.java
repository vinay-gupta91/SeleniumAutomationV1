package TestNGday8;

import org.testng.annotations.Test;

public class AnnotationAttribute2 {

    @Test(groups = "mobile Loan")
    public void mobilePersonalLoan() {
        System.out.println("..Test1..");
    }
    @Test
    public void webPersonalLoan() {
        System.out.println("..Test2..");
    }
    @Test
    public void apiPersonalLoan() {
        System.out.println("..Test3..");
    }
    @Test (groups = "mobile Loan")
    public void mobileAutomobileLoan() {
        System.out.println("..Test4..");
    }
    @Test
    public void webAutomobileLoan() {
        System.out.println("..Test5..");
    }
    @Test
    public void apiAutomobileLoan() {
        System.out.println("..Test6..");
    }
}
