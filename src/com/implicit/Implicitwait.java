package com.implicit;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Implicitwait {
private Object expectedcontion;

public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");	
	
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.get("https://www.facebook.com/");
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	
	
	
	
	
	
	
	WebElement btnclick = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	
	btnclick.click();
	
	//implicit wait
	
	//WebElement txtfirst = driver.findElement(By.xpath("//input[@name='firstname']"));
	
	//txtfirst.sendKeys("jeevagan");
	
	
	//explicitwait - WebDriverWait
	
	//WebDriverWait driverwait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	//WebElement until = driverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
	
	
	//until.sendKeys("jeevagan");
	
	
	
	//WebDriverWait - fluentwait
	
	
	Wait<WebDriver>Wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	
	WebElement until = Wait.until(new Function<WebDriver,WebElement>(){

		@Override
		public WebElement apply(WebDriver arg0) {
			// TODO Auto-generated method stub
			return driver.findElement(By.xpath("//input[@name='firstname']"));
			 
		}});
	
	until.sendKeys("jeevagan");
	
	
	
	
	
	
	
}
}
