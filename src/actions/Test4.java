package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.macys.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='home']"));

		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Hair Accessories']")).click();
		
	}

}
