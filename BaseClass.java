package capstone_project;




import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass{
	
	By numbox = By.name("number");
	
	By calculate = By.id("getFactorial");
	
	By about = By.xpath("//*[text()='About']");
	
	By tandm = By.xpath("//*[text()='Terms and Conditions']");
	
	By privacy = By.xpath("//*[text()='Privacy']");
	
	By output = By.xpath("//*[@id=\"resultDiv\"]");
	
	WebDriver driver;
	
	/*public void readingExcel() throws Exception {
	//creating object for reading excelsheet
	FileInputStream file = new FileInputStream("C:\\Automation_Testing_GSIT\\Data_driven_testing\\CapstoneProjectSheet.xls");
	
	Workbook wb = new HSSFWorkbook();
	
	Sheet s = wb.getSheet("book1");
	
	String a = s.getRow(1).getCell(0).getStringCellValue();
	
	}
	*/
	
	//Creating reusable factorial method/function
	public long factorial(int num) {
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	@BeforeClass
	public void openWeb() {
		
		
		
		driver = new ChromeDriver();
		
		driver.get("https://qainterview.pythonanywhere.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	
	@AfterClass
	public void closeWeb() {
			
		driver.close();
		
	}

}
