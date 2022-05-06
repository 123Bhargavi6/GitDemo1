package com.automation.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");  
		
		// Instantiate a ChromeDriver class. 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement radio1=driver.findElement(By.xpath("//input[@value='radio1']"));
		radio1.click();
		System.out.println(radio1.isSelected());
		
		WebElement radio2=driver.findElement(By.xpath("//input[@value='radio2']"));
		radio2.click();
		System.out.println(radio2.isSelected());
		
		WebElement radio3=driver.findElement(By.xpath("//input[@value='radio3']"));
		radio3.click();
		System.out.println(radio3.isSelected());
		
		driver.close();
		

	}

}
