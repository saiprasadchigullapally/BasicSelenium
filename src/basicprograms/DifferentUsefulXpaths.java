package basicprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DifferentUsefulXpaths {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://www.half.ebay.com");
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("java");
		Thread.sleep(5000);
		Select s=new Select(driver.findElement(By.xpath("//*[@id='gh-cat']")));
		s.selectByVisibleText("Books");
		//driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//*[contains(text(),'Deals')])[5]")).click();
		//Thread.sleep(5000);
		List<WebElement>tagnames=driver.findElements(By.tagName("a"));
		System.out.println(tagnames.size());
		for(int i=0;i<tagnames.size();i++)
		{
			
		String g=tagnames.get(i).getText();
		System.out.println(g);
		

		}
		driver.quit();
	}

}
