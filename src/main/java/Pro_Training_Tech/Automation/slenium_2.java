package Pro_Training_Tech.Automation;


	
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class slenium_2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maria\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
			//WebElement Ids=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input/[1])"));
		//	Ids.sendKeys("imran.nsight@gmail.com");
			
	
		WebElement emailbutton=driver.findElement(By.xpath("//input[@name='email']"));
			emailbutton.sendKeys("Imran.Nsightads@gmail.com");
			
		WebElement PassID=driver.findElement(By.name("pass"));
		
		   PassID.sendKeys("Awealth786");
		   
		   
		   WebElement LogButton=driver.findElement(By.name("login"));
			LogButton.click();
		}

}
