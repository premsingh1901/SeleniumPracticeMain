package AllConcepts;


import org.openqa.selenium.By;


public class BrowsePractice extends LaunchDriver{
	
	
	public static void main(String[] args) throws InterruptedException {

		init("Chrome", "file://G:/WorkSpcae/JavaPractice/SeleniumPractice/Drivers/upload.html");
	
		Thread.sleep(2000);
		/*
		 * How to upload the file in Selenium
		 */
		driver.findElement(By.name("fileToUpload")).sendKeys("G:\\WorkSpcae\\JavaPractice\\SeleniumPractice\\Drivers\\upload.html");
		
		Thread.sleep(20000);
		driver.close();
		//driver.close();


	}

}
