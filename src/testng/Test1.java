package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test(invocationCount = 3)
	public void call() {
		Reporter.log("calls",true);
	}
	
	@Test(priority = -1,invocationCount = 2,enabled = false)
	public void settings() {
		Reporter.log("settings",true);
	}
	
	
	@Test(priority = -1)
	public void chats() {
		Reporter.log("chats",true);
	}
	
}
