package toolLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class TestObject {
	@FindBy(how = How.NAME, using="your-name")
	private WebElement EnterName;
	
	@FindBy(how = How.NAME, using="your-email")
	private WebElement EnterEmail;
	
	@FindBy(how = How.NAME, using="your-subject")
	private WebElement EnterSubject;
	
	@FindBy(how = How.NAME, using="your-message")
	private WebElement EnterMessage;
	
	@FindBy(how=How.XPATH, using="//*[@id='wpcf7-f73-p11-o1']/form/p[5]/input")
	private WebElement ClickSend;
	
	@FindBy(how=How.XPATH, using="//*[@id='wpcf7-f73-p11-o1']/form/div[2]")
	private WebElement Response;
	
	
	public void contactInfo(String name, String email, String subject, String message, String expVal) throws InterruptedException{
		EnterName.sendKeys(name);
		EnterEmail.sendKeys(email);
		EnterSubject.sendKeys(subject);
		EnterMessage.sendKeys(message);
		ClickSend.click();
		Thread.sleep(10000);
		Assert.assertEquals(expVal.trim(),Response.getText().trim());

			
	}
}
