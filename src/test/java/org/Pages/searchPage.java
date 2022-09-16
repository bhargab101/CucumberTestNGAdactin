package org.Pages;

import org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi.withSha224;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class searchPage extends BaseClass {
	
	public searchPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(id = "room_nos")
	private WebElement roomNo;
	
	@FindBy(id = "datepick_in")
	private WebElement dateIn;
	
	@FindBy(id = "datepick_out")
	private WebElement dateOut;
	
	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(id = "child_room")
	private WebElement childrenPerRoom;
	
	@FindBy(id = "Submit")
	private WebElement searchButton;
	
	@FindBy(id = "Reset")
	private WebElement resetButton;
	
	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotels() {
		return hotels;
	}
	
	public WebElement getRoomType() {
		return roomType;
	}
	
	public WebElement getRoomNo() {
		return roomNo;
	}
	
	public WebElement getDateIn() {
		return dateIn;
	}
	
	public WebElement getDateOut() {
		return dateOut;
	}
	
	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
	
	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	public WebElement getResetButton() {
		return resetButton;
	}
	
	public void setLocation(String data) {
		getLocation().sendKeys(data);
		
	}
	
	public void setHotel(String data) {
		getHotels().sendKeys(data);
		
	}
	
	public void setRoomType(String data) {
		getRoomType().sendKeys(data);
		
	}
	
	public void setNoOfRooms(String data) {
		getRoomNo().sendKeys(data);
	}
	
	public void setDateIn(String data) {
		getDateIn().sendKeys(data);
		
	}
	
	public void setDateOut(String data) {
		getDateOut().sendKeys(data);
		
	}
	
	public void setAdultsPerRoom(String data) {
		getAdultsPerRoom().sendKeys(data);
	}
	
	public void setChildrenPerRoom(String data) {
		getChildrenPerRoom().sendKeys(data);
	}
	
	public void ClickSearch() {
		getSearchButton().click();;
	}
	
	public void ClickReset() {
		getResetButton().click();;
	}
	

}
