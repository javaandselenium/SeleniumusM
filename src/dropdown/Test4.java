package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement dd = driver.findElement(By.id("month"));
		Select s=new Select(dd);
		s.selectByIndex(0);
		s.selectByValue("4");
		s.selectByVisibleText("May");
		
		List<WebElement> Alloption = s.getOptions();
		System.out.println(Alloption.size());
		
		ArrayList list=new ArrayList<>();
		
		for(WebElement b:Alloption) {
			String text = b.getText();
			System.out.println(text);
			list.add(text);
		}
		
Collections.sort(list);

System.out.println("***********After sorting*********");


for(Object b:list) {
	System.out.println(b);
}

driver.close();
	}

}

