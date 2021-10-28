package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s=new Select(dropdown);
		s.selectByIndex(4);
		s.selectByValue("2984");
		s.selectByVisibleText("Health & Beauty");
		
		List<WebElement> allOption = s.getOptions();
		System.out.println(allOption.size());
		
		for(WebElement option:allOption) {
			System.out.println(option.getText());
		}
		
		s.deselectAll();
		
		
		
		driver.close();

	}

}
