package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Login_TestCase;

public class LoginNumberFail_TC_01 extends Base_Test {
	
	


	@Test(dataProvider = "testData")
	public void testScript1(String [] testData) throws IOException, InterruptedException {
		
		  Login_TestCase lb=new Login_TestCase(driver); 
		  lb.clickLoginButton();
		  
		  lb.enterValueInEmail(testData[0]);
		  		  
		  lb.enterValueInPwd(testData[1]);
		  Thread.sleep(2000);
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		  
		  lb.ClickLogin1Action();																																						
		  test.log(LogStatus.INFO, "User is logged in");
		   
	}
	

	@DataProvider(name = "testData")
	public String[][] getTestData() throws IOException {
		String [][]testdata=ReadExcel.getMultipleData("FailLogin");
		return testdata;
	}

}
