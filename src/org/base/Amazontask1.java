package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontask1 {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
	
	txtsearch.sendKeys("iphone");
	
	WebElement btnclick = driver.findElement(By.id("nav-search-submit-button"));
	
	btnclick.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
