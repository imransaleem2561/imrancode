package Self_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebD {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");

		ChromeDriver driver;
		Object WebDriver = driver= new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		WebElement Singin = driver.findElement(By.id("createAccountSubmit"));
		Singin.click();
		WebElement CustId= driver.findElement(By.id("ap_customer_name"));
		CustId.sendKeys("Imran");
		WebElement EmailId= driver.findElement(By.id("ap_email"));
		EmailId.sendKeys("Imran.nsight@gmail.com");
		WebElement PassId = driver.findElement(By.id("ap_password"));
		PassId.sendKeys("Amani1234");
				
		


}
}