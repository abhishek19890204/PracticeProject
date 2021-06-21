package simpleJavaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomEample2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Selenium Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://shop.polymer-project.org/");
		//driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
		
		WebElement root= driver.findElement(By.tagName("shop-app"));
		WebElement Shadow_Root=getShadowDom(root,driver);
		
		Thread.sleep(5000);
		WebElement Shadow_Node1 = Shadow_Root.findElement(By.tagName("iron-pages"));
		WebElement Shadow_Node2 = Shadow_Node1.findElement(By.tagName("shop-home"));
		
		WebElement Shadow_DOM2=getShadowDom(Shadow_Node2,driver);
		
		WebElement Shadow_Node3 = Shadow_DOM2.findElement(By.cssSelector("div:nth-child(2) > shop-button >a"));  // '2' is a second div tag in shop-home tag 
		Shadow_Node3.click();
	//	WebElement Shadow_MainElement = Shadow_Node3.findElement(By.cssSelector("a[aria-label=Men's Outerwear Shop Now]"));
		String Text_value = Shadow_Node3.getText();
		System.out.println(Text_value);
		
	}
	
	 static WebElement getShadowDom(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;			
		WebElement Shadow_Root = (WebElement)js.executeScript("return arguments[0].shadowRoot", element) ;
		return Shadow_Root;
	}
	
}
