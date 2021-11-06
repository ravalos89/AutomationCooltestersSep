package com.opensource.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class LoginPage extends Base{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//OBJECTS
	By txtUsername = By.id("txtUsername");
	By txtPassword = By.id("txtPassword");
	By btnLogin = By.id("btnLogin");
	By lnkWelcome = By.id("welcome");
	By lnkLogout = By.xpath("//a[contains(text(), 'Logout')]");
	
	/*
	 * Login OrangeHRM
	 * @author: ricardo.avalos
	 * @date: 10302021
	 */
	public void loginOrange(String url, String username, String password) {
		reporter("Login Orange & Enter username and password");
		launchBrowser(url);
		type(txtUsername, username);
		type(txtPassword, password);
		takeScreenshot("TypedUserPwd");
		click(btnLogin);
		reporter("Clicked Login");
		waitForElementPresent(lnkWelcome);
		takeScreenshot("LoggedSuccessfully");
		reporter("Verify User is logged successfully");
	}
	
	/*
	 * Logout
	 */
	public void logoutOrange() throws InterruptedException {
		reporter("Logout Prange HRM Portal...");
		click(lnkWelcome);
		Thread.sleep(2000);
		takeScreenshot("ClickedWelcome");
		click(lnkLogout);
		implicitWait();
		takeScreenshot("AfterLogout");
		closeBrowser();
	}
}
