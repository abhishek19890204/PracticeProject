package Com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPractice1 {

	WebDriver driver;
	
	//@SuppressWarnings("deprecation")
	/*
	*  1 , 2 ,3 ,4,5,6 is the priority on which test will get execute in TESTNG
	*/
	
	//1 //4
	@BeforeMethod
	public void setUp()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Selenium Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("Before Method Annotation Executed");
	}
	
	//2
	@Test(priority=1,groups="Titles")
	public void GoogleTitleTest()
	{
		String Title = driver.getTitle();
		System.out.println(Title);
		System.out.println("Test Annoation executed");
		
		Assert.assertEquals(Title , "Google" , "title is not match"); // thrid parameter will be executed if asseration will get failed , if title not matched with "Google"
	}
	//5
	@Test(priority=2,groups="Links")
	public void getLink() {
		
		boolean b =driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b , "Gmail Link is not displayed");
		//Assert.assertFalse(b, "Gmail Link is not displayed");
		
	}
	
	//3 //6
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Aftre Method Annotation Executed");
	}
	
	
	
}
