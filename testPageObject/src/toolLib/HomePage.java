package toolLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	@FindBy(how= How.XPATH, using="//*[@id='menu-main-menu-2']/li[1]/a")
	private WebElement ClickHome;
	
	@FindBy(how= How.XPATH, using="//*[@id='menu-main-menu-2']/li[2]/a")
	private WebElement ClickSchedule;
	
	@FindBy(how =How.XPATH, using="//*[@id='menu-main-menu-2']/li[3]/a")
	private WebElement HoverResources;
	
	@FindBy(how =How.XPATH, using ="//*[@id='menu-main-menu-2']/li[4]/a")
	private WebElement ClickFAQ;
	
	@FindBy(how = How.XPATH, using="//*[@id='menu-main-menu-2']/li[5]/a")
	private WebElement ClickContact;
	
	@FindBy(how =How.XPATH, using="//*[@id='menu-main-menu-2']/li[6]/a")
	private WebElement ClickLogin;
	
	
	
	public void navHome(){
		ClickHome.click();
	}
	public void navSchedule(){
		ClickSchedule.click();
	}
	
	//A dropdown menu shown when hover on Resources
	public void navResources(String choose){
		HoverResources.click();
		
	}
	public void navFAQ(){
		ClickFAQ.click();
	}
	public void navContact(){
		ClickContact.click();
	}	
		
	public void navLogin(){
		ClickLogin.click();
	}
	
}
