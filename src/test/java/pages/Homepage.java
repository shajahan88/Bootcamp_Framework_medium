package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public WebDriver driver;
	
	@FindBy(linkText = "My Account")
	private WebElement accountDropdown;
	
	@FindBy(linkText = "Register")
	private WebElement registeroption;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnMyAccountDropdown() {
		accountDropdown.click();
	}
	public Register_Page clickOnRegister() {
		registeroption.click();
		return  new Register_Page(driver);
	}

	
	}
	


