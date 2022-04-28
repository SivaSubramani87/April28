package com.windowhandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {
public static void main(String[] args) {
	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.in/");
driver.getTitle();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.manage().window().maximize();

WebElement txtsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

txtsearch.sendKeys("iphone 13",Keys.ENTER);

WebElement btnclick = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

btnclick.click();

String parent = driver.getWindowHandle();


	System.out.println(parent);
	
	Set<String> windowHandles = driver.getWindowHandles();
	
	System.out.println(windowHandles);
	
	for (String win : windowHandles) {
		
		if(! (win.equals(parent))) {
			
			driver.switchTo().window(win);
	
		}
	}
	
	WebElement clickcart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	
	clickcart.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
