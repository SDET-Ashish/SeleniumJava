package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	public By formAuthenticationLink = By.linkText("Form Authentication");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public LoginPage formclick() {
		driver.findElement(formAuthenticationLink).click();
		return new LoginPage(driver);
		
	}

}
