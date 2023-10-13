package W3STestCase;

	import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.asserts.SoftAssert;

import W3STestBase.WebTestBase;
import W3SchoolsPages.HomePage;
import W3SchoolsPages.LoginPage;
import W3SchoolsPages.MyAccountPage;

	

	public class TestCase extends WebTestBase{ 
		MyAccountPage myAccountPage; 	
		HomePage homePage; 	
		LoginPage loginPage; 	
	//Loading the config file     
		public TestCase()
		{         
		super();    
		}                	
	   @BeforeMethod 	
	   public void BeforeMethod() 	{ 		
		   //Loading the driver file and establishing the connection ,loading the url 	
		   loadUrl();
		   myAccountPage = new MyAccountPage();	 	 
		   homePage = new HomePage();      
		   loginPage = new LoginPage();       
		   }   
	   @Test(priority=1)
	   public void verifyLoginWithValidCredential(){      
		   SoftAssert softAssert = new SoftAssert();      
		   homePage.userSearchClick();
		   
		   loginPage.login(prop.getProperty("emailid"), prop.getProperty("password"));      
		         
		   softAssert.assertAll();
		   }
	   @Test (priority=2) 
	   public void verifySearchBar(){      
		   SoftAssert softAssert = new SoftAssert();     
		   myAccountPage.search();          
		   softAssert.assertAll();  
		   }  
//   @Test(priority=3)
//	   public void verifyMouseHover(){      
//		   SoftAssert softAssert = new SoftAssert();      
//		   myAccountPage.mouseHover();      
//		   softAssert.assertAll();
//		   } 
	   @Test(priority=3) 
	   public void verifyScrollup(){     
			
		    JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		    javascriptExecutor.executeScript("window.scrollBy(0,2000)");
		}
	  @Test(priority=4) 
	  public void verifyScrollDown(){     

			    JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
			    javascriptExecutor.executeScript("window.scrollBy(0,2000)");
			}
	   
	   @Test  (priority=5)
	   public void verifyGetWindowHandle()
	   {      
		   SoftAssert softAssert = new SoftAssert();     
		   myAccountPage.windowHandle(); 
		   softAssert.assertAll();

		   }  
	  
	   @Test (priority=6)
	   public void verifyCookiesHandle(){     
		   SoftAssert softAssert = new SoftAssert();     
		   myAccountPage.getCookiesHandle();      
	       softAssert.assertAll();  
	       }
	   @Test (priority=7)
	   public void screenShot() throws IOException {
			SoftAssert softAssert=new SoftAssert();
			myAccountPage.screenShot();
			softAssert.assertAll();
	   }
	   
	   
	   
	  
	   @AfterMethod  public void afterMethod(){   
		driver.close();  
		}
	}


