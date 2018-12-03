package basicprograms;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawBoarder 
{

	
	public static void main(String[] args) throws InterruptedException, IOException
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
		drawBorder(loginBtn,driver);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("E://frameworks//basicselenium//border.jpg"));
		//generateAlert(driver,"There is and issue with login button on login page");
		//clickElementByJS(loginBtn,driver);
		refreshBrowserByJS(driver);
		//System.out.println(getTitleByJS(driver));
		System.out.println(getPageInnerText(driver));
		
		//scrollPageDown(driver);
		
		WebElement forgotpwdlink=driver.findElement(By.xpath("//*[contains(text(),'Forgot Password?')]"));
		
		scrollIntoView(forgotpwdlink,driver);
		
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
		
		public static void drawBorder(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.border='3px solid red '", element);
			
			
		}
		
		public static void generateAlert(WebDriver driver,String message)
		{
			JavascriptExecutor js=(( JavascriptExecutor)driver);
            js.executeScript("alert('"+message+"')");
		}
		
		public static void clickElementByJS(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", element);
			
		}
		
		public static void refreshBrowserByJS(WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor)driver);   
			js.executeScript("history.go(0)");
		}
		
		public static String getTitleByJS(WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor)driver);
			String title=js.executeScript("return document.title;").toString();
			return title;
		}
		
		public static String getPageInnerText(WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor)driver);
			String pageText =js.executeScript("return document.documentElement.innerText;").toString();
			return pageText;
		}
		
		public static void scrollPageDown(WebDriver driver)
		{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		
		public static void scrollIntoView(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		
}		
			