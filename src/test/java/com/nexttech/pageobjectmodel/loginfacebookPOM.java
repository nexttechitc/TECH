package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginfacebookPOM {
	WebDriver driver;
	 public  loginfacebookPOM(WebDriver driver) {
	  this.driver=driver;
	 
	  PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//input[@type=\"text\"]")
	 WebElement edit_emailaddress;
	 public WebElement emailaddess()
	 {
	  return edit_emailaddress;
	 }
	 
	 @FindBy(xpath="//input[@type=\"password\"]")// //input[@name='password']
	 WebElement edit_password;
	 public WebElement password()
	 {
	  return edit_password; 
	 }
	 
	 @FindBy(name="login")
	 WebElement click_login;
	 public WebElement login() {
	  return click_login;
	 }

}
