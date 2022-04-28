package com.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultibleSelect {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.get("http://output.jsbin.com/osebed/2");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.manage().window().maximize();
	
	WebElement dropfruits = driver.findElement(By.id("fruits"));
	
	Select sl = new Select(dropfruits);
	
	boolean multiple = sl.isMultiple();
	
	System.out.println(multiple);
	
	List<WebElement> options = sl.getOptions();
	
	for (int i = 0; i < options.size(); i++) {
		
		WebElement webElement = options.get(i);
		
		String text = webElement.getText();
		
		//System.out.println(text);
		
		
		sl.selectByVisibleText(text);
		
		
		System.out.println("");
		
	}
	
	
	WebElement firstSelectedOption = sl.getFirstSelectedOption();
	
	String text2 = firstSelectedOption.getText();
	
	
	System.out.println(text2);
	
	
	//List<WebElement> allSelectedOptions = sl.getAllSelectedOptions();
	
	
	
	
	
	/*System.out.println("*********************************************************************************");
	
	Thread.sleep(1000);;
	List<WebElement> ops = sl.getAllSelectedOptions();
	
	for (int i = 0; i <ops.size() ; i++) {
		
		
		WebElement element = ops.get(i);
		
		String text = element.getText();
		
		System.out.println(text);
		
		
		
		
	}
	
	//desselect function
	sl.deselectByIndex(0);
	
	sl.deselectByValue("orange");
	
	sl.deselectByVisibleText("Apple");
	
	
	sl.deselectAll();
	
	
	List<WebElement> gh = sl.getAllSelectedOptions();
	
	for (int i = 0; i < gh.size(); i++) {
		
		WebElement webElement = gh.get(i);
		String attribute = webElement.getAttribute("value");
		
		
		sl.selectByVisibleText(attribute);
		
		System.out.println(attribute);
		
	}
	
	*/
}
}
