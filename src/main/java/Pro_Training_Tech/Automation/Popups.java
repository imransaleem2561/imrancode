package Pro_Training_Tech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("(//div[@class='uitk-field has-floatedLabel-label has-icon'])[1]")).click();
	driver.findElement(By.xpath("//button[@aria-label='Oct 6, 2020']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("(//*[text()='Done'])[2]")).click();

	}

}
