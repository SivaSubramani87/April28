package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotelTask1 {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe" )	;



WebDriver driver = new ChromeDriver();

driver.get(" http://adactinhotelapp.com/");

WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'Adactin')]"));
	
	
	String text = txt.getText();
	
	System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
