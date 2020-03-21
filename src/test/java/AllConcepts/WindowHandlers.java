package AllConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlers extends LaunchDriver {
	public static String firstWin;
	public static String secondWin;

	
	public static void GetWinHandler()
	{
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles.size());
		
		Iterator it=handles.iterator();
		
		firstWin=(String) it.next();
		System.out.println("First window Id= "+ firstWin);
		
		
		secondWin=(String) it.next();
		System.out.println("Second window Id= "+ secondWin);
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		init("Chrome", "https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Follow On Twitter')]")))).click();
		Thread.sleep(2000);
		
		/*
		 * Without method
		 */
				
//		Set<String> handles=driver.getWindowHandles();
//		
//		System.out.println(handles.size());
//		
//		Iterator it=handles.iterator();
//		
//		String firstWin=(String) it.next();
//		System.out.println("First window Id= "+ firstWin);
//		
//		System.out.println("Parent Window: "+driver.getTitle());
//		
//		String secondWin=(String) it.next();
//		System.out.println("Second window Id= "+ secondWin);
//		
		/*
		 * Switching to child window
		 */
		GetWinHandler();
		driver.switchTo().window(secondWin);
		System.out.println("Parent Window: "+driver.getTitle());
		String ele=driver.findElement(By.xpath("//p[contains(text(), 'We provide')]")).getText();
		System.out.println(ele);
		driver.close();
		
		/*
		 * Switching back to parent window. The user has to explicitly switch to parent window otherwise "NoSuchWindowException" no such window: target window already closed

		 */
		
		driver.switchTo().window(firstWin);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook')]")))).click();
		Thread.sleep(2000);
		GetWinHandler();
		driver.switchTo().window(secondWin);
		Thread.sleep(2000);
		System.out.println("Child Window: "+driver.getTitle());
		driver.close();
		driver.switchTo().window(firstWin);


		
	}

}
