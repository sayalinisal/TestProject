package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.BaseClass;

public class LoginActions extends BaseClass{


	public By element_SignInButtonOnMainPage = By.xpath("//a[@class='login']");
	public By element_UserNameField = By.xpath(" //input[@id='email']");
	public By element_PasswordField = By.xpath("//input[@id='passwd']");
	public By element_LogInField=By.xpath("//button[@name='SubmitLogin']");



	//click on sign in button
	public void clickOnSignInButton(WebDriver driver) throws InterruptedException {
		if(driver.findElement(element_SignInButtonOnMainPage).isDisplayed()) {
			driver.findElement(element_SignInButtonOnMainPage).click();
			Thread.sleep(4000);
		}else {
			Assert.fail("Element is not displays on page.");
		}
	}

	//enter username
	public void enterUserName(String username, WebDriver driver) throws InterruptedException {
		if(driver.findElement(element_UserNameField).isDisplayed()) {
			driver.findElement(element_UserNameField).sendKeys(username);
			Thread.sleep(4000);
		}else {
			Assert.fail("Element is not displays on page.");
		}
	}

	//enter password
	public void enterPassword(String password, WebDriver driver) throws InterruptedException {
		if(driver.findElement(element_PasswordField).isDisplayed()) {
			driver.findElement(element_PasswordField).sendKeys(password);
			Thread.sleep(4000);
		}else {
				Assert.fail("Element is not displays on page.");
		}
	}


	//Main Login 
	public void clickOnLogInField(WebDriver driver) throws InterruptedException {
		if(driver.findElement(element_LogInField).isDisplayed()) {
			driver.findElement(element_LogInField).click();
			Thread.sleep(4000);
		}else {
			Assert.fail("Element is not displays on page.");
		}
		
	}

}
