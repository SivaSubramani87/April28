package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	driver.manage().window().maximize();
	
	
	WebElement tabledata = driver.findElement(By.xpath("//table[@id='customers']"));
	
	
	List<WebElement> allrow = tabledata.findElements(By.tagName("tr"));
	
	for (int i = 3; i==3; i++) {
		
		WebElement row = allrow.get(i);
		
		String text = row.getText();
		
		System.out.println(text);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
