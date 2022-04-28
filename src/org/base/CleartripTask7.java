package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleartripTask7 {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.cleartrip.com/trains");
	
	WebElement txtfrom = driver.findElement(By.id("from_station"));
	
	
	txtfrom.sendKeys("chennai");
	
	WebElement txtto = driver.findElement(By.id("to_station"));
	
	txtto.sendKeys("Nagpur(NGP)");
	
	WebElement txtfo = driver.findElement(By.id("trainFormButton"));
	txtfo.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
