package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(("(//*[@id='highlight-addons'])[2]")))).build().perform();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//*[@id='menu-list-login']/ preceding ::*[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Carriage of Live Animals")).click();
        Thread.sleep(3000);
	
	}	
		
				
}
