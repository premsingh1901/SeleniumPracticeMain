package AllConcepts;

import java.util.List;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



/**
 * @author Prem Singh
 * ALl the locator will be covered here
 *
 */
public class ALLLocators extends LaunchDriver {
	

	public static void main(String[] args) throws InterruptedException {

		init("Chrome","https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Drhf_custrec_newcust");
//		driver.close();
//		init("IE","https://google.com");
//		driver.close();
		//Thread.sleep(6000);
		/*
		 * By "id" of the web element
		 */
		WebElement name=driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("Prem");
		

		/*
		 * By "name" of the web element
		 */
		
		WebElement mobile= driver.findElement(By.name("email"));
		mobile.sendKeys("97997979");
		
		/*
		 * By class name of the web element
		 */
		WebElement email=driver.findElement(By.name("secondaryLoginClaim"));
		email.sendKeys("prem@gmail.com");
		
		/*
		 * By xpath
		 */
		WebElement pwd=driver.findElement(By.xpath("//input[@id='ap_password']"));
		pwd.sendKeys("Anything");
	
		/*
		 * by linktext - Only for the links
		 */
		WebElement signIn=driver.findElement(By.linkText("Sign in"));
		signIn.click();
		driver.navigate().back();
		
		/*
		 * Partial linktext- Only for the links
		 */
		
		WebElement privacyLink=driver.findElement(By.partialLinkText("Privacy"));
		//privacyLink.click();
		Thread.sleep(2000);
		Set<String> set=driver.getWindowHandles();
		System.out.println(set);
//		for(String s:set)
//		{
//			System.out.println(s);
//			driver.switchT o().window(s);
//		}
//		
		//driver.close();
		//driver.getCurrentUrl();
		
		/*
		 * tagName
		 */
		List<WebElement> anchor=driver.findElements(By.tagName("a"));
		for(WebElement e:anchor)
		{
			System.out.println(e.getAttribute("href"));
		}
		/*
		 * CSS Selector
		 * If id is there -> #{id}
		 * If class is there -> .{classname}
		 */
		
		
		WebElement pwd1=driver.findElement(By.cssSelector("#ap_password"));
		pwd1.clear();
		pwd1.sendKeys("NEWDJHJKDHJHKDHKJHKDHKHDKJHKDJHKJDHKJDHKDKHHDKJ");

		
		
		/*
		 * Dropdown values
		*/
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='countryCode']"));
		Select select=new Select(dropdown);
		//select.selectByValue("DZ +213");
		select.selectByIndex(12);
		
		
		
 }

}
