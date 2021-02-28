package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {

	public void openApplication() {
		System.setProperty("webdriver.gecko.driver","D:\\Elearnings\\Software Testing\\Testing Training 2021-Naresh IT\\Drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.navigate().to(url);
        System.out.println("Open Application");
        Reporter.log("Open Application");
        Log.info("Open Application");
	} 
	public void closeApplication() {
	    driver.close();
	    System.out.println("Application Closed");
        Reporter.log("Application Closed");
        Log.info("Application Closed");
	    }
	public void login() throws Exception {
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
	    driver.findElement(By.name(btn_login)).click();
	    System.out.println("Login Successfully");
	    Reporter.log("Login Successfully");
        Log.info("Login Successfully");
	    Thread.sleep(3000);
	}
	public void admin_comppro() {
		ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText(mouse_admin))).perform();
		ac.moveToElement(driver.findElement(By.linkText(mouse_cinfo))).perform();
		driver.findElement(By.linkText(link_comprop)).click();
		driver.switchTo().frame(0);
		driver.findElement(By.className(btn_add)).click();
		driver.findElement(By.id(txt_pro_info)).sendKeys(proinfo);
		driver.findElement(By.id(btn_save)).click();
		driver.switchTo().defaultContent();
		
		
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		  Reporter.log("Logout Completed");
	        Log.info("Logout Completed");
		
	}
   
}
