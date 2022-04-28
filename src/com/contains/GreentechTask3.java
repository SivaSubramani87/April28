package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreentechTask3 {
public static void main(String[] args) {

	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("http://greenstech.in/selenium-course-content.html");

WebElement textcon = driver.findElement(By.id("overview-tab"));
	
textcon.click();

WebElement gettxt = driver.findElement(By.xpath("//div[@class='card-body']"));

String text = gettxt.getText();


System.out.println(text);
}
}
