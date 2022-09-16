package org.Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginButton() {
		return login;
	}
	
	public void setUsername(String data) {
		getUsername().sendKeys(data);
	}
	
	public void setPassword(String data) {
		getPassword().sendKeys(data);
	}
	
	public void clickLogin() {
		getLoginButton().click();
	}

}

