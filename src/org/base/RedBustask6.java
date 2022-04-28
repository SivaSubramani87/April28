package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBustask6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	
	driver.manage().window().maximize();
	
	WebElement txtsig = driver.findElement(By.id("signin-block"));
	
	txtsig.click();
	
	WebElement txtsigi= driver.findElement(By.id("signInLink"));
	
	txtsigi.click();
Thread.sleep(300);
	WebElement txtmo = driver.findElement(By.id("mobileNoInp"));
	
	txtmo.sendKeys("8870292823");
	
	
	
	
}
}
