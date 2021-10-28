package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/dd.html");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement dropdown = driver.findElement(By.id("MTR"));
	Select s=new Select(dropdown);
	s.selectByIndex(0);
	s.selectByValue("cup");
s.selectByVisibleText("Tea");	


Thread.sleep(3000);
s.deselectByIndex(0);
Thread.sleep(3000);
s.deselectByValue("cup");
Thread.sleep(3000);
s.deselectByVisibleText("Tea");
	
Thread.sleep(3000);
	driver.close();

	}

}
