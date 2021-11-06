package com.opensource.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;
import com.opensource.poc.AdminPage;
import com.opensource.poc.LoginPage;

public class TC001_Admin_SearchEmployee {
	
	WebDriver driver;
	Base base;
	LoginPage login;
	AdminPage admin;
	String username, password;
	
	@BeforeTest
	public void beforeTest() {
		
		// Set up driver
		base = new Base(driver);
		driver = base.chromeDriver();
		login = new LoginPage(driver);
		admin = new AdminPage(driver);
		
		//JSON
//		this.username = base.getJSONValue(this.getClass().getSimpleName(), "username");
//		this.password = base.getJSONValue(this.getClass().getSimpleName(), "password");
		
		//EXCEL
		this.username = base.getCellData(this.getClass().getSimpleName(), 1, 0);
		this.password = base.getCellData(this.getClass().getSimpleName(), 1, 1);
	}

	@Test
	public void tc001() throws InterruptedException {
		
		// Step 1 Open Browser "OrangeHRM" web page
		// Step 2 Enter Username and Password
		// Step 3 Validate that you have logged in successfully
		login.loginOrange(GlobalVariables.QA_URL, username, password);
		
		// Step 4
		admin.clickAdmin();
		
		// Step 5 & 6
		admin.searchUser(username);
		
		// Step 7
		admin.validateUsernameTable(username);
		
		// Step 8 & 9
		login.logoutOrange();
		
	}

	@AfterTest
	public void afterTest() {
	}

}
