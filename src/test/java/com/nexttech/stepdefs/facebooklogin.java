package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.loginfacebookPOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebooklogin {
	
	WebDriver driver;
	
	
	


	@Given("^user launch facebook url$")
	public void user_launch_facebook_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");    
	    
	}


@Given("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and(String arg1, String arg2) throws Throwable {
	loginfacebookPOM obj= new loginfacebookPOM(driver);
	obj.emailaddess().sendKeys(arg1);
	obj.password().sendKeys(arg2);
}

	
	
	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		loginfacebookPOM obj= new loginfacebookPOM(driver);
		obj.login().click();
		
	
	  
	}



	
	
}
