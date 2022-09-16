package org.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class selectHotelPage extends BaseClass {
	
	public selectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	@FindBy(id = "cancel")
	private WebElement cancelButton;
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	
	public WebElement getContinueButton() {
		return continueButton;
	}
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public void setRadioButton() {
		getRadioButton().click();
		
	}
	
	public void setContinueButton() {
		getContinueButton().click();
		
	}
	
	public void setCancelButton() {
		getCancelButton().click();
		
	}
	
	

}
