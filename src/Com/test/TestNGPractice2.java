package Com.test;

import org.testng.annotations.Test;

public class TestNGPractice2 {

	
	@Test
	public void Logintest() {
		System.out.println("Login To App");
		int i= 9/0;
	}
	
	
	@Test(dependsOnMethods="Logintest")    //HomePage test will depend totally depend upon Logintest which needs to get Passed for HomePage to execute.
										  // If Logintest gets failed then HomePage test will skipped, it will not gets executed as its depends upon "Logintest"
	public void HomePage() {
		System.out.println("HomePageDisplayed");
	}

	  @Test (dependsOnMethods="HomePage")
	  public void Searchpagetest() { 
		  System.out.println("Search successfull");
	  }
	  
	 
	
}
