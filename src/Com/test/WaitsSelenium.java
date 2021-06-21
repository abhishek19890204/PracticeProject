package Com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsSelenium {
	
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Selenium Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		
		//implicitly wait -- is always applied globally -- is available for all the webelement.
		
		
		driver.navigate().to("https://www.facebook.com/");
		WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement PassWord = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		SendkeysExpliciteWait(driver, Username, 10, "gola.present@gmail.com");
		SendkeysExpliciteWait(driver, PassWord, 5, "gola.present@gmail.com");
		SendkeysExpliciteWaitForClick(driver , LoginButton , 10 );

	}
	
	public static void SendkeysExpliciteWait(WebDriver driver , WebElement element , int timeOut, String value) {
		
		WebDriverWait WW = new WebDriverWait(driver ,timeOut);
		WW.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void SendkeysExpliciteWaitForClick(WebDriver driver , WebElement element , int timeOut) {
		
		WebDriverWait WW = new WebDriverWait(driver ,timeOut);
		WW.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
