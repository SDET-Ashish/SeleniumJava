package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class secureAreaPage {
	private WebDriver driver;
	
	public secureAreaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getText() {
		return driver.findElement(By.xpath("//div[@id='flash']")).getText();
	}
}
