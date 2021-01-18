package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClassDemo {
	
	public static	WebDriver driver;
	//public static  Properties prop ;
		  @BeforeSuite
		  public void beforeClass()throws InterruptedException, IOException  {
			  String pPath = System.getProperty("user.dir");
			  System.out.println(pPath);
			  
			  //prop = new Properties();
			 // FileInputStream fis = new FileInputStream(pPath+"/configuration/config.properties");
			 // prop.load(fis);
			  System.setProperty("webdriver.chrome.driver", pPath+"/Drivers/chromedriver.exe");
				 driver= new ChromeDriver();
				 driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
				  
			  
		  }
		  @AfterSuite
		public void afterClass() {
		  driver.quit();
		  
		
		
	}
	

}
