package simpleJavaprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXapthAxes   {
	
	//static PracticeSession obj1 = new LocatorsXapthAxes();
	
	public static void main(String[] args) {
		
		//obj1.arrMethod();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		//Self  - Select the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'HLV L')]/self::a")).getText();
		System.out.println(text);
		
		//child  - Select all Children of the current node (one or many)
		List<WebElement> count = driver.findElements(By.xpath("//a[contains(text(),'HLV L')]/ancestor::tr/child::td"));
		int totalElements = count.size();
		System.out.println(totalElements);
		
		
		//Ancestor - Select all ancestors (parent, grandparent , etc)
		text=driver.findElement(By.xpath("//a[contains(text(),'HLV L')]/ancestor::tr")).getText();
		System.out.println(text);
		
		//descendant - Select all descendants (childrens , grandchildren, etc ) of the current node
		List<WebElement> TotalCount=driver.findElements(By.xpath("//a[contains(text(),'HLV L')]/ancestor::tr/descendant::*"));
		int total = TotalCount.size();
		System.out.println(total);
		
		// Following  - select all nodes on document after closing tag of current node
		List<WebElement> followingNodes =driver.findElements(By.xpath("//a[contains(text(),'HLV L')]/ancestor::tr/following::tr"));
		int Count_followingNodes = followingNodes.size();
		System.out.println(Count_followingNodes);
		
		// Following  - select all nodes on document after closing tag of current node
		followingNodes =driver.findElements(By.xpath("//a[contains(text(),'HLV L')]/ancestor::tr/following-sibling::tr"));
		Count_followingNodes = followingNodes.size();
		System.out.println(Count_followingNodes);
		
		//driver.close();
		driver.quit();
		
		

	}

}
