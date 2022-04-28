package com.rightclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleTrial {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.google.com/");
		
		
		WebElement lnkgamil = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(lnkgamil).perform();
		
		
		
		
	}
}
