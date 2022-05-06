package com.automation.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// System Property for Chrome Driver   
				System.setProperty("webdriver.chrome.driver","C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");  
				
				// Instantiate a ChromeDriver class. 
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				WebElement option1=driver.findElement(By.id("checkBoxOption1"));
				option1.click();
				System.out.println(option1.isSelected());
				
				WebElement option2=driver.findElement(By.id("checkBoxOption2"));
				option2.click();
				System.out.println(option2.isSelected());
				
				WebElement option3=driver.findElement(By.id("checkBoxOption3"));
				option3.click();
				System.out.println(option3.isSelected());
				
				
				
				
				
				
				driver.close();

	}

}

