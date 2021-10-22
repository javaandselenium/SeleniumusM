package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php#");
//		
//		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("amin");
//       driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
//		
//	 List<WebElement> ele = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[*]"));
//	System.out.println(ele.size());
	
	WebElement ele = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr/td/a[contains(text(),'Corporation Bank')]"));
	System.out.println(ele.getText());
	
	driver.close();
	
	}

}
