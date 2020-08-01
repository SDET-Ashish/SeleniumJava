package Tests;
import static org.testng.Assert.*;

import org.testng.annotations.Test;

import BaseClass.BaseTest;
import PageObjects.LoginPage;
import PageObjects.secureAreaPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void validLogin() {
		LoginPage loginpage = homepage.formclick();
		loginpage.userNameEntry("tomsmith");
		loginpage.passwordEntry("SuperSecretPassword!");
		secureAreaPage secureareapage = loginpage.loginClick();
		System.out.println(secureareapage.getText());
		assertTrue(secureareapage.getText().contains("You logged into a secure area!"));
		
		}
}
