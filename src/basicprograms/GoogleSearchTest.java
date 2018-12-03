package basicprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
		List<WebElement>list=driver.findElements(By.xpath("//*[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println("Total number of suggestions is search box is:=="+list.size());		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing tools"))
			{
				list.get(i).click();
				break;
			}
		}
		
		
		
		
	
	}

}
