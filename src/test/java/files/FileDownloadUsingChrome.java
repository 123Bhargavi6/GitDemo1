package files;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileDownloadUsingChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\I4942\\eclipse-workspace\\seleniumpractice\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		//Download text file
		driver.findElement(By.id("textbox")).sendKeys("File downloading");
		driver.findElement(By.id("createTxt")).click();  //Generate button
		driver.findElement(By.id("link-to-download")).click();
		Thread.sleep(5000);
		boolean state = isFileDownloaded("C:\\Users\\I4942\\Downloads","info.txt");
		System.out.println(state);
		driver.close();	  
	}
	
	public static boolean isFileDownloaded(String downloadPath, String fileName) throws InterruptedException {
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().contains(fileName)) {
		    	  System.out.println("File is present in Downloads");
		    	  Thread.sleep(5000);
		          dirContents[i].delete();
		          Thread.sleep(5000);
		          System.out.println("File is Deleted from Downloads");
		          return true;
		      }
		          }
		      return false;
		  }
}
