package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingTask3 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		 WebElement txtname = driver.findElement(By.xpath("//input[contains(@class,'form-control')][1]"));
		
		 txtname.sendKeys("siva");
		 
		 WebElement txtlast = driver.findElement(By.xpath("//input[contains(@class,'ng-pristine')][1]"));

		 txtlast.sendKeys("subramani");
		 
		 WebElement txtadd = driver.findElement(By.xpath("//textarea[contains(@class,'form-control ng-pristine ng-valid ng-touched')]"));
		 
		 txtadd.sendKeys("chennai");
		 
		 driver.quit();
		 
		
		 
		 
		 
		 
		 
		 
	}
}
