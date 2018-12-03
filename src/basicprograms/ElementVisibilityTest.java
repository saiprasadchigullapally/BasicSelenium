package basicprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/register/");
		boolean b1=driver.findElement(By.xpath("//*[@id='submitButton']")).isDisplayed();
		System.out.println(b1);
		boolean b2=driver.findElement(By.xpath("//*[@id='submitButton']")).isEnabled();
		System.out.println(b2);
		driver.findElement(By.xpath("//*[@name='agreeTerms']")).click();
		boolean b3=driver.findElement(By.xpath("//*[@id='submitButton']")).isEnabled();
		System.out.println(b3);
		boolean b4=driver.findElement(By.xpath("//*[@name='agreeTerms']")).isSelected();
		System.out.println(b4);
		driver.findElement(By.xpath("//*[@name='agreeTerms']")).click();
		boolean b5=driver.findElement(By.xpath("//*[@name='agreeTerms']")).isSelected();
		System.out.println(b5);
	
	}

}
