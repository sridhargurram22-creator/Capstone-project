package capstone_project;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestClass extends BaseClass{
	
	//Validation All the necessary UI Elements are Present and Clickable (Textbox, Calculate Button, About, Terms and Condition and Privacy Link)
	
	@Test
	public void verifyUIElements() {
		
		ExtentReports extent = ExtentManager.getReportObject();

        ExtentTest test = extent.createTest("Test case 1");

        System.out.println("Executing Test case 1");

		
		boolean numboxdisplay = driver.findElement(numbox).isDisplayed();
		
		boolean calculator = driver.findElement(calculate).isEnabled();
		
		boolean aboutcheck = driver.findElement(about).isEnabled();
		
		boolean termscheck = driver.findElement(tandm).isEnabled();
		
		boolean privacycheck = driver.findElement(privacy).isEnabled();
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(numboxdisplay, true);
		s.assertEquals(calculator, true);
		s.assertEquals(aboutcheck, true);
		s.assertEquals(termscheck, true);
		s.assertEquals(privacycheck, true);
		
		
		
		s.assertAll();
		
		test.pass("Login Test Passed");

        extent.flush();
		
		
		
	}

}
