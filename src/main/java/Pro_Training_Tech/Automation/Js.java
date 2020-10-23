package Pro_Training_Tech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		driver.findElement(By.xpath("//*[text()='Simple Alert']")).click();

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		Thread.sleep(6000);	
		driver.findElement(By.xpath("//button[contains(@onclick,'pushAlert()')]")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[contains(@onclick,'pushConfirm()')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("ConfirmOption")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@onclick,'promptConfirm()')]")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().getText();
		//driver.findElement(By.xpath("//div[contains(@class,'sg-popup-builder-content')]")).click();
		//driver.findElement(By.xpath("//img[contains(@class,'sgpb-popup-close-button-1')]")).click();
		
	}

}
