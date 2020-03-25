package testngConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpectedExceptionsTest  {
	

	
	@Test(expectedExceptions = ArithmeticException.class)
	void noExpception()
	{
		int i=9/0;
		System.out.println("Divide by Zero exception skips"+ i);
		
	}

}
