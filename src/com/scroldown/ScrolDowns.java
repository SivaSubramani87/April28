package com.scroldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolDowns {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe" )	;


WebDriver  driver = new ChromeDriver();

driver.get("https://www.amazon.in/");

JavascriptExecutor executor = (JavascriptExecutor) driver;

WebElement down = driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLogoLine']"));
	
	
executor.executeScript("arguments[0].scrollIntoView(true)", down);

WebElement up = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none fluid-image-container']"));
	
executor.executeScript("arguments[0].scrollIntoView(false)", up);
	
	
	
	
	
	
	
	
	
	
	
}
}
