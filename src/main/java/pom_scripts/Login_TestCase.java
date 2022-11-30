package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_TestCase extends BasePage {
	
	

	public Login_TestCase(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Login")
	WebElement Login;
	
	public void clickLoginButton() {
		clickAction(Login);
	}
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement UserNameTF;
	
        public void enterValueInEmail(String username) {
		enter_value(UserNameTF, username);
		}
        
	
        
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement PasswordTF;
	
	public void enterValueInPwd(String pwd) {
		enter_value(PasswordTF, pwd);
	}

	
	@FindBy(xpath="(//span[text()='Login'])[2]")
	WebElement Login1;
	
	public void ClickLogin1Action() {
		clickAction(Login1);
	}
	
    
	@FindBy(xpath="//input[@autocomplete=\"on\"]")
	WebElement OTP;
	
	public void ClickOTPAction() {
		clickAction(OTP);
	}
	
	
	@FindBy(xpath="//a[@class=\"_2QKxJ- _2_DUc_\"]")
	WebElement Forgot;
	
	public void ClickForgotAction() {
		clickAction(Forgot);
	}
	
	
	@FindBy(xpath="(//input[@autocomplete=\"off\"])[2]")
	WebElement SetPassword;
	
	public void enterValueInSetPassword(String SetPass) {
		enter_value(SetPassword, SetPass);
	}
	

	@FindBy(xpath="(//span[text()='Login'])[2]")
	WebElement Login2;
	
	public void ClickLogin2Action() {
		clickAction(Login2);
	}

}
