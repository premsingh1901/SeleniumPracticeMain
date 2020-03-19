package AllConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice extends LaunchDriver {

	public static void main(String[] args) throws InterruptedException {
		
		
		init("Chrome", "https://demoqa.com/droppable/");
		
		WebElement sourceEle=driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement targetEle=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Thread.sleep(2000);
		
		Actions action=new Actions(driver); 
		action.clickAndHold(sourceEle)
		.release(targetEle)
		.build()
		.perform(); 
		System.out.println("Done");
		/*Thread.sleep(5000); //Pending
		action.dragAndDrop(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")), driver.findElement(By.xpath("//div[@id='droppable']")));
		*/
	}

}
