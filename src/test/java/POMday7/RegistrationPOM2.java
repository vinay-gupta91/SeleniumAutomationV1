package POMday7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPOM2 {

    WebDriver driver;
    RegistrationPOM2(WebDriver d){
        driver =d;
        PageFactory.initElements(d, this);
    }

    @FindBy(name = "firstName")  WebElement FirstName;
    @FindBy(name = "lastName" ) WebElement LastName;
    @FindBy(xpath = "//input[@name=\"phone\"]" ) WebElement Phone;
    @FindBy(css = "input#userName") WebElement Email;
    @FindBy(name = "address1") WebElement Address;
    @FindBy(name = "city" ) WebElement City;
    @FindBy(name = "state" ) WebElement State;
    @FindBy(name = "postalCode" ) WebElement PostalCode;
    @FindBy(xpath = "//select[@name=\"country\"]") WebElement Country;
    @FindBy(id = "email") WebElement UserName;
    @FindBy(name = "password") WebElement Password;
    @FindBy(name = "confirmPassword") WebElement ConfirmPassword;
    @FindBy(name = "submit") WebElement Submit;

    public void setFirstName(String FstName){
        FirstName.sendKeys(FstName);
    }
    public void setLastName(String lstName){
        LastName.sendKeys(lstName);
    }
    public void setPhone(String phnNo){
        Phone.sendKeys(phnNo);
    }
    public void setEmail(String mail){
        Email.sendKeys(mail);
    }
    public void setAddress(String adrs){
        Address.sendKeys(adrs);
    }
    public void setCity(String cty){
        City.sendKeys(cty);
    }
    public void setState(String state){
        State.sendKeys(state);
    }
    public void setPostalCode(String pstlcod){
        PostalCode.sendKeys(pstlcod);
    }
    public void setCountry(String cntry){
        Select option = new Select(Country);
        option.selectByVisibleText(cntry);
    }
    public void setUserName(String usrname){
        UserName.sendKeys(usrname);
    }
    public void setPassword(String pswrd){
        Password.sendKeys(pswrd);
    }
    public void setConfirmPassword(String cnfrmPswrd){
        ConfirmPassword.sendKeys(cnfrmPswrd);
    }
    public  void clickSubmit(){
        Submit.click();
    }






}

