package toolLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPgObject {
	public WebDriver driver;
	public TestObject tob;
	public HomePage hpg;
	
	//test case 1 for log in successful
	@Test
	public void testContact() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.get("http://www.justagile.org");
		hpg=PageFactory.initElements(driver, HomePage.class);
		hpg.navContact();
		tob= PageFactory.initElements(driver, TestObject.class);
		tob.contactInfo("Hong", "honlin@ucdavis.edu", "test", "What's up","Thank you for your message. It has been sent.");
		driver.quit();
	}
	
	//Test case 2 for failing
	@Test
	public void testContactforFail() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.get("http://www.justagile.org");
		hpg=PageFactory.initElements(driver, HomePage.class);
		hpg.navContact();
		tob= PageFactory.initElements(driver, TestObject.class);
		tob.contactInfo("Hong", " ", "test", "What's up","One or more fields have an error. Please check and try again.");
		driver.quit();
	}
}
