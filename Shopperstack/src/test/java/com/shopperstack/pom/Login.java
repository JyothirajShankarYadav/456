package com.shopperstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
 @FindBy(xpath = "//button[contains(text(),'Shopper Login')]")   private WebElement shopperLoginbtn;
 @FindBy(xpath = "//button[contains(text(),'Merchant Login')]")  private WebElement merchantLoginbtn;
 @FindBy(xpath = "//button[contains(text(),'Admin Login')]")     private WebElement adminLoginbtn;
 @FindBy(id = "Email")                                           private WebElement emailTextfield;
 @FindBy(id = "Password")                                        private WebElement passwordTextfield;
 @FindBy(xpath ="//span[@class='MuiIconButton-label']//*[local-name()='svg']" ) private WebElement eyeIcon;
 @FindBy(xpath = "//span[text()='Login']")                private WebElement loginButton;
 @FindBy(xpath = "//span[text()='Create Account']")       private WebElement CreateAccountButton;
 @FindBy(id = "Forgot Password?")                         private WebElement forgotPasswordLink;
 //--------------------------------------------------------------------------------------------------------
 public Login(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 //--------------------------------------------------------------------------------------------------------
 public void shopperButton()
 {
	 shopperLoginbtn.click();
 }
 public void merchantButton()
 {
	 merchantLoginbtn.click();
 }
 public void adminButton()
 {
	adminLoginbtn.click(); 
 }
 public WebElement emailtxt()
 {
	 return emailTextfield;
 }
 public WebElement passwordtxt()
 {
	return passwordTextfield; 
 }
 public void eyeIcon()
 {
	 eyeIcon.click();
 }
 public void loginButton()
 {
	 loginButton.click();
 }
 public void createAccountbtn()
 {
	 CreateAccountButton.click();
 }
 public void forgotLink()
 {
	forgotPasswordLink.click(); 
 }
}
 