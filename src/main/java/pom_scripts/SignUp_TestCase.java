package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp_TestCase extends BasePage {

	public SignUp_TestCase(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(linkText ="New to Flipkart? Create an account")
	WebElement NewUser;
	
	public void clickNewUserLink() {
		clickAction(NewUser);
	}
	
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement MobileNumber;
	
        public void enterValueInEmail(String MobNumber) {
		enter_value(MobileNumber, MobNumber);
	}
        
        @FindBy(xpath= "//div/button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")
    	WebElement Continue;
    	
    	public void clickContinueButton() {
    		clickAction(Continue);
    }
    	
    	
    	@FindBy(xpath= "//input[@maxlength=\"6\"]")
    	WebElement OtpText;
    	
    	public void clickOtpText() {
    		clickAction(OtpText);
    }
        
    	
    	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
    	WebElement SetPass;
    	
            public void enterValueInSetPass(String SetPassword) {
    		enter_value(SetPass, SetPassword);
    	}
            
    	
         @FindBy(xpath="//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")
        WebElement SignUp;
        	
         public void clickSignupButton() {
        		clickAction(SignUp);
        }
    	
        
        
       

}
