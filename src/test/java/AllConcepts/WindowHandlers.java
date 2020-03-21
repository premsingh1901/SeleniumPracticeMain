package AllConcepts;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class WindowHandlers extends LaunchDriver {

	public static void main(String[] args) {
		
		init("Chrome", "https://www.flipkart.com/");
		
		Set handels=driver.getWindowHandles();
		
		System.out.println(handels.size());
		System.out.println(driver.getTitle());
		/*Alert alert=driver.switchTo().alert();
		alert.dismiss(); */
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("PREMSIFN");

	}

}
