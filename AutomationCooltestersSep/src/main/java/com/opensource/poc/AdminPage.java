package com.opensource.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class AdminPage extends Base{

	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	//OBJECTS
	By btnMenuAdmin = By.id("menu_admin_viewAdminModule");
	By txtSearchUser = By.id("searchSystemUser_userName");
	By btnSearch = By.id("searchBtn");
	By tblUsername = By.xpath("//table/tbody/tr[1]/td[2]");
	
	/*
	 * Click Admin
	 */
	public void clickAdmin() {
		reporter("Click Admin Module");
		click(btnMenuAdmin);
		implicitWait();
		takeScreenshot("AfterClickAdmin");
	}
	
	/*
	 * Search user
	 */
	public void searchUser(String username) {
		reporter("Searching... "+username);
		type(txtSearchUser, username);
		takeScreenshot("TypeUser"+username);
		click(btnSearch);
		implicitWait();
		takeScreenshot("AfterSearchBtn");
	}
	
	/*
	 * Validation exist user in table
	 */
	public void validateUsernameTable(String username) {
		reporter("Verify if this username "+username+ " exists in table");
		String actualValue = getText(tblUsername);
		takeScreenshot("AdminValidation");
		assertEquals(actualValue, username);
	}
}
