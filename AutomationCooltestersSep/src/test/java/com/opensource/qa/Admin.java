package com.opensource.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Admin {
	
	String username, password;

	@BeforeTest
	public void beforeTest() {		
		this.username = "Admin";
		this.password = "admin123";
	}

	@Test
	public void TC001_Admin_SearchEmployee() throws InterruptedException {

		// Step 1
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Reporter.log("Open Browser OrangeHRM web page");
		
		// Step 2
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Enter Username and password");
		
		// Step 3
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
		Reporter.log("Validate that you have logged in successfully");
		
		// Step 4
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBtn")));
		Reporter.log("Click Admin - Go to the admin page");
		
		// Step 5
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys(username);
        Reporter.log("Enter Username search table");

        // Step 6
        driver.findElement(By.id("searchBtn")).click();
        Reporter.log("Validate that Admin exist");
        
        // Step 7
        String actualValue = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
        Assert.assertEquals(actualValue, username);
        Reporter.log("Verify username exist in table");
        
        // Step 8
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Reporter.log("Log out");
        
        // Step 9
        driver.close();
        Reporter.log("Close Browser");
        		
	}
	
	@Test
	public void TC002_Admin_SearchEmployee_NotExist() throws InterruptedException {

		// Step 1
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Reporter.log("Open Browser OrangeHRM web page");
		
		// Step 2
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Enter Username and password");
		
		// Step 3
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
		Reporter.log("Validate that you have logged in successfully");
		
		// Step 4
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBtn")));
		Reporter.log("Click Admin - Go to the admin page");
		
		// Step 5
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys(username);
        Reporter.log("Enter Username search table");

        // Step 6
        driver.findElement(By.id("searchBtn")).click();
        Reporter.log("Validate that Admin exist");
        
        // Step 7
        String actualValue = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
        Assert.assertEquals(actualValue, username);
        Reporter.log("Verify username exist in table");
        
        // Step 8
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Reporter.log("Log out");
        
        // Step 9
        driver.close();
        Reporter.log("Close Browser");
        		
	}

	@AfterTest
	public void afterTest() {
	}

}
