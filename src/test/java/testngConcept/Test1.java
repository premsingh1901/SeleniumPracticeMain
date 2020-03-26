package testngConcept;

import org.testng.annotations.Test;

/**
 * @author Prem Singh
 * 
 * These test cases designed for the grouping purpose only
 *
 */
public class Test1 {
	  @Test(groups = { "functest", "checkintest" })
	  public void testMethod1() {
		  System.out.println("Method one executed");
	  }
	 
	  @Test(groups = {"functest", "checkintest"} )
	  public void testMethod2() {
		  System.out.println("Method two executed");

	  }
	 
	  @Test(groups = { "functest" })
	  public void testMethod3() {
		  System.out.println("Method three executed");

	  }
	}
