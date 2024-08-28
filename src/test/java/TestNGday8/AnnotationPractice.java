package TestNGday8;

import org.testng.annotations.*;

public class AnnotationPractice {

    @BeforeSuite
    public void dog() {
        System.out.println("before suit");
    }
    @BeforeClass
    public void elephant() {
        System.out.println("before class");
    }
    @Test
    public void apple() {
        System.out.println("..Test7.next class.");
    }
    @BeforeTest
    public void cat() {
        System.out.println("before test");
    }
    @Test
    public void parrot() {
        System.out.println("..Test8..next class.");
    }
    @BeforeMethod
    public void fish() {
        System.out.println("before every method");
    }

}
