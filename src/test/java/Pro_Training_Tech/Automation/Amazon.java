package Pro_Training_Tech.Automation;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethods.ForgotPasswordPage;
import PageClassesMethods.Homme;
import PageClassesMethods.SignINPage;
import Pro.Advancedsharingcode;

        public class Amazon{
		public WebDriver driver;
		 @Test(priority = 1)
		 public void D() {
		 System.out.println("This is test annotaion");
		 Homme it=new Homme(driver);
		it.AmazonIconClick();
		it.SearchFieldEnter();
		it.SEarchIconClicks();
		
		//String ActualURL=driver.getCurrentUrl();
		//SoftAssert Confirm=new SoftAssert();
		//Confirm.assertEquals(ActualURL, "https://www.amazon.com/s?k=Phones&ref=nb_sb_noss");
		//Assert.assertEquals(ActualURL,"https://www.amazon.com/s?k=Phones&ref=nb_sb_noss");
		
		//WebElement Customerlinkservice = it.Customerserviceverifiacation();
		//boolean Customer= Customerlinkservice.isDisplayed();
		//Assert.assertEquals(Customer, true);
		//Confirm.assertAll();

		//String ActualURL=driver.getCurrentUrl();
		//System.out.println(ActualURL);
		//Assert.assertEquals(ActualURL,"https://www.amazon.com/s?k=Phones&ref=nb_sb_noss");
		  }  
		 @Test(priority = 2)
		  public void ForgotPasswordfunctions() throws InterruptedException {
		 Homme it=new Homme (driver);
		 SignINPage ob=new SignINPage(driver);
		 ForgotPasswordPage forgot=new ForgotPasswordPage(driver);
		 it.SignINClick();
		 it.SignInHover();
		 ob.NeedHelpClick();
		 ob.ForgotPasswordClick();
		 forgot.EmailFieldKeys();
		 forgot.ContinueButtonClick();
		 
		  }
		 
		 @BeforeClass
	  public void beforeClass() {
		  browsers("Chrome");
		  System.out.println("This is Before");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");						
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  driver.get("https://www.Amazon.com");
		  driver.manage().window().maximize();
		  
		  // System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\geckodriver.exe");
		  //driver=new FirefoxDriver();
		

		  
		  
		  }

		  @AfterClass
		  public void afterClass() throws InterruptedException {
		 System.out.println("This is after");
		//  Thread.sleep(6000);
		//  driver.close();
		 }
			  
		  public void browsers(String br) {
		 if(br.equalsIgnoreCase("Chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.Amazon.com");

		driver.manage().window().maximize();

		 }else if(br.equalsIgnoreCase("Forefox")) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.Amazon.com");
		driver.manage().window().maximize();
		 }
		  }
		  
	}

		
