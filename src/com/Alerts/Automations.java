package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automations {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		Thread.sleep(7000);
		WebElement btbclick = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));

		btbclick.click();

		WebElement btnclick = driver
				.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));

		btnclick.click();

		Alert al = driver.switchTo().alert();

		al.sendKeys("jeevagan");

		al.accept();
		Thread.sleep(7000);

		WebElement gettxt = driver.findElement(By.xpath("//p[text()='Hello jeevagan How are you today']"));

		String text = gettxt.getText();

		System.out.println(text);

	}
}
