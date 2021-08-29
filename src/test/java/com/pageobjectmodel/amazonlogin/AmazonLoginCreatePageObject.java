package com.pageobjectmodel.amazonlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginCreatePageObject {
	public WebDriver driver;
	
	public AmazonLoginCreatePageObject(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]") WebElement clickSignIn;
	public void singInClick() {
		clickSignIn.click();
	}
	
	@FindBy(xpath="//*[@id=\"ap_email\"]") WebElement userEmail;
	public void enterUserEmail(String uemail) {
		userEmail.sendKeys(uemail);
	}
	
	@FindBy(xpath="//*[@id=\"continue\"]") WebElement continuebtn;
	public void clickConBtn() {
		continuebtn.click();
	}
	
	@FindBy(xpath="//*[@id=\"ap_password\"]") WebElement password;
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]") WebElement click_SignInbtn;
	public void signIn() {
		click_SignInbtn.click();
		
	}

}
