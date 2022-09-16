package org.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class BookingConfirmationPage extends BaseClass {
	
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "order_no")
	private WebElement orderNo;
	
	@FindBy(id = "search_hotel")
	private WebElement searchHotelButton;
	
	@FindBy(id = "my_itinerary")
	private WebElement MyItineraryButton;
	
	@FindBy(id = "logout")
	private WebElement LogoutButton;
	
	public WebElement getOrderNo() {
		return orderNo;
	}
	
	public WebElement getSearchHotelButton() {
		return searchHotelButton;
	}
	
	public WebElement getMyItineraryButton() {
		return MyItineraryButton;
	}
	
	public WebElement getLogoutButton() {
		return LogoutButton;
	}
	
	public void ClickSearchHotelButton() {
		getSearchHotelButton().click();
		
	}
	
	public void ClickMyItineraryButton() {
		getMyItineraryButton().click();
		
	}
	public void ClickLogoutButton() {
		getLogoutButton().click();
	}

}
