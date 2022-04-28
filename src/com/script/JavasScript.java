package com.script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavasScript {
public static void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.facebook.com/login/");
	
	JavascriptExecutor executor =(JavascriptExecutor) driver;
	
	WebElement txtemail = driver.findElement(By.id("email"));
	
	
	
	
	executor.executeScript("arguments[0].setAttribute('value','siva')",txtemail);
	
	
	Object executeScript = executor.executeScript("return arguments[0].getAttribute('value')", txtemail);
	
	System.out.println(executeScript);
	
	
	WebElement txtpass = driver.findElement(By.xpath("//input[@id='pass']"));
	
	executor.executeScript("arguments[0].setAttribute('value','anbarasan')", txtpass);
	
	Object executeScript2 = executor.executeScript("return arguments[0].getAttribute('value')", txtpass);
	
	System.out.println(executeScript2);
	
	
	
	
	
	
}
}
