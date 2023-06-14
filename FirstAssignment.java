package com.aleena.LearningSelenium;

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

import java.util.Random;

public class FirstAssignment {

    WebDriver wd; // instance variable
    WebDriverWait wait;
    String randomEmail;
    String randomPassword;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver.exe");
        wd = new ChromeDriver();
        wait = new WebDriverWait(wd, 15); // time out value of 15 seconds
        wd.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
        wd.manage().window().maximize();
    }

    @Test
    public void validateSignup() {
        generateRandomEmailAndPassword();
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Account']")));
        myAccount.click();

        WebElement register = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Register']")));
        register.click();

        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input-firstname")));
        firstName.sendKeys("sam");

        WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input-lastname")));
        lastName.sendKeys("thomas");

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input-email")));
        email.sendKeys(randomEmail);

        WebElement telephone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input-telephone")));
        telephone.sendKeys("647-333-4542");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input-password")));
        password.sendKeys(randomPassword);

        WebElement confirmPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input-confirm")));
        confirmPassword.sendKeys(randomPassword);

        WebElement newsLetterSubscribe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='newsletter'])[2]")));
        newsLetterSubscribe.click();

        boolean isNewsLetterSubscribeEnabled = newsLetterSubscribe.isSelected();
        Assert.assertTrue(isNewsLetterSubscribeEnabled, "Button is not selected");

        WebElement privacyPolicyCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name=agree]")));
        privacyPolicyCheckbox.click();

        boolean isPrivacyCheckboxSelected = privacyPolicyCheckbox.isSelected();
        Assert.assertTrue(isPrivacyCheckboxSelected, "checkbox not selected");

        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Continue']")));
        boolean isContinueButtonEnabled = continueButton.isEnabled();
        Assert.assertTrue(isContinueButtonEnabled, "Continue Button is not enabled");

        continueButton.click();
        Assert.assertEquals(wd.getTitle(), "Your Account Has Been Created!", "You are not on the correct page");
    }

    @Test(dependsOnMethods = "validateSignup")
    public void validateLoginLogout() {
        login(randomEmail, randomPassword);
        logout();
        Assert.assertEquals(wd.getTitle(), "Account Logout", "You are not on the correct page");
    }

    @Test(dependsOnMethods = "validateSignup")
    public void validateUpdatePassword() {
        login(randomEmail, randomPassword);
        String updatedPassword = getRandomPassword();
        changePassword(updatedPassword,updatedPassword);
        logout();
        login(randomEmail, updatedPassword);
        logout();
        Assert.assertEquals(wd.getTitle(), "Account Logout", "You are not on the correct page");
    }

    

    @AfterMethod
    public void tearDown() {
        wd.close();
    }

    private void generateRandomEmailAndPassword() {
        Random rand = new Random();
        int randomInt = rand.nextInt(1000);
        randomEmail = "user" + randomInt + "@example.com";
        randomPassword = getRandomPassword();
    }

    private String getRandomPassword() {
        Random rand = new Random();
        int randomInt = rand.nextInt(100000);
        return "password" + randomInt;
    }

    private void login(String email, String password) {
        wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input-email")));
        emailInput.sendKeys(email);

        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input-password")));
        passwordInput.sendKeys(password);

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Login']")));
        loginButton.click();

        String expectedAccountUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/account";
        wait.until(ExpectedConditions.urlToBe(expectedAccountUrl));
        Assert.assertEquals(wd.getCurrentUrl(), expectedAccountUrl);
    }

    private void logout() {
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Account']")));
        myAccount.click();

        WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Logout']")));
        logout.click();

       
    }

    private void changePassword(String newPassword , String confirmNewPassword) {
        WebElement changePassword = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Change your password']")));
        changePassword.click();

        WebElement oldPasswordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input-password")));
        oldPasswordInput.sendKeys(newPassword);

        WebElement newPasswordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input-confirm")));
        newPasswordInput.sendKeys(confirmNewPassword);

        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Continue']")));
        continueButton.click();

        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-success alert-dismissible']")));
        Assert.assertEquals(successMessage.getText(), "Success: Your password has been successfully updated.");
    }
}
