package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSucessPage {

	public WebDriver driver;
	
	@FindBy(xpath = "//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]")
	private WebElement accountSuccessCreationMessage;
	
	@FindBy(linkText = "Continue")
	private WebElement continueButtonToAccount;
	
	
	
	public AccountSucessPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean retrieveAccountSuccessMessage() {
		return accountSuccessCreationMessage.equals(accountSuccessCreationMessage);
		
		
	}
	public AccountPage clickOnContinue() {
		continueButtonToAccount.click();
		return new AccountPage(driver);
	}

}
