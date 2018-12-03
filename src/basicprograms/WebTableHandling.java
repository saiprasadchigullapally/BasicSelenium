package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("saiprasad");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("hanuman@12c");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Thread.sleep(6000);
		driver.findElement(By.name("contact_id")).click();
		Thread.sleep(5000);
		
		
	
		
		driver.quit();
		
		

	}

}
