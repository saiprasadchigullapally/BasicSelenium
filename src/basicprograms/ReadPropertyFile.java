package basicprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadPropertyFile {

    static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("E:\\frameworks\\basicselenium\\src\\basicprograms\\config.properties ");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
        String browsername=prop.getProperty("browser");
        String url= prop.getProperty("URL");
        System.out.println(browsername);
        System.out.println(url);
        if(browsername.equals("chrome"))
        {
        System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
	     driver=new ChromeDriver();
		
        }
        else if( browsername.equals("firefox"))
        {
        	System.setProperty("webdriver.gecko.driver", "C:\\Users\\SAI\\Desktop\\mindq practice\\webdriverbrowsers\\geckodriver.exe");
    		 driver=new FirefoxDriver();
    		
        }
        else if( browsername.equals("internetexplorer"))
        {
        	System.setProperty("webdriver.ie.driver","C:\\Users\\SAI\\Desktop\\mindq practice\\webdriverbrowsers\\MicrosoftWebDriver.exe");
    		 driver=new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        
        
       Set<String> window= driver.getWindowHandles();
       Iterator<String>i=window.iterator();
       String parent=i.next();
       String child1=i.next();
       String child2=i.next();
       String child3=i.next();
       driver.switchTo().window(child1);
       System.out.println("Window id is :"+driver.getTitle());
       driver.close();
       driver.switchTo().window(child2);
       System.out.println("Window id is :"+driver.getTitle());
       driver.close();
       driver.switchTo().window(child3);
       System.out.println("Window id is :"+driver.getTitle());
       driver.close();
       driver.switchTo().window(parent);
       System.out.println("Window id is :"+driver.getTitle());
       driver.findElement(By.xpath(prop.getProperty("register_clik"))).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath(prop.getProperty("Professional_click"))).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath(prop.getProperty("name_xpath"))).sendKeys(prop.getProperty("name"));
       Thread.sleep(2000);
       driver.findElement(By.xpath(prop.getProperty("emailid_xpath"))).sendKeys(prop.getProperty("emailid"));
       Thread.sleep(2000);
       driver.findElement(By.xpath(prop.getProperty("createpassword_xpath"))).sendKeys(prop.getProperty("createpassword"));
       Thread.sleep(2000);
       driver.findElement(By.xpath(prop.getProperty("mobilenumber_xpath"))).sendKeys(prop.getProperty("mobilenumber"));
       Thread.sleep(5000);
       Select ss=new Select(driver.findElement(By.xpath(("(//input[@ng-model='selectedName'])[1]"))));
       ss.selectByVisibleText("");
       Thread.sleep(2000);
       
       
       
       
      /* Select s1=new Select( driver.findElement(By.xpath(prop.getProperty("totalworkexperienceyear_xpath"))));
       s1.selectByVisibleText((prop.getProperty("totalworkexperienceyears")));
       Thread.sleep(5000);
       Select s2=new Select( driver.findElement(By.xpath(prop.getProperty("totalworkexperiencemoths_xpath"))));
       s2.selectByVisibleText(prop.getProperty("totalworkexperiectmonths"));
      */
       Thread.sleep(2000);
       
       
       driver.close();
    		   
       
       
        
        
        
	}

}
