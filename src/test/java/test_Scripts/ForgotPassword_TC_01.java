package test_Scripts;

import java.io.IOException;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Login_TestCase;

public class ForgotPassword_TC_01 extends Base_Test  {
	@Test(dataProvider = "testData")
	public void testScript1(String Text, String Pwds ) throws IOException, InterruptedException {
		
		  Login_TestCase lb=new Login_TestCase(driver); 
		  lb.clickLoginButton();
		  
		  lb.enterValueInEmail(Text);
		  
		  lb.ClickForgotAction();
		  
		  Thread.sleep(20000);		  
		  lb.ClickOTPAction();
		  
		  Thread.sleep(TIMEOUTS_WAIT);
		  lb.enterValueInSetPassword(Pwds);
		  
		  
		  lb.ClickLogin2Action();
		  
		  
}
	
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("ForgotPass");
		return testdata;
	}
	}
