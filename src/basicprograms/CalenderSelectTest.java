package basicprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelectTest {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("saiprasad");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("hanuman@12c");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		String date="100 -September-2018";
		String dateArr[]=date.split("-");
		String day=dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];
		
		
	Select s1=new Select(driver.findElement(By.xpath("//*[@name='slctMonth']")));
	s1.selectByVisibleText(month);
	
	Select s2=new Select(driver.findElement(By.xpath("//*[@name='slctYear']")));
	
	s2.selectByVisibleText(year);
	
	//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
	//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
	//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[7]
	
	String beforexpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
	String afterxpath="]/td[";
	
	final int totalweekdays=7;
	Boolean flag=false;

	for(int rownum=2;rownum<=7;rownum++)
	{
		for(int colnum=1;colnum<=totalweekdays;colnum++)
		{
			String dayval=driver.findElement(By.xpath(beforexpath+rownum+afterxpath+colnum+"]")).getText();
			System.out.println(dayval);
			if(dayval.equals(day))
			{
				driver.findElement(By.xpath(beforexpath+rownum+afterxpath+colnum+"]")).click();
				flag=true;
				break;
			}

		}
		
		if(flag)
		{
			break;
		}
	}
	
	
	
		
		
		
		
		
	

	}

}
