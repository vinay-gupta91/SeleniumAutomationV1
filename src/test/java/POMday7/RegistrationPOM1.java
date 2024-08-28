package POMday7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPOM1 {

    WebDriver driver;
    RegistrationPOM1(WebDriver d){
        driver =d;
    }
    By FirstName = By.name("firstName");
    By LastName = By.name("lastName");
    By Phone = By.xpath("//input[@name=\"phone\"]");
    By Email = By.cssSelector("input#userName");
    By Address = By.name("address1");
    By City = By.name("city");
    By State = By.name("state");
    By PostalCode = By.name("postalCode");
    By Country = By.xpath("//select[@name=\"country\"]");
    By UserName = By.id("email");
    By Password = By.name("password");
    By ConfirmPassword = By.name("confirmPassword");
    By Submit = By.name("submit");

    public void setFirstName(String FstName){
        driver.findElement(FirstName).sendKeys(FstName);
    }
    public void setLastName(String lstName){
        driver.findElement(LastName).sendKeys(lstName);
    }
    public void setPhone(String phnNo){
        driver.findElement(Phone).sendKeys(phnNo);
    }
    public void setEmail(String mail){
        driver.findElement(Email).sendKeys(mail);
    }
    public void setAddress(String adrs){
        driver.findElement(Address).sendKeys(adrs);
    }
    public void setCity(String cty){
        driver.findElement(City).sendKeys(cty);
    }
    public void setState(String state){
        driver.findElement(State).sendKeys(state);
    }
    public void setPostalCode(String pstlcod){
        driver.findElement(PostalCode).sendKeys(pstlcod);
    }
    public void setCountry(String cntry){
        WebElement country = driver.findElement(Country);
        Select option = new Select(country);
        option.selectByVisibleText(cntry);
    }
    public void setUserName(String usrname){
        driver.findElement(UserName).sendKeys(usrname);
    }
    public void setPassword(String pswrd){
        driver.findElement(Password).sendKeys(pswrd);
    }
    public void setConfirmPassword(String cnfrmPswrd){
        driver.findElement(ConfirmPassword).sendKeys(cnfrmPswrd);
    }
    public  void clickSubmit(){
        driver.findElement(Submit).click();
    }



}
