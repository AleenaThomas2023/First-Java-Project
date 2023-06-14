package com.aleena.LearningSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondSelineumSession {

	WebDriver wd;

	@BeforeMethod

	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver.exe");

		wd = new ChromeDriver();

		wd.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		wd.manage().window().maximize();

	}

	@Test
	public void validateEnquirySuccessfully() {

		WebElement contactUs = wd.findElement(By.xpath("//a[text()='Contact Us']"));

		WebElement nameInput = wd.findElement(By.cssSelector("#input-name"));

		WebElement emailInput = wd.findElement(By.cssSelector("#input-email"));

		WebElement enquiryInput = wd.findElement(By.cssSelector("#input-enquiry"));

		WebElement submitButton = wd.findElement(By.cssSelector("input[type='submit']"));

		contactUs.click();

		nameInput.sendKeys("Tom");

		emailInput.sendKeys("tom@email.com");

		enquiryInput.sendKeys("Test inquiry");

		submitButton.click();

		WebElement successMessage = wd
				.findElement(By.xpath("//p[text()='Your enquiry has been successfully sent to the store owner!']"));

		String messageText = successMessage.getText();

		Assert.assertEquals(messageText, "Your enquiry has been successfully sent to the store owner!",
				"Message not correct");

	}

	@AfterMethod
	public void tearDown() {

		wd.close();
	}
}
