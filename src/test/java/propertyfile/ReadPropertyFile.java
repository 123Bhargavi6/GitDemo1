package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile {

	public static void main(String[] args) throws InterruptedException {
		File file = new File("C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\application.properties");
		  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		Thread.sleep(2000);
		WebElement ddDatePicker = driver.findElement(By.xpath("//div[@class='newtabs horizontal']/ul/li[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ddDatePicker);
		ddDatePicker.click();
		driver.close();
	}

}
