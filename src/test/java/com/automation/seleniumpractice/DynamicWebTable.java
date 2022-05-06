package com.automation.seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//table[@id='simpletable']/thead/tr/th[contains(text(),'Last
		// name')]/following::tbody/tr/td[2][contains(text(),'Raj')]/following::td[2]/input")).click();

		WebElement table = driver.findElement(By.xpath("//table[@id='simpletable']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", table);
		List<WebElement> headers = table.findElements(By.tagName("td"));

		List<WebElement> allrows = table.findElements(By.xpath("//table[@id='simpletable']//tbody//tr"));
		int size = allrows.size();

		for (int i = 1; i <= size; i++) {
			List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));

			WebElement name = rows.get(1);
			String text = name.getText();
			if (text.equals("Raj")) {
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				input.click();
				break;
			}

		}
		Thread.sleep(5000);
		driver.close();
	}
}
