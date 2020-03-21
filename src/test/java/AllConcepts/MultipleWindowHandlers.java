package AllConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowHandlers extends LaunchDriver {
	public static String firstWin;
	public static String secondWin;
	public static String thirdWin;
	public static String winName;

	
	public static void GetWinHandler()
	{
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles.size());
		
		Iterator it=handles.iterator();
		
		firstWin=(String) it.next();
		System.out.println("First window Id= "+ firstWin);
		
		
		secondWin=(String) it.next();
		System.out.println("Second window Id= "+ secondWin);
		

		thirdWin=(String) it.next();
		System.out.println("Third window Id= "+ thirdWin);
		

		
		
		
	}

	public static void getExpectedWin()
	{
		
		
		
		String parentTitle=driver.getTitle();
		if(parentTitle.equalsIgnoreCase("Window Popup Modal Demo"))
			thirdWin="F";
		

		driver.switchTo().window(secondWin);
		String secondTitle=driver.getTitle();
		if(secondTitle.contains("Twitter"))
			secondWin="T";
		else if (secondTitle.contains("Facebook"))
			thirdWin="F";
		else 
			System.out.println("No Window avalable");

		
		System.out.println("Third window Id= "+ thirdWin);
		

	}
	
	public static void switchExpectedWin(String winName)
	{
		driver.switchTo().window(winName);
		System.out.println("Windoe name: "+driver.getTitle());
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		init("Chrome", "https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Follow Twitter & Facebook')]")))).click();
		Thread.sleep(2000);
		
		
		//driver.switchTo().window(secondWin);
		GetWinHandler();
		//getExpectedWin();
		switchExpectedWin(secondWin);
		driver.close();
		switchExpectedWin(thirdWin);
		driver.close();
		
		
	}

}
