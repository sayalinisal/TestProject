package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public WebDriver driver;

	@BeforeTest
	public void startAPP() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://01 testing/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}


	@AfterTest
	public void closeAPP() {
		driver.close();
	}

}
