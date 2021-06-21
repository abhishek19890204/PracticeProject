package simpleJavaprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//WebElement shadowhost_Element = driver.findElement(By.tagName("app-header"));
		WebElement shadowhost_Element = driver.findElement(By.tagName("book-app")); //shadow host / root element
		System.out.println("0");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		System.out.println("2");
		WebElement shadow_DOM_Element = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowhost_Element);
		System.out.println("1");
		WebElement Node1 = shadow_DOM_Element.findElement(By.tagName("app-header"));
		WebElement Node2 = Node1.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		WebElement Node3 = Node2.findElement(By.tagName("book-input-decorator"));
		
		WebElement Element_status = Node3.findElement(By.cssSelector("input#input"));
		Element_status.sendKeys("testing");
		//boolean Element_existence = Element_status.isDisplayed();
		//System.out.println(Element_existence);
		
	}

}
