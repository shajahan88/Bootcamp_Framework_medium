package com.TN.qa.Testcase;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.AccountSucessPage;
import pages.Homepage;
import pages.Register_Page;
 
public class RegisterTest {
	public WebDriver driver;
	public Homepage homepage;
	public Register_Page register_page;
	public AccountSucessPage accountsucesspage;
	public AccountPage accountpage;

	
	@BeforeMethod
	public void setup() {
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo");
	Homepage homepage = new Homepage(driver);
	homepage.clickOnMyAccountDropdown();
	register_page = homepage.clickOnRegister();
	
	}
	@Test
	public void registerWithValidcredentials() {
	register_page.enterFirstname();
	register_page.enterLastName();
	register_page.enterEmail();
	register_page.enterTelephone();
	register_page.enterPassword();
	register_page.enterConfirmPassword();
	register_page.clickOnPrivacycheckbox();
	register_page.clickOnNewsLetterButton();
	accountsucesspage = register_page.clickOnContinueButton();
	Assert.assertTrue(accountsucesspage.retrieveAccountSuccessMessage());
	accountpage = accountsucesspage.clickOnContinue();
	Assert.assertTrue(accountpage.getDisplayStatusOfEditAccountInfo());
	driver.quit();
	
		
		
	}
}
