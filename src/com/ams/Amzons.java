package com.ams;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzons {
public static void main(String[] args) throws AWTException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.get("https://www.amazon.in/");
	
	Robot robot = new Robot();
	
	for (int i = 0; i <5; i++) {
		
	robot.keyPress(KeyEvent.VK_TAB);
	
	
	robot.keyRelease(KeyEvent.VK_TAB);
	
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
