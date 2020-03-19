package AllConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseMove extends LaunchDriver {

	public static void main(String[] args) throws InterruptedException {
		
		
		init("Chrome", "https://way2automation.com/");
		
		/*
		 Actions action=new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Resources')]"))).build().perform(); Thread.sleep(4000);
		 driver.findElement(By.xpath("//a[text()='Practice site 1']")).click();
		 */
		 
		WebElement sourceEle=driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		 WebElement clickElement=driver.findElement(By.xpath("//a[text()='Practice site 1']"));
		 Actions action=new Actions(driver); 
		 action.moveToElement(sourceEle);
		 Thread.sleep(4000);
		 clickElement.click();
		 
		
		/*Actions action=new Actions(driver);
		action.clickAndHold(sourceEle)
		.release(targetName)
		.build()
		.perform();
		*/
		//action.dragAndDrop(sourceEle, targetName);
		
	}

}
