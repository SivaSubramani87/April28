package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTask11 {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	WebElement txtname = driver.findElement(By.id("firstName"));
	
	
	txtname.sendKeys("siva");
	
	WebElement txtlast = driver.findElement(By.id("lastName"));
	txtlast.sendKeys("subramani");
	
	WebElement txtuse = driver.findElement(By.id("username"));
	
	
	txtuse.sendKeys("sivasubramani087");
	
	WebElement findElement = driver.findElement(By.name("Passwd"));
	findElement.sendKeys("anbarasan98");
	
	
	
	WebElement findElement2 = driver.findElement(By.name("ConfirmPasswd"));
	findElement2.sendKeys("anbarasan98");
	
	
	
	WebElement findElement3 = driver.findElement(By.className("VfPpkd-vQzf8d"));
	findElement3.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
