package BaseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;

import PageObjects.HomePage;

public class BaseTest {
	
	private WebDriver driver; 	
	protected HomePage homepage;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		homepage = new HomePage(driver);
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
}
