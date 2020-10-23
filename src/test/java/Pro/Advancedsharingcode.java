package Pro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Advancedsharingcode {
	public WebDriver driver;
	@BeforeClass
	@Parameters({"browser", "URL"})
  public void beforeClass(String browser) {
	  if(browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();	
				driver.get("https//www.Amazon.com"); 

			 driver.manage().window().maximize();
			 
	  }else if(browser.equalsIgnoreCase("Forefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.Facebook.com"); 
			driver.manage().window().maximize();
  }
  }
  @AfterClass
  public void afterClass() throws InterruptedException {
		  System.out.println("This is after");
		  Thread.sleep(6000);
		  driver.close();
  }

}
