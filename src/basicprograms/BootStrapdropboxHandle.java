package basicprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapdropboxHandle {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		driver.findElement(By.xpath("//*[@id='dropdownMenuButton']")).click();
		Thread.sleep(5000);
	List<WebElement>list=	driver.findElements(By.xpath("//*[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
    System.out.println(list.size());
    for (int i = 0; i < list.size(); i++) 
    {
		System.out.println(list.get(i).getText());
		if(list.get(i).equals("Action"))
		{
			list.get(i).click();
			break;
		}
	}
	

	}

}
