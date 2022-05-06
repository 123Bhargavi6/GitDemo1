package com.automation.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		// System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");  
		
		// Instantiate a ChromeDriver class. 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " +currentUrl);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		int titleLength=driver.getTitle().length();
		System.out.println(titleLength);
		
		if (currentUrl.equals("https://www.google.co.in/")){  
			System.out.println("Verification Successful - The correct Url is opened.");  
			}  
			else{  
			  
			System.out.println("Verification Failed - An incorrect Url is opened.");  
			         }  
		
		
		
		
		
		driver.close();
		
		

	}

}
