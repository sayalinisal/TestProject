package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.BaseClass;

public class Logout extends BaseClass {
	
	public By logout = By.xpath("//a[@class='logout']");
	
	public void LogoutApp(String signout,WebDriver driver) throws InterruptedException {
		
		if(driver.findElement(logout).isDisplayed())
		{
			driver.findElement(logout).click();
			Thread.sleep(4000);
			System.out.println("logout app");
		}
		else
		{
			Assert.fail("logout page not present");
		}
	}

}
