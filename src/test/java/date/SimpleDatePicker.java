package date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		String yyyy = "2022";
		String mon = "May";
		int yr= Integer.parseInt(yyyy);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Icon%20Trigger");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement simpleDatePickerFrame =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(simpleDatePickerFrame);
		//driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		driver.findElement(By.className("hasDatepicker")).click();
		String moy = driver.findElement(By.className("ui-datepicker-title")).getText();

		String[] splitDate = moy.split(" ");
		String month = splitDate[0].trim();
		String year = splitDate[1].trim();
		int y1= Integer.parseInt(year);
		System.out.println("Month:-"+month);

		//if year is less than input
		if(y1<yr)
		{
			while (!(month.equals(mon) && year.equals(yyyy))) {
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
				moy  = driver.findElement(By.className("ui-datepicker-title")).getText();
				 month = moy.split(" ")[0].trim();
				 year = moy.split(" ")[1].trim();
				System.out.println(month);
			}
			driver.findElement(By.xpath("//a[.='19']")).click();
		}
		
		if(y1>yr)
		{
			while (!(month.equals(mon) && year.equals(yyyy))) {
				driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
				moy  = driver.findElement(By.className("ui-datepicker-title")).getText();
				 month = moy.split(" ")[0].trim();
				 year = moy.split(" ")[1].trim();
				System.out.println(month);
			}
			driver.findElement(By.xpath("//a[.='19']")).click();
		}
		
		else {
			driver.findElement(By.xpath("//a[.='19']")).click();
		}
		
	}
}
