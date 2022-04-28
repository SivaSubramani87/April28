package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartTask9 {
public static void main(String[] args) throws AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
WebElement textname = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
	
textname.sendKeys("sivadarwin1996@gmail.com");

WebElement texpass = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _3mctLh VJZDxU')]"));

texpass.sendKeys("jeevagan87");

Robot robot = new Robot();

WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));

robot.keyPress(KeyEvent.VK_ENTER);

robot.keyRelease(KeyEvent.VK_ENTER);






}
}
