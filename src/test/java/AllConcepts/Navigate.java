package AllConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Navigate extends LaunchDriver{
	
	


public static void main(String[] args) throws InterruptedException {
	
	
	init("Chrome", "https://google.com");
	driver.get("https://google.com");
	
	/*
	 * This methods Load a new web page in the current browser window.
	 *  This is done using an HTTP GET operation, and the method will block until the load is complete.
	 */
	driver.navigate().to("https://amazon.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	/*
	 * for the new tab tried
	 */
	
//	Thread.sleep(1000);
//	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, "t");
//	driver.findElement(By.linkText("Help")).sendKeys(selectLinkOpeninNewTab);

	
	
	
	}

}