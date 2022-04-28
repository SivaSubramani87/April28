package com.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://sprint.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement clickbtn = driver.findElement(By.xpath("//button[@class='tntOverlayCloseBtn']"));
	
	clickbtn.click();
	
	WebElement click1 = driver.findElement(By.xpath("//button[@class='phx-modal__close']"));
	click1.click();
	
	WebElement clickmo = driver.findElement(By.xpath("//a[contains(text(),'Phones & devices')]"));
		
	Actions actions = new Actions(driver);
	
	actions.moveToElement(clickmo).perform();
	
	WebElement btnclick = driver.findElement(By.xpath("//a[text()='5G phones']"));
		
	btnclick.click();
	
	WebElement txtprint = driver.findElement(By.xpath("//a[contains(@id,'digital-footer-bottom-link-bottom-9')]"));
		
	String text = txtprint.getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
