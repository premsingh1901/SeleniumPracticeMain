package AllConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


public class AlertPractice extends LaunchDriver{
	
	
	public static void main(String[] args) throws InterruptedException {

		init("Chrome", "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
		
		/*
		 * Java Script Alert Box
		 */
	/*	driver.findElement(By.xpath("//button[contains(text(), 'Click me!')] [1]")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
		/*
		 * Java Script Confirm Box
		 */

	/*	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
		Alert alertC= driver.switchTo().alert();
		System.out.println(alertC.getText());
		Thread.sleep(2000);
		alert.dismiss();
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
		Alert alertC1= driver.switchTo().alert();
		alertC1.accept();
		
		/*
		 * Java Script Alert Box
		 */

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click for Prompt Box')]")).click();
		Alert alertA= driver.switchTo().alert();
		System.out.println(alertA.getText());
		Thread.sleep(4000);
		alertA.sendKeys("Testing the alrt box!! please see the magic!!");
		Thread.sleep(1000);
		alertA.dismiss();
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click for Prompt Box')]")).click();
		Alert alertA1=driver.switchTo().alert();
		alertA1.sendKeys("Testing the alrt box!! please see the magic!!");
		Thread.sleep(2000);
		alertA1.accept();
		driver.close();


	}

}
