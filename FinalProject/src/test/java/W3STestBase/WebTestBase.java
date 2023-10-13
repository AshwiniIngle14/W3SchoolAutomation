package W3STestBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTestBase {
	public static WebDriver driver;
	public static Properties prop;
	//constructor-> load properties file into fileInputStream
	public WebTestBase()
	{
		try {
			//reading property file
			//user.dir->it will take current path
			FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"//properties//config.properties");
			//creating instance for prop:only then we can use methods instance
			prop=new Properties();
			//load the property file
			prop.load(fileInputStream);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void loadUrl()
	{
		//loading url & read property file browser to get browser name
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			//if browser name is chrome then initiate chrome browser
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().deleteAllCookies();
		}
	}
}