package com.navigate;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class KeyDownandUp {
public static void main(String[] args) throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();


driver.get("https://www.facebook.com/");

WebElement findElement = driver.findElement(By.id("email"));

Actions actions = new Actions(driver); 

actions.keyDown(Keys.SHIFT).sendKeys(findElement,"jeevagan").keyUp(Keys.SHIFT).perform();


//WebElement element = driver.findElement(By.id("pass"));

//actions.keyDown(Keys.SHIFT).sendKeys(element,"anbarasan").keyUp(Keys.SHIFT).perform();


	WebElement findElement3 = driver.findElement(By.id("pass"));
	
	findElement3.sendKeys("anbuArasan");
	
	TakesScreenshot ts =  (TakesScreenshot) driver;
	
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	
	System.out.println(screenshotAs);
	
	FileUtils.copyFile(screenshotAs,new File("C:\\jeeva\\fb.png"));
	
	FileHandler.copy(screenshotAs, new File("C:\\\\jeeva\\\\faces.png"));
	
	
	
}
}
