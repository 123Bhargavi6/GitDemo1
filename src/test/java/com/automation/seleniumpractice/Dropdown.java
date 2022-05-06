package com.automation.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");  
		
		// Instantiate a ChromeDriver class. 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement element=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown1 = new Select(element);
		dropdown1.selectByIndex(1);
		Thread.sleep(5000);
		System.out.println(element.getText());
		driver.close();
		

	}

}
