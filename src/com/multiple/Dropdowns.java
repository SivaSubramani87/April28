package com.multiple;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" http://output.jsbin.com/osebed/2");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement element = driver.findElement(By.id("fruits"));

		Select sl = new Select(element);

		boolean multiple = sl.isMultiple();

		System.out.println(multiple);

		List<WebElement> options = sl.getOptions();

		for (int i = 0; i <options.size() ; i++) {

			WebElement element2 = options.get(i);

			String text = element2.getText();

			sl.selectByVisibleText(text);

			
			
		}

		WebElement firstSelectedOption = sl.getFirstSelectedOption();

		String text2 = firstSelectedOption.getText();
		
		System.out.println(text2);
		
		
		Thread.sleep(10000);
		
		List<WebElement> allops = sl.getAllSelectedOptions();
		
		for (int i = 0; i < allops.size(); i++) {
			
			WebElement webElement = allops.get(i);
			
			String text = webElement.getText();
			
			System.out.println(text);
			
			
			
		}
		
		
		sl.deselectByIndex(0);
		Thread.sleep(2000);
		
		sl.selectByValue("banana");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		System.out.println(screenshotAs);
		
		FileUtils.copyFile(screenshotAs,new File ("C:\\Users\\ELCOT\\Pictures\\Samples\\April28\\New folder\\sample.png"));
		
		
		
		
	}
}
