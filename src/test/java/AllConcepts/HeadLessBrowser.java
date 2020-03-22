package AllConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeadLessBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","G:\\WorkSpcae\\JavaPractice\\SeleniumPractice\\Drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new HtmlUnitDriver();
		
		String URL="http://testyou.in/Login.aspx?ReturnUrl=%2fStudent%2fStudentIndex.aspx%3faction%3dlogout&action=logout";
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
		System.out.println("Title of the Login Page: "+driver.getTitle());
		driver.findElement(By.id("ctl00_CPHContainer_txtUserLogin")).sendKeys("premtest");
		driver.findElement(By.id("ctl00_CPHContainer_txtPassword")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$CPHContainer$btnLoginn")).click();
		System.out.println("Title of the Home page: "+driver.getTitle());

		

}

}
