package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Login_TestCase;
import pom_scripts.SignUp_TestCase;

public class SignUp_TestCase_01 extends Base_Test{
	@Test(dataProvider = "testData")
	public void testScript1(String [] testData) throws IOException, InterruptedException {
		
		  Login_TestCase lb=new Login_TestCase(driver); 
		  lb.clickLoginButton();
		  
		  SignUp_TestCase st=new SignUp_TestCase(driver);
		  st.clickNewUserLink();
		  
		  st.enterValueInEmail( testData[0]);
		  
		  st.clickContinueButton();
		  Thread.sleep(25000);		  
		  st.clickOtpText();
		  
		  st.enterValueInSetPass(testData[1]);
		  
		  st.clickSignupButton();

}
	@DataProvider(name = "testData")
	public String[][] getTestData() throws IOException {
		String [][]testdata=ReadExcel.getMultipleData("SignUp");
		return testdata;
	}
	}
