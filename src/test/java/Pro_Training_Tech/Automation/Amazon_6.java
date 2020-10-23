package Pro_Training_Tech.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethods.Homme;
import Pro.Advancedsharingcode;

public class Amazon_6 extends Advancedsharingcode {
	public WebDriver driver;
  @Test
  public void f() {
	  System.out.println("This is test annotaion");
	    Homme it=new Homme(driver);
		it.AmazonIconClick();
		String ActualURL=driver.getCurrentUrl();
		SoftAssert Confirm=new SoftAssert();
		Confirm.assertEquals(ActualURL, "https://www.amazon.com/s?k=Phones&ref=nb_sb_noss");
		//Assert.assertEquals(ActualURL,"https://www.amazon.com/s?k=Phones&ref=nb_sb_noss");		
		it.SearchFieldEnter();
		it.SEarchIconClicks();
		WebElement Customerlinkservice = it.Customerserviceverifiacation();
		boolean Customer= Customerlinkservice.isDisplayed();
		Assert.assertEquals(Customer, true);
		Confirm.assertAll();
  }
}
 