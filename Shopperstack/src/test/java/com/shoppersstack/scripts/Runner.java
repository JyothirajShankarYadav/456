package com.shoppersstack.scripts;

import org.junit.runner.Description;
import com.shopperstack.pom.Login;
import com.shopperstack.generic.Generics;
import com.shopperstack.pom.AdminRegister;
import org.testng.annotations.Test;
import com.shopperstack.pom.merchantSignup;

public class Runner extends baseClass
{
 @Test(description = "Admin Registration")
 public void AdminRegister() throws Exception
 {
	  Login lp = new Login(driver);
	  lp.adminButton();
	  lp.createAccountbtn();
	  Thread.sleep(2000);
	  AdminRegister ar=new AdminRegister(driver);
	  ar.firstname().sendKeys("Adminnno");
	  ar.lastname().sendKeys("adminnno");
	  ar.maleRadio();
	  Thread.sleep(1000);
	  ar.phone().sendKeys("9890980654");
	  ar.email().sendKeys("adminnn0@gmail.com");
	  ar.password().sendKeys("Password@0077"); ar.confirmPassword().sendKeys("Password@0077");
	  Thread.sleep(1000);
	  ar.PassEye(); ar.confirmEyeIcon();Thread.sleep(1000);
	  Generics.select(ar.country(), "India");
	  Thread.sleep(1000);
	  Generics.select(ar.state(), "Karnataka");
	  Generics.select(ar.city(), "Bengaluru");
	  Thread.sleep(1000);
	  ar.register();	  
 }
 @Test(description = "Merchant Sign-up")
 public void merchantSignup() throws Exception
 {
	 AdminRegister ar=new AdminRegister(driver);
	 Login lp = new Login(driver);
	 lp.merchantButton();
	 lp.createAccountbtn();
	 ar.AdminaccountLink().sendKeys("adminn0@gmail.com");
	 ar.link();
	 ar.merchantButton();
	 Thread.sleep(2000);
	 merchantSignup mp=new merchantSignup(driver);
	 Thread.sleep(2000); 
	 Generics.scrollByPixel(driver);
	 mp.firstname().sendKeys("landoo"); 
	 mp.lastname().sendKeys("norriss");
	// mp.email().sendKeys("lol@gmail.com");
	 Generics.scrollByPixel(driver);
	 mp.phone().sendKeys("9090876543");
	 Generics.scrollByPixel(driver);
	 mp.password().sendKeys("Lando@1234");
	 mp.maleRadio();
	 Generics.scrollByPixel(driver);
	 Thread.sleep(1000);mp.nextButton();
	 Thread.sleep(2000);
	/* mp.companyName().sendKeys("Company");
	 mp.companyEmail().sendKeys("company@gmail.com");
	 Generics.scrollByPixel(driver);
	 mp.companyPhone().sendKeys("9876543210");
	 Generics.scrollByPixel(driver);
	 Thread.sleep(1000);
	 mp.gst().sendKeys("AsdTy56");
	 mp.companyRegistration().sendKeys("Jkio98");
	 Generics.scrollByPixel(driver);
	 mp.website().sendKeys("www.company.com");
	 Generics.scrollByPixel(driver);
	 Thread.sleep(1000);
	 mp.companyTypeDD().click();
	 Generics.movetoElement(mp.Beauty(), driver);
	 mp.nextButton();
	 Thread.sleep(2000);*/
	 
	 
	 
	 
 }
}
