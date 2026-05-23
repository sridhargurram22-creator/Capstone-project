package capstone_project;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass3 extends BaseClass{
	
	//Data Driven testing (4 to 10) find out the factorial and verify the result
	
	
	@DataProvider (name = "numbers")
	private Object[][] dataProvider() {
		return new Object[][] {{4},{5},{6},{7},{8},{9},{10}};
	}
	
	@Test (dataProvider = "numbers")
	public void ts4(int a) throws Exception {
		driver.findElement(numbox).sendKeys(String.valueOf(a));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(calculate)); //just added to get an idea
		
		driver.findElement(calculate).click();
		
		Thread.sleep(2000);
		
		String ActualResult = driver.findElement(output).getText();
		
		String ExpectedResult = "The factorial of "+a+" is: "+String.valueOf(factorial(a));
		
		Assert.assertEquals(ActualResult, ExpectedResult);
		
		
		driver.findElement(numbox).clear();
		
		
		
		
		
	}
	
}
