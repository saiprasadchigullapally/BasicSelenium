package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("saip14433",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("1hanuman",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=':q3']")).sendKeys("saiprasadchigullapaly23@gmail.com");
		Thread.sleep(3000);
		
		
		
		
	}

}
