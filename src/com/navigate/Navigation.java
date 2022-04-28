package com.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe" );

WebDriver driver = new ChromeDriver();


driver.navigate().to("https://www.facebook.com/");

WebElement txtEmail = driver.findElement(By.id("email"));

txtEmail.sendKeys("jeevagan");

WebElement txtpass = driver.findElement(By.id("pass"));
	
txtpass.sendKeys("shikharsiva@87");

WebElement btnclick = driver.findElement(By.name("login"));
	
btnclick.click();

Thread.sleep(5000);

driver.navigate().back();

driver.navigate().forward();

driver.navigate().refresh();
	
	
	
	
	
	
	
	
	
	
	
}
}
