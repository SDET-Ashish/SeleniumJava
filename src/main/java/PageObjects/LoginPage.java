package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void userNameEntry(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);;
		
	}
	public void passwordEntry(String password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);;
		
	}
	
	public secureAreaPage loginClick() {
		driver.findElement(By.xpath("//button[@class='radius']")).click();
		return new secureAreaPage(driver);
	}
}
