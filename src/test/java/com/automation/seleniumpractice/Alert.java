package com.automation.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		//WebElement element = driver.findElement(By.xpath("//fieldset[@class='pull-right']/input[@id='name']"));
		//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		// set the text
		//jsExecutor.executeScript("arguments[0].value='bhargavi'", element);
		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(element).perform(); element.sendKeys("bhargavi");
		 */
		driver.findElement(By.name("enter-name")).sendKeys("Bhargavi");
		
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(10000);
		
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
