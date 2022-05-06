package com.automation.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IconTriggerDatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\I4942\\eclipse-workspace\\seleniumpractic e\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Icon%20Trigger");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Icon Trigger']")).click();
	}

}
