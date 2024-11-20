package com.shopperstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminRegister
{
 @FindBy(id = "First Name")          private WebElement firstNameTextfield;
 @FindBy(id = "Last Name")           private WebElement lastNameTextfield;
 @FindBy(id="Female")                private WebElement femaleRadiobtn;
 @FindBy(id="Male")                  private WebElement maleRadiobtn;
 @FindBy(id="Other")                 private WebElement othersRadiobtn;
 @FindBy(id="Phone Number")          private WebElement phoneNumberTextfield;
 @FindBy(id="Email Address")         private WebElement emailTextfield;
 @FindBy(id="Password")              private WebElement passwordTextfield;
 @FindBy(id="Confirm Password")      private WebElement confirmPasswordTextfield;
 @FindBy(id="Terms and Conditions")  private WebElement termsCheckbox;
 @FindBy(id="Register")              private WebElement registerbtn;
 @FindBy(id = "Enter Admin Email")   private WebElement adminAccountLink;
 @FindBy(xpath = "//input[@id='Enter Admin Email']/../button/span//*[local-name()='svg']")
 private WebElement linkButon;
 @FindBy(xpath="//input[@id='Password']/../div[1]/button/span//*[local-name()='svg']")  
 private WebElement passEyeIcon;
 @FindBy(xpath="//input[@id='Confirm Password']/../div[1]/button/span[1]//*[local-name()='svg']") 
 private WebElement confirmPassEyeIcon ;
 @FindBy(xpath = "//select[@id='Country']")   private WebElement countryDropdown;
 @FindBy(xpath="//select[@id='State']")       private WebElement stateDropdown;
 @FindBy(xpath="//select[@id='City']")        private WebElement cityDropdown;
 @FindBy(xpath = "//span[text()='Merchant Signup']")  private WebElement merchantSignupButton;
 @FindBy(xpath = "//span[text()='shopper Signup']")   private WebElement shopperSignupButton;
 
 //------------------------------------------------------------------------------------------------------------
 public AdminRegister(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 //--------------------------------------------------------------------------------------------------------
 public WebElement firstname()
 {
	 return firstNameTextfield;
 }
 public WebElement lastname()
 {
	return lastNameTextfield; 
 }
 public void femaleRadio()
 {
	 femaleRadiobtn.click();
 }
 public void maleRadio()
 {
	maleRadiobtn.click(); 
 }
 public void others()
 {
	 othersRadiobtn.click();
 }
 public WebElement phone()
 {
	return phoneNumberTextfield; 
 }
 public WebElement email()
 {
	return emailTextfield; 
 }
 public WebElement password()
 {
	return passwordTextfield; 
 }
 public WebElement confirmPassword()
 {
	return confirmPasswordTextfield; 
 }
 public void register()
 {
	 registerbtn.click();
 }
 public void checkBox()
 {
	termsCheckbox.click(); 
 }
 public void PassEye()
 {
	 passEyeIcon.click();
 }
 public void confirmEyeIcon()
 {
	 confirmPassEyeIcon.click();
 }
 public WebElement AdminaccountLink()
 {
	 return adminAccountLink;
 }
 public void link()
 {
	 linkButon.click();
 }
 public WebElement country()
 {
	 return countryDropdown;
 }
 public WebElement state()
 {
	 return stateDropdown;
 }
 public WebElement city()
 {
	 return cityDropdown;
 }
 public void merchantButton()
 {
	 merchantSignupButton.click();
 }
 public void shopperButton()
 {
	 shopperSignupButton.click();
 }
 
}
