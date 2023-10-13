 package W3SchoolsPages;

 

 import java.io.IOException;

import org.openqa.selenium.Keys;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Utils.Utilites;
import Utils.Utilites;
import W3STestBase.WebTestBase;

 public class MyAccountPage extends WebTestBase { 	
 	@FindBy(xpath = "//h1[text()='My Account']")     
 	WebElement accountTitle;
 	
 	@FindBy(id = "search2")    
 	WebElement searchTextBox; 
 	
 	@FindBy(id = "learntocode_searchbtn")    
 	WebElement searchBtn;     
 	
 	@FindBy(xpath = "//div[@class='search-summary search-heading']")     
 	WebElement searchTitle;      
 	
 	@FindBy(xpath = "//select[@class='styled']")    
 	WebElement dropDown;      
 	
// 	@FindBy(xpath = "//div[@class='scoreCard_header__8lJbn']")     
// 	WebElement hover;  
// 	
 	@FindBy(xpath ="//div[@class='footersome']/a[3]" )     
 	WebElement linkedInOption;   
 	
 	@FindBy(xpath ="//h1[text()='Learn to Code']")
	WebElement screenShot;
 	
 	public MyAccountPage(){         
 		PageFactory.initElements(driver, this);     
 		} 	
 	public String getTextOfMyAccountPage(){         
 			return accountTitle.getText();     
 			} 
 	
 	public void search(){       
 		searchTextBox.click(); 
//		searchTextBox.sendKeys( );       

	searchTextBox.sendKeys(" javascript ");
	
 		searchTextBox.sendKeys(Keys.ENTER);
 		SoftAssert softassert=new SoftAssert();
 		
 		softassert.assertEquals(driver.getTitle(),"W3Schools Online Web Tutorials");
 		softassert.assertAll();
// 		searchBtn.click();    
 		} 
 	
 	public void selectDropDown(String term, String value){        
 		dropDown.click();        
 		Utilites.selectValue(dropDown,term,value);     
 		}     
 	
// 	public void mouseHover(){      
// 		Utilites.mouseHover(driver,myAccounthover);    
// 		}  
 	
 	
 	public String getTextOfSearch(){        
 		return searchTitle.getText();    
 		}     
 	
 	public void scrollDownMethod() {         
 		Utilites.scrollDownByElement(driver, linkedInOption);         
 		linkedInOption.click();     
 		}     
 	
 	public void windowHandle(){         
 		Utilites.scrollDownByElement(driver, linkedInOption);       
 		linkedInOption.click();        
 		Utilites.switchToWindows(driver);     
 		//accountTitle
 		}      
 	
 	public void getCookiesHandle(){        
 		Utilites.getCookies();     
 		} 
 	
 	public void screenShot() throws IOException {
 		Utilites.screenShotAction(driver);
 		screenShot.click();
 	}
 }

