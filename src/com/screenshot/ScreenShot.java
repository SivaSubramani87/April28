package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		
		System.out.println(screenshotAs);
		
		
		FileUtils.copyFile(screenshotAs,new File("C:\\jeeva\\raj.png"));
		
		//FileHandler.copy(screenshotAs, new File("C:\\jeeva\\facebook.png"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
