package locators;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Date d=new Date();
		int getData = d.getDate();
		int getmonth = d.getMonth();
		String s = d.toString();
		String[] value=s.split("");
		String year=value[5];
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='"+getmonth+"' and  @aria-label='"+year+"']/div/p[text()='"+getData+"']"));
		System.out.println(ele.getText());
		ele.click();	

	}

}
