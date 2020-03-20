package AllConcepts;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait extends LaunchDriver {

	public static void main(String[] args) {

		init("chrome", "https://testproject.io/");
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(>someid>)));
		
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Free Sign Up"))));
		ele.click();
		
		//WebElement ele1=wait.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(By.linkText("Free Sign Up")), "Free Sign Up")));
		
	/*
	 * Fluent wait 
	 */
		
		/*@SuppressWarnings("deprecation")
		Wait<WebDriver> waitF = new FluentWait<WebDriver>(driver)							
				.withTimeout(300, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.xpath(""));
			}
		});
		*/
		
		
		
		
				
		
	}

}
