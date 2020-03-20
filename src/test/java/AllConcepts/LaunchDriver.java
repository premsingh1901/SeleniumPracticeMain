package AllConcepts;


import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchDriver {
	
	public static WebDriver driver;
	public static HashMap<String,String> frameName;
	public static String screenshotPath="G:\\WorkSpcae\\JavaPractice\\SeleniumPractice\\ScreenShots\\test.png";
	
public static void init(String brwoserType, String URL)
{
	
	
	if(brwoserType.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","G:\\WorkSpcae\\JavaPractice\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}else if(brwoserType.equalsIgnoreCase("IE"))
	{
		System.setProperty("webdriver.ie.driver","G:\\WorkSpcae\\JavaPractice\\SeleniumPractice\\Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		
	} 
		
	
	//driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get(URL);
	frameName=new HashMap<String, String>();
	frameName.put("f1", "iframe1");
	
}



}
