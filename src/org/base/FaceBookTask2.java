package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTask2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	
	WebElement texname = driver.findElement(By.xpath("//input[@id='email']"));
	
	texname.sendKeys("sivasubaramani");
	
	
	WebElement txtpass = driver.findElement(By.xpath("//input[@id='pass']"));
	
	txtpass.sendKeys("anbarasan87");
	
	WebElement cmdlog = driver.findElement(By.xpath("//button[@name='login']"));
	
	
	cmdlog.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
