package capstone_project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestClass4 extends BaseClass{
	
	//Click on the About link and verify the total number of link is Greater than 5 and print the link name
	//(Use Webdriver Wait/ Assertion)
	
	@Test
	public void ts5() {
		
		ExtentReports extent = ExtentManager.getReportObject();

        ExtentTest test = extent.createTest("Test case 5");

        System.out.println("Executing Test case 5");

        
		driver.findElement(about).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.tagName("a"))));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int actualsize = links.size();
		boolean actualresult = false;
		
		System.out.println(actualsize);
		
		
		if (actualsize > 5) {
			actualresult = true;
		}
		
		Assert.assertEquals(actualresult, true);
		
		for (WebElement ref : links) {
			System.out.println(ref.getText());
		}
		
		test.pass("Login Test Passed");

        extent.flush();
		
		
		
	}

}
