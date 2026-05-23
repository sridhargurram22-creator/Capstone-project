package capstone_project;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.Test;

public class TestClass5 extends BaseClass{
	
	//Add one scenario to automate one of the detected bug
	/*
	 *  Bug1: No error being displayed for negative numbers - High 
		Bug2: Upon Clicking on Terms and Conditions redirecting to Privacy Page - Low
		Bug3: Upon Clicking on Privacy Page is redirecting to Terms and Conditions Page - Low

	 */
	// Bug1: No error being displayed for negative numbers - High  - Writing code for this
	
	@Test
	public void ts6() {
		driver.findElement(numbox).sendKeys("-1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(calculate).click();
		
		String expectedresult = "Please Enter A Positive Number";
		
		String actualresult = driver.findElement(output).getText();
		
		System.out.println(actualresult);
		
		assertEquals(actualresult, expectedresult);
		
	}
}
