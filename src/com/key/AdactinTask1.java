package com.key;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinTask1 {
public static void main(String[] args) throws AWTException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" http://adactinhotelapp.com/");
	
	
	
	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	
	robot.keyPress(KeyEvent.VK_SHIFT);
	
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_S);
	
	robot.keyRelease(KeyEvent.VK_SHIFT);
	
	robot.keyPress(KeyEvent.VK_I);
	
	robot.keyRelease(KeyEvent.VK_I);
	
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	
	robot.keyPress(KeyEvent.VK_TAB);
	
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	
	robot.keyPress(KeyEvent.VK_B);
	robot.keyRelease(KeyEvent.VK_B);
	
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_C);
	
	robot.keyPress(KeyEvent.VK_D);
	
	robot.keyRelease(KeyEvent.VK_D);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
