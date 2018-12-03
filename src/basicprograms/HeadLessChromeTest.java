package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.freecrm.com/index.html");
		System.out.println("Title before login page:-"+driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("saiprasad");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("hanuman@12c");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Title after login page:-"+driver.getTitle());
	}

}
