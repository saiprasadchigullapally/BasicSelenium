package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocoatersUsage {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction");
		driver.manage().window().maximize();
		Select s=new Select(driver.findElement(By.xpath("//*[@id='dcdrLocation']")));
		s.selectByVisibleText("Hyderabad");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='givenName']")).sendKeys("SaiPrasad");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='surname']")).sendKeys("Chigullapally");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("29/07/1991");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("saip14433@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='emailloginSameyes']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys("Hanuman@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='confirmPwd']")).sendKeys("Hanuman@123");
		Select ss =new Select(driver.findElement(By.xpath("//*[@id='hintQues']")));
		ss.selectByVisibleText("Birth City");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='hintAns']")).sendKeys("destination is important");
		Thread.sleep(5000);
		
		
		
		
        //driver.quit();
	}

}
