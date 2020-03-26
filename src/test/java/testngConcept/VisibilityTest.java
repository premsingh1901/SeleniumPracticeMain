package testngConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisibilityTest {
	
	WebDriver driver;
	@BeforeMethod(groups = { "LoginTest" })
	void setUp()
	{
		System.setProperty("webdriver.chrome.driver","G:\\WorkSpcae\\JavaPractice\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https://in.yahoo.com");
	}
	
	@Test(priority = 1, groups = { "LoginTest" })
	void isDisplayedTest()
	{
		Boolean isDisplay=driver.findElement(By.id("login-signin")).isDisplayed();
		System.out.println("Displayed method "+isDisplay);
		
	}
	
	@Test(priority=3, groups="LoginPage", dependsOnMethods = "isDisplayedTest")
	void isEnabledTest()
	{
		Boolean isEnabled=driver.findElement(By.id("login-signin")).isEnabled();
		System.out.println("Enabled method "+isEnabled);
		
		
	}
	
	@Test(priority=2, groups = "HomePage")
	void isSelected()
	{
		Boolean isSelected=driver.findElement(By.id("persistent")).isSelected();
		System.out.println("Is Selected method "+isSelected);
		
	}
	
	@Test(priority=1, groups ="HomePage")
	void isSelectedCheck()
	{
		driver.findElement(By.xpath("//label[contains(text(),'Stay signed in')]")).click();
		Boolean isSelected1=driver.findElement(By.xpath("//label[contains(text(),'Stay signed in')]")).isSelected();
		System.out.println("Is Selected method should be False: "+isSelected1);
		
	}
	
	@Test(invocationCount = 5)
	void test()
	{
		System.out.println("invocationCount concepts");
	}

	
	@AfterMethod
	void tearDown()
	{
		driver.close();
	}
}
