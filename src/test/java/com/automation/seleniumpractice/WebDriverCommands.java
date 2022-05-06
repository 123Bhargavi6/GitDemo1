package com.automation.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class WebDriverCommands {

	public static void main(String[] args) {
	
		// System Property for Chrome Driver   
				System.setProperty("webdriver.chrome.driver","C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");  
				
				// Instantiate a ChromeDriver class. 
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.co.in/");
				driver.navigate().to("https://javatpoint.com/selenium-tutorial");  
				WebElement element =driver.findElement(By.id("gsc-i-id1"));
				element.sendKeys("WebDriver Commands",Keys.ENTER);
	}

}
