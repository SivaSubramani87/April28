package com.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.manage().window().maximize();
	
	WebElement btnclick = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	
	
	btnclick.click();
	
	WebElement dropday = driver.findElement(By.id("day"));
	
	Select select = new Select(dropday); 
	
	//select.selectByValue("10");
	
	//select.selectByVisibleText("11");
	
	select.selectByIndex(10);
	
	
	
	
	WebElement dropmonth = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s = new Select(dropmonth); 
	//s.selectByValue("10");
	//s.selectByVisibleText("Jan");
	
	boolean multiple = s.isMultiple();
	
	System.out.println(multiple);
	
	
	s.selectByIndex(9);
	
	
	WebElement dropyear = driver.findElement(By.id("year"));
	
	
	Select k = new Select(dropyear);
	
	//k.selectByValue("1996");
	
	//k.selectByVisibleText("1996");
	
	k.selectByIndex(10);
	
	
	WebElement dropMonth = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select g = new Select(dropMonth);
	
	List<WebElement> options = g.getOptions();
	
	for (int i = 0; i < options.size(); i++) {
		
		
		WebElement element = options.get(i);
		
		
		String text = element.getText();
		
		
		System.out.println(text);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
