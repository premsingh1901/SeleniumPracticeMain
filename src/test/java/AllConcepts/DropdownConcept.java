package AllConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownConcept {
	WebDriver driver;
	
	@BeforeTest
	void setUp()
	{
		System.setProperty("webdriver.chrome.driver","G:\\WorkSpcae\\JavaPractice\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
	}
	
	@Test
	void dropDownTest()
	{
		WebElement dropdown=driver.findElement(By.id("animals"));
		Select select=new Select(dropdown);
		List allOptions=select.getOptions();
		System.out.println("Total Number of values in the dropdown: "+allOptions.size());
		System.out.println(select.getOptions());
		
	}

	
	@AfterMethod
	void tearDown()
	{
		//driver.quit();
	}
}
