package basicprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("saiprasad");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("hanuman@12c");
		Thread.sleep(5000);
		WebElement loginBtn =driver.findElement(By.xpath("//input[@type='submit']"));
		flash(loginBtn,driver);
	}
		public static void flash(WebElement element, WebDriver driver)
		{
			//JavascriptExecutor js=((JavascriptExecutor) driver);
			String bgcolor=element.getCssValue("backgroudcolor");
	        for(int i=0;i<100;i++)
	        {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
		    }
		 	
		}
		public static void changeColor(String color,WebElement element,WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor) driver);
			
			js.executeScript("arguments[0].style.backgroundColor= '"+color+"'",element);
			
			try
			{
				Thread.sleep(20);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		
		
		

	

}
