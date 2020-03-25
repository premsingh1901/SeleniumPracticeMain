package testngConcept;

import java.util.NoSuchElementException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * 1. Unit testing framework. Its also known as TDD(Test driven development)
 * 2. Purpose- Design test cases in a systematic way.
 * 3. Open source, it available in the form of jar files.
 * 4. Only applicable for JAVA only.
 * 5. Generate good html reports.
 * 6. It has a lot of annotations.
 * 7. Priorities or sequence.
 * 8. Dependencies 
 * 9. grouping 
 * 10. Data Providers are available- VVI
 * 11. invocationcount--- HOw many time we can execute test case.
 * 12. We can skip the exceptions----> @Test(expectedExceptions = NoSuchElementException.class)
 * 
 * For install testNG- navigate to help in eclipse - add new software.
 * Provide the testNG url and select testNG
 */

public class TestNG_Practice {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite: 1st");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test: 2nd");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class: 3rd");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method: 4th");
	}
	
	
	@Test(expectedExceptions = NoSuchElementException.class)
	void a()
	{
		System.out.println("Test1: After all before method executions");
		
	}
	

	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
		
		
		
		
		
		

}
