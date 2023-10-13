package W3SchoolsPages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import W3STestBase.WebTestBase;

public class LoginPage extends WebTestBase {
	
	@FindBy(name="email") 	    
	WebElement mobileTextBox;  	   
	@FindBy(name = "current-password") 	   
	WebElement passwordTextBox;    
	@FindBy(xpath ="//*[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']") 	 
	WebElement Loginbtn;  	   
	public LoginPage(){ 	       
		PageFactory.initElements(driver, this); 	  
		} 
	//sending the mobileno and passwrord to the login 	  
	public void login(String mobile, String password){ 
		
		mobileTextBox.sendKeys(mobile); 	       
		passwordTextBox.sendKeys(password); 	       
		Loginbtn.click(); 	    
		}  
}
