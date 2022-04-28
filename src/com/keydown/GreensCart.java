package com.keydown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensCart {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenscart.in/");

		Thread.sleep(3000);

		WebElement element = driver.findElement(By.id("loginEmailId"));

		element.sendKeys("sivadarwin1996@gmail.com");
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.id("loginPassword"));

		findElement.sendKeys("Anbarasan@87");

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement findElement2 = driver.findElement(By.id("typeahead-basic"));
		
		findElement2.sendKeys("Apple iPhone 12 Pro Max");
		
		WebElement findElement3 = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']"));
		Thread.sleep(1000);
		
		findElement3.click();
		
		WebElement findElement4 = driver.findElement(By.className("card"));
		
		
		findElement4.click();
		
		WebElement findElement5 = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		
		findElement5.click();
		
		WebElement findElement6 = driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
		findElement6.click();
		
		
		WebElement findElement7 = driver.findElement(By.xpath("//span[text()='GRN10']"));
		
		
		
		Actions actions = new Actions(driver);
		
	Thread.sleep(7000);	
		actions.doubleClick(findElement7).perform();
		
		
		WebElement findElement8 = driver.findElement(By.xpath("//span[@class='px-1 close']"));
		
		actions.contextClick(findElement8).perform();
		
		WebElement findElement9 = driver.findElement(By.xpath("//section[@class='user-menu ng-star-inserted']"));
		Thread.sleep(2000);
		findElement9.click();
		
	}
}
