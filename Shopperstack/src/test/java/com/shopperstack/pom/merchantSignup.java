package com.shopperstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class merchantSignup 
{
	 @FindBy(id = "First Name")          private WebElement firstNameTextfield;
	 @FindBy(id = "Last Name")           private WebElement lastNameTextfield;
	 @FindBy(id="Female")                private WebElement femaleRadiobtn;
	 @FindBy(id="Male")                  private WebElement maleRadiobtn;
	 @FindBy(id="Other")                 private WebElement othersRadiobtn;
	 @FindBy(id="Phone Number")          private WebElement phoneNumberTextfield;
	 @FindBy(id="Email Address")         private WebElement emailTextfield;
	 @FindBy(id="Password")              private WebElement passwordTextfield;
	 @FindBy(xpath = "//span[text()='Next']")   private WebElement nextButton;
	 @FindBy(xpath = "//span[text()='Back']")   private WebElement backButton;
	 @FindBy(xpath = "//input[@id='Password']/../div[1]/button/span//*[local-name()='svg']")
	 private WebElement passEyeIcon;
	 @FindBy(id="Company Name")          private WebElement companyNameTextfield;
	 @FindBy(id="Company Email")         private WebElement companyEmailTextfield;
	 @FindBy(id="Company Phone Number")  private WebElement companyPhoneTextfield;
	 @FindBy(id="Company GSTN")          private WebElement gstTextfield;
	 @FindBy(id="Company Registration Number") private WebElement registernationTextfield;
	 @FindBy(id="Company Website")       private WebElement websiteTextfield;
	 @FindBy(id="Commission")            private WebElement commissionTextfield;
	 @FindBy(id="Company Type")          private WebElement companyTypeDropdown;
	 @FindBy(id="Building Information")  private WebElement buildingTextfield;
	 @FindBy(id="Landmark")              private WebElement landmarkTextfield;
	 @FindBy(id="Street Info")           private WebElement streetTextfield;
	 @FindBy(id="Pincode")               private WebElement pincodeTextfield;
	 @FindBy(id="Country")               private WebElement countryDD;
	 @FindBy(id="State")                 private WebElement stateDD;
	 @FindBy(id="City")                  private WebElement cityDD;
	 @FindBy(id="Terms And Conditions")  private WebElement TermsCheckBox;
	 @FindBy(xpath = "//span[text()='Finish']") private WebElement finishButton; 
	 @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li[1]") private WebElement beauty;
	 @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li[2]") private WebElement Pharmacy;
	 @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li[3]") private WebElement Grooming;
	 @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li[4]") private WebElement Clothing;
	 @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li[5]") private WebElement Electronic;
	 @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li[6]") private WebElement Hardware;
	 @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li[7]") private WebElement Furniture;
	 @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li[8]") private WebElement Appliances;
	 @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li[9]") private WebElement Books;
	 @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li[10]") private WebElement toys;
	 @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li[11]") private WebElement Others;
//=========================================================================================================
	 public merchantSignup(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
//=========================================================================================================
	 public WebElement firstname()
	 {
		 return firstNameTextfield;
	 }
	 public WebElement lastname()
	 {
		 return lastNameTextfield;
	 }
	 public WebElement email()
	 {
		 return emailTextfield;
	 }
	 public WebElement phone()
	 {
		 return phoneNumberTextfield;
	 }
	 public WebElement password()
	 {
		 return passwordTextfield;
	 }
	 public WebElement companyName()
	 {
		 return companyNameTextfield;
	 }
	 public WebElement companyEmail()
	 {
		 return companyEmailTextfield;
	 }
	 public WebElement companyPhone()
	 {
		 return companyPhoneTextfield;
	 }
	 public WebElement gst()
	 {
		 return gstTextfield;
	 }
	 public WebElement companyRegistration()
	 {
		 return registernationTextfield;
	 }
	 public WebElement website()
	 {
		 return websiteTextfield;
	 }
	 public WebElement commission()
	 {
		 return commissionTextfield;
	 }
	 public WebElement companyTypeDD()
	 {
		 return companyTypeDropdown;
	 }
	 public WebElement building()
	 {
		 return buildingTextfield;
	 }
	 public WebElement landmark()
	 {
		 return landmarkTextfield;
	 }
	 public WebElement Street()
	 {
		 return streetTextfield;
	 }
	 public WebElement pincode() { return pincodeTextfield;}
	 public WebElement country() { return countryDD;}
	 public WebElement state() { return stateDD;}
	 public WebElement city() { return cityDD;}
	 public void maleRadio() { maleRadiobtn.click();}	 
	 public void femaleRadio() { femaleRadiobtn.click();}
	 public void otherRadio() { othersRadiobtn.click();}
	 public void nextButton() { nextButton.click();}
	 public void backButton() { backButton.click();}
	 public void checkBox() { TermsCheckBox.click();}
	 public void passEyeIcon() { passEyeIcon.click();}
	 public WebElement Beauty() { return beauty;}
	 public WebElement pharmacy() { return Pharmacy;}
	 public WebElement grooming() { return Grooming;}
	 public WebElement clothing() { return Clothing;}
	 public WebElement electronic() {return  Electronic;}
	 public WebElement hardware() { return Hardware;}
	 public WebElement furniture() { return Furniture;}
	 public WebElement appliances() {return  Appliances;}
	 public WebElement books() { return Books;}
	 public WebElement toys() { return toys;}
	 
	 
}
