package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {

	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium softwares\\chromedriver.exe");// Locating the path of the driver
		WebDriver driver =new ChromeDriver();// Launching Chrome Browser using chrome driver
		driver.get("http://www.google.com");// Launching google website  in chrome browser
		driver.manage().window().maximize();
		String s=driver.getTitle();// Getting the title of the given website
		System.out.println(s);
	
		
		// Title page verification code
		if (s.equals("Google"))  
		{
			System.out.println("Title page verification is  passed");
		}
		else
		{
			System.out.println("Title page verification is failed");
		}
		
		System.out.println(driver.getCurrentUrl());// To get the current URL
		
		//System.out.println(driver.getPageSource()); // To get the current page source code
		
		driver.quit();
	}

}
