package org.StepDefinitions;

import org.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.utilities.ReadConfig;

import Base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionLogin extends BaseClass {
	
	@Given("Navigate to http:\\/\\/adactinhotelapp.com\\/index.php")
	public void navigate_to_http_adactinhotelapp_com_index_php() {
	    driver.get(ReadConfig.getUrl());
	}

	@When("Entered invalid username and password")
	public void entered_invalid_username_and_password() {
	    LoginPage page = new LoginPage();
	    page.setUsername("bhaskar");
	    page.setPassword("1234");
	}

	@Then("returns error message saying Invalid Login details or Your Password might have expired. Click here to reset your password")
	public void returns_error_message_saying_invalid_login_details_or_your_password_might_have_expired_click_here_to_reset_your_password() {
	   String actual = driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[5]/td[2]/div/b")).getText();
	   Assert.assertEquals(actual, "Invalid Login details or Your Password might have expired. Click here to reset your password");
	}

	@When("Entered valid username and password")
	public void entered_valid_username_and_password() {
		 LoginPage page = new LoginPage();
		    page.setUsername(ReadConfig.getUserName());
		    page.setPassword(ReadConfig.getPassword());
	}

	@Then("Navigate to search hotel page")
	public void navigate_to_search_hotel_page() {
	   String actual = driver.getCurrentUrl();
	   String expected = "http://adactinhotelapp.com/SearchHotel.php";
	   Assert.assertEquals(actual, expected);
	}

}
