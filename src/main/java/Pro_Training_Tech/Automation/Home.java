package Pro_Training_Tech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// How to open the site into chrome browswe
		//i) Set up chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		//ii Call chrome driver constructor
	WebDriver driver=new ChromeDriver();
		//iii Open the site
		driver.get("https://www.facebook.com");
		//iv how to maximize browser 
		driver.manage().window().maximize();
		//v How to refresh the bowser
		//Thread.sleep(6000);	
		//vi how to go backwards
		driver.navigate().back();
		//vii how to go forward
		driver.navigate().forward();
		// how to find locators 
		//i) id
		//ii)linktext
		//iii)partial link text
		//iv)Class name
		//v)tagname
		//vi)Css selector
		//vii)By Name
		
		// how to store locator variable 
	WebElement	createAnAccount =driver.findElement(By.id("u_0_2"));
	
	 // how to click element
		createAnAccount.click();
		
		// How to click on link
		WebElement Forgotlinkclick=driver.findElement(By.linkText("Forgot Password?"));
		
	//Forgotlinkclick.click();
	//	WebElement Forgotlinkpartial=driver.findElement(By.linkText("Forgot"));
		Thread.sleep(6000);
		 WebElement FirstnameFid=driver.findElement(By.name("firstname"));
		 FirstnameFid.sendKeys("Imran");		
		
		 WebElement LastnameFid=driver.findElement(By.name("lastname"));
		 LastnameFid.sendKeys("Saleem");
		 
		 WebElement EmailFid=driver.findElement(By.id("u_1_g"));
		 EmailFid.sendKeys("imran.nsight@gmail.com");
	}

}
