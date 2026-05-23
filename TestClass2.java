package capstone_project;



import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 extends BaseClass {
	
	/*
	 * Verify the Placeholder in Textbox is = 'Enter an integer'
Verify the Title of the page contains = 'Factorial' 
Verify the URL contains = 'https'

	 */
	
	@Test
	public void ts1() {
		
		String textbox = driver.findElement(numbox).getAttribute("placeholder");
		
		System.out.println(textbox);
		
		Assert.assertEquals(textbox, "Enter an integer");
	}
	
	
	@Test
	public void ts2() {
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title.contains("Factorial"), true);
	}
	
	@Test
	public void ts3() {
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		Assert.assertEquals(url.contains("https"), true);
	}

}
