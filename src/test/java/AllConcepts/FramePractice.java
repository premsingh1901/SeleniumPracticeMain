package AllConcepts;

import org.openqa.selenium.By;

public class FramePractice extends LaunchDriver{

	public static void main(String[] args) throws InterruptedException {
		

		init("Chrome", "https://demoqa.com/iframe-practice-page/");
		Thread.sleep(5000);
		String fName=frameName.get("f1");
		System.out.println("Frame Name: "+fName);
		driver.switchTo().frame(fName);
		
		driver.findElement(By.xpath("//a[contains(text(), 'Skip to content')]")).click();
		System.out.println("Completed");
		
		
		driver.findElement(By.xpath("//a//span[contains(text(), 'Selenium Training')]")).click();
		System.out.println("On frame Only");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Sortable')]")).click();
		
		System.out.println("Completed! and back to main window ");

	}

}
