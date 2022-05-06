package com.automation.seleniumpractice;

import java.util.Iterator;
import java.util.List;

import javax.security.auth.login.Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Icon%20Trigger");
		Thread.sleep(2000);
		WebElement ddDatePicker = driver.findElement(By.xpath("//div[@class='newtabs horizontal']/ul/li[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ddDatePicker);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ddDatePicker);
		ddDatePicker.click();
		WebElement simpleDatePickerFrame =driver.findElement(By.xpath("//iframe[contains(@data-src,'datepicker/dropdown-month-year.html')]"));
		driver.switchTo().frame(simpleDatePickerFrame);
		List<WebElement> datePicker = driver.findElements(By.className("hasDatepicker"));
		datePicker.get(1).click();
		//Month Dropdown
		List<WebElement> monthDD = driver.findElements(By.className("ui-datepicker-month"));
		List<WebElement> yearDD = driver.findElements(By.className("ui-datepicker-year"));
		
		for (int i = 0; i < monthDD.size(); i++) {
			
			String month = monthDD.get(i).getText();
			if (month.equals("May")) {
				monthDD.get(i).click();
				break;
			}
			else
			{
				continue;
			}	
		}
		
		for (int i = 0; i < yearDD.size(); i++) {
			
			String year = yearDD.get(i).getText();
			if (year.equals("2023")) {
				yearDD.get(i).click();
				break;
			}
			else
			{
				continue;
			}
		}
		
		driver.findElement(By.xpath("//a[.='20']")).click();
		driver.close();
	}
}
