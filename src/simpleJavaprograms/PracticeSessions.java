package simpleJavaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeSessions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.get("http://www.mrbool.com//");
		 * System.out.println("Browser launched"); driver.manage().window().maximize();
		 */
		//Actions action = new Actions (driver);
		//action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		//action.
		
		driver.get("http://www.automationpractice.com//");
		System.out.println("Browser launched");
		driver.manage().window().maximize();
		
		
		int count =driver.findElements(By.className("")).size();
		int countLinkTag = driver.findElements(By.tagName("a")).size();
		
		
		driver.get("https://en-gb.facebook.com//");
		System.out.println("Browser launched");
		driver.manage().window().maximize();
		
		
		
		WebElement Tag_ID = driver.findElement(By.cssSelector("input#email"));
		
							//OR using combination of Tag & ID
		
		WebElement ID = driver.findElement(By.cssSelector("#email"));
		
		//=====================================================================//
		
		WebElement Tag_Class = driver.findElement(By.cssSelector("input.inputtext"));
		
				//OR using combination of Tag & class

		WebElement class_value = driver.findElement(By.cssSelector(".inputtext"));
		
		//====================================================================//

		WebElement Tag_Attribute = driver.findElement(By.cssSelector("input[name=email]"));
		
				//OR using combination of Tag & Attribute

		WebElement Attribute_value = driver.findElement(By.cssSelector("[name=email]"));
		
		
		//============================================================================//
		
		//OR using combination of Tag ,class & Attribute

		 driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email")).sendKeys("abc@gmail.com");
		 driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass")).sendKeys("pass");
		
	
		
		
	}

}
