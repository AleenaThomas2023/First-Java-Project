package com.aleena.LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumSession {

	WebDriver wd;// scope of instance class level-access it anywhere in the class

	@BeforeMethod

	public void setup() {

		// Basic Setup //key //value
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver.exe");

		// Initialize WebDriver interface

		wd = new ChromeDriver();

		// opens a browser with https

		wd.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}

	@Test
	public void Validatelogin() {
		// Find the elements in DOM

		WebElement emailInput = wd.findElement(By.cssSelector("[id^='input-e']"));

		WebElement passwordInput = wd.findElement(By.cssSelector("[id^='input-p']"));

		WebElement loginBtn = wd.findElement(By.cssSelector("input[value = 'Login']"));

		// X-path

		// WebElement emailInput = wd.findElement(By.xpath("//input[@name = 'email']"));

		// WebElement passwordInput = wd.findElement(By.xpath("//input[@name =
		// 'password']"));

		// WebElement loginBtn = wd.findElement(By.xpath("//input[@value= 'Login']"));

		emailInput.sendKeys("tony@email.com");

		passwordInput.sendKeys("Password1");

		loginBtn.click();

		System.out.println(wd.getTitle());

		// actual //expected //Negative statement
		Assert.assertEquals(wd.getTitle(), "My Account", "You are not on Correct Page");

		
	}

	@AfterMethod

	public void tearDown() {

		// Used to close the current webdriver instance, close the browser

		wd.close();

	}

}