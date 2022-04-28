package com.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
public static void main(String[] args) {
	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe")	;

WebDriver driver = new ChromeDriver();

driver.get("https://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();
WebElement s = driver.findElement(By.xpath("//li[@id='credit2']"));
WebElement d = driver.findElement(By.xpath("//ol[@id='bank']"));
Actions action=new Actions(driver);
action.dragAndDrop(s, d).perform();

WebElement a = driver.findElement(By.id("fourth"));

WebElement b = driver.findElement(By.id("amt7"));

Actions act=new Actions(driver);
act.dragAndDrop(a, b).perform();


WebElement c = driver.findElement(By.id("credit1"));

	WebElement e = driver.findElement(By.id("loan"));
	
	
	
	Actions atcs=new Actions(driver);
	
	
	atcs.dragAndDrop(c, e).perform();
	
	WebElement g = driver.findElement(By.id("fourth"));
	
	WebElement h = driver.findElement(By.id("amt8"));
	Actions acti=new Actions(driver);
	acti.dragAndDrop(g, h).perform();
	
	
	WebElement txtprint = driver.findElement(By.id("equal"));
	
	String text = txtprint.getText();
	
	
	System.out.println(text);
	
	
	
	
}
}
