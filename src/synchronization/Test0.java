package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.instagram.com/");
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     
     driver.findElement(By.name("username")).sendKeys("admin123");
     driver.findElement(By.name("password")).sendKeys("12356577ytrty");
     driver.findElement(By.xpath("//div[text()='Log In']")).click();
     

	}

}
