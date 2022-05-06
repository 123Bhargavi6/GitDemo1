package files;





import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		 
		Actions act = new Actions(driver);
		WebElement uploadButton = driver.findElement(By.xpath(".//*[@id='imagesrc']"));
		act.moveToElement(uploadButton).click().perform();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\I4942\\Desktop\\AutoIT\\Fileupload.exe");
		System.out.println(uploadButton.getText());
		
	}
	
}
