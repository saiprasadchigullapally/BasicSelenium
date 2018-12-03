package basicprograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUps {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("http://www.popuptest.com/goodpopups.html");
        driver.findElement(By.xpath("//*[text()='Good PopUp #3']")).click();
        Set<String>handler=driver.getWindowHandles();
        Iterator<String>it=handler.iterator();
        String parentwindowid=it.next();
        System.out.println("Parent window id is:"+parentwindowid);
        String childrenwindowid=it.next();
        System.out.println("Child window id is:"+childrenwindowid);
        driver.switchTo().window(childrenwindowid);
       System.out.println( driver.getTitle());
       driver.close();
       driver.switchTo().window(parentwindowid);
       System.out.println( driver.getTitle());
        
	   driver.quit();
	}

}
