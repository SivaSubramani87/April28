package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask10 {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	WebElement image = driver.findElement(By.xpath("//img[@class='product-image _deals-shoveler-v2_style_dealImage__3nlqg']"));
	
	
	image.click();
	
	
	
	
	
	
	
	
	
	
	
}
}
