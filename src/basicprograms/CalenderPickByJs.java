package basicprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class CalenderPickByJs {

	
	public static void main(String[] args) 
	  {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com");
		
      String dateval="14/09/";
      WebElement date= driver.findElement(By.xpath("//*[@name='ctl00$mainContent$view_date1']"));
	  selectDatebyJs(driver,date,dateval);
	  }
	
	public static void selectDatebyJs(WebDriver driver,WebElement element,String dateval)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
		
	}

}
