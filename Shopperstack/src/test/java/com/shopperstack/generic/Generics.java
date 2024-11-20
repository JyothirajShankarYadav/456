package com.shopperstack.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.io.FileHandler;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Generics 
{
	public static void scrollByPixel(WebDriver driver)
	{
		JavascriptExecutor jss=(JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,100)");
	}
	 public static void select(WebElement ele,String value)
	 {
		 new Select(ele).selectByVisibleText(value);
	 }
	 public static String getPhoto(WebDriver driver) throws Exception
	 {
		 String path="./defects/Defect.jpg";
		 TakesScreenshot tss=(TakesScreenshot)driver;
		 File temp = tss.getScreenshotAs(OutputType.FILE);
		 File destination=new File(path);
		 Thread.sleep(2000);
		 FileHandler.copy(temp, destination);
		 return path;
	 }
	 public static void movetoElement(WebElement ele,WebDriver driver)
	 {
		 new Actions(driver).moveToElement(ele).click().perform();
	 }
	 public static void rightclick(WebElement ele,WebDriver driver)
	 {
		 new Actions(driver).contextClick(ele).perform();
	 }
	 public static void doubleClick(WebElement ele,WebDriver driver)
	 {
		 new Actions(driver).doubleClick(ele).perform();
	 }
	 public static String excel(String path, String sheet,int row,int cell) throws Exception
	 {
		 FileInputStream fis;
		 Workbook book=null;
		 try
		 {
			 fis=new FileInputStream(path);
			 book=WorkbookFactory.create(fis);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 org.apache.poi.ss.usermodel.Sheet sh = book.getSheet(sheet);
		 Row ro = sh.getRow(row);
		 Cell cel = ro.getCell(cell);
		 return cel.toString();
	 }
}
