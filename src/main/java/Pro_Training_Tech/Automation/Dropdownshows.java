package Pro_Training_Tech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.Select;

public class Dropdownshows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
				
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement	createAnAccount =driver.findElement(By.id("u_0_2"));
		createAnAccount.click();
		Thread.sleep(6000);
		 WebElement FirstnameFid=driver.findElement(By.name("firstname"));
		 FirstnameFid.sendKeys("Imran");	
		 WebElement LastnameLid=driver.findElement(By.name("lastname"));
		 LastnameLid.sendKeys("Saleem");
		 
		 WebElement Email =driver.findElement(By.name("reg_email__"));
		 Email.sendKeys("imran.nsight@gmail.com");
		 
		 WebElement PassConf = driver.findElement(By.name("reg_email_confirmation__"));
		 PassConf.sendKeys("Imran.nsight@gmail.com");
		 
		 WebElement Pass = driver.findElement(By.id("password_step_input"));
		 Pass.sendKeys("Amani2561");
		 
		
		Select wt=new Select(driver.findElement(By.name("birthday_month")));
		wt.selectByVisibleText("Apr");
		
		Select ds=new Select(driver.findElement(By.name("birthday_day")));
		ds.selectByValue("17");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
        
		 WebElement submitButton = driver.findElement(By.name("websubmit"));
		 submitButton.click();
		 
		
				
	}

}
