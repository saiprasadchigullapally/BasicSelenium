package basicprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://threejs.org/");
//		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("saiprasad");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("hanuman@12c");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@value='Login']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().frame("mainpanel");

	//links--/a Tag //href property<https://www.google.com>
	//images--/img Tag	//href property<https://www.gmail.com>
		
		//1.Get the list of all links and images into one
		
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));  // It contains all links of href and other links as well
		
	// To get the size of full links and images
		
		System.out.println("Size of the full links and images"+linklist.size());
	
		// To considered only href links we use one more link list
		
		List<WebElement> activelinks=new ArrayList<WebElement>();
		
		
		//2 itterate linklist:Exclude all the links/Images- doesn't have any href attribute
		
		for(int i=0;i<linklist.size();i++)
		{
			// To display total links and images path of all .
			System.out.println("Total links list is:"+linklist.get(i).getAttribute("href"));
			
			if(linklist.get(i).getAttribute("href")!=null && (!linklist.get(i).getAttribute("href").contains("mailto") && (!linklist.get(i).getAttribute("href").contains("javascript"))))
			{
				 activelinks.add(linklist.get(i));
			}
		}
		
		// Get the size of active links list:
		System.out.println("size of active links and images:"+activelinks.size());
		
		// 3.check the href url,with httpconnection api:
		
		for(int j=0;j<activelinks.size();j++)
		{
			HttpURLConnection connection=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"---->"+response);
		
		
		
		}
		
	}

}
