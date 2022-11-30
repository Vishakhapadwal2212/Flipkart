package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Login_TestCase;

public class LoginNumberTC_01 extends Base_Test {
	
	


	@Test(dataProvider = "testData")
	public void testScript1(String [] testData) throws IOException {
		
		  Login_TestCase lb=new Login_TestCase(driver); 
		  lb.clickLoginButton();
		  
		  lb.enterValueInEmail(testData[0]);
		  		  
		  lb.enterValueInPwd(testData[1]);
		  
		  lb.ClickLogin1Action();
		  
		  //test.log(LogStatus.INFO, "User is logged in");
	}
	

	@DataProvider(name = "testData")
	public String[][] getTestData() throws IOException {
		String [][]testdata=ReadExcel.getMultipleData("LoginWithNumber");
		return testdata;
	}

}
