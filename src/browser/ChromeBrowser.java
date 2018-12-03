package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class ChromeBrowser {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		// Launching chrome Browser using chrome driver
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		
		
		
		
		// Launching IE browser using IE driver
		
		/*
		System.setProperty("webdriver.internetexplorer.driver","C:\\Users\\SAI\\Desktop\\mindq practice\\webdriverbrowsers\\MicrosoftWebDriver.exe");
		WebDriver ie=new InternetExplorerDriver();
		ie.get("http://www.google.com");
		*/
		
		// Launching firefox browser using gecodriver
		/*
		System.setProperty("webdriver.gecho.driver", "C:\\Users\\SAI\\Desktop\\mindq practice\\webdriverbrowsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		*/
		
		//Launching Opera browser using opera driver
		/*
		System.setProperty("webdriver.opera.driver", "C:\\Users\\SAI\\Desktop\\mindq practice\\webdriverbrowsers\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		Thread.sleep(5000);
		driver.get("http://www.google.com");
		*/
		
		
	}

}
