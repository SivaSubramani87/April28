package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask14 {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" https://www.swiggy.com/");
	
	WebElement cmdlogin = driver.findElement(By.className("r2iyh"));
	
	
	cmdlogin.click();
	
	WebElement entmobile = driver.findElement(By.id("mobile"));
	
	entmobile.sendKeys("8870292823");
	
	
	
	WebElement txtname = driver.findElement(By.id("name"));
	txtname.sendKeys("jeevagan");
	
	WebElement txtemail = driver.findElement(By.id("email"));
	
	
	txtemail.sendKeys("sivadarwin1996@gmai.com");
	
	WebElement txtpass = driver.findElement(By.id("password"));
	
	txtpass.sendKeys("anbarasan@87");
	
	WebElement txtcon = driver.findElement(By.className("a-ayg"));
	
	txtcon.click();
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
}
