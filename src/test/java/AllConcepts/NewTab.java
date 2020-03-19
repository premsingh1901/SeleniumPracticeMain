package AllConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class NewTab extends LaunchDriver{
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		init("Chrome", "https://google.com");
		
		
		
		
			
		Thread.sleep(1000);
		/*
		 * Open the link in the new tab
		 */
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.linkText("Gmail")).sendKeys(selectLinkOpeninNewTab);
		System.out.println("Link opened in new tab");
		
		/*
		 * Open the blank tab
		 */
		String selectLinkOpeninNewTabBalnk = Keys.chord(Keys.CONTROL, "t");// Not working
		driver.findElement(By.linkText("Gmail")).sendKeys(selectLinkOpeninNewTabBalnk);// Not working
		System.out.println("Opened new blank tab");// Not working
		
		String a = "window.open('about:blank','_blank');";  // replace link with your desired link
		((JavascriptExecutor)driver).executeScript(a);
		
		
		}

	}
	
	
