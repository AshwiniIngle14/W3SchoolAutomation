package W3SchoolsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import W3STestBase.WebTestBase;

public class HomePage extends WebTestBase { 	 	
	@FindBy(partialLinkText = "Log in")     
	WebElement usersearch;     
	public HomePage(){         
		PageFactory.initElements(driver,this);     
		}     
	public void userSearchClick(){       
		usersearch.click();
		
		
		} 
	}
