package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask2 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe")	;
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.amazon.in/");
	
	WebElement textcon = driver.findElement(By.xpath("//a[contains(text(),'Conditions')]"));
		
		
	String text = textcon.getText();
	
	System.out.println(text);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
