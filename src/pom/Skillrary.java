package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary {
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginButton;
	
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	
	public Skillrary(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void login() {
		loginButton.click();
	}
	
	public void username(String user) {
		usernametb.sendKeys(user);
	}
	
	public void password(String pass) {
		passwordtb.sendKeys(pass);
	}
	
	public void sumbit() {
		loginbtn.click();
	}
	

}
