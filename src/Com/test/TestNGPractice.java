package Com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {

	
	
	/* Set system properties
	Launch Browser
	Enter URL
	Login to app
	Gmail Logged In
	Browser Close
	Logout App
	Delete Cookies
	 * 
	 * 
	 */
	
	
	@BeforeSuite
	public void Setup()
	{
		System.out.println("Set system properties");
	}
	
	@BeforeTest
	public void LaunchBrowser()
	{
		System.out.println("Launch Browser");
	}
	
	@BeforeClass
	public void EnterUrl()
	{
		System.out.println("Enter URL");
	}
	
	
	@BeforeMethod
	public void Login()
	{
		System.out.println("Login to app");
	}
	
	
	@Test
	public void TestStep()
	{
		System.out.println("Gmail Logged In");
	}
	
	@Test
	public void TestStep1()
	{
		System.out.println("Gmail Homepage");
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		System.out.println("Browser Close");
	}
	
	@AfterClass
	public void Logout()
	{
		System.out.println("Logout App");
	}
	
	
	@AfterTest
	public void deleteAllCookies()
	
	{
		System.out.println("Delete Cookies");
	}
	
	/*
	 * @AfterSuite public void generatetestreport() {
	 * 
	 * }
	 */
}
