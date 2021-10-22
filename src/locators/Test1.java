package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		while(true) {
			try {
				driver.findElement(By.xpath("//div[@class='DayPicker-Day' and  @aria-label='Wed Jan 12 2022']/div/p[text()='12']")).click();
			}
			catch(Exception e) {
				
			}
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		

	}

}
