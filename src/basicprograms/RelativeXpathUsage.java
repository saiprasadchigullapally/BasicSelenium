package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RelativeXpathUsage {

	
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Sign Up' and @color='red']")).click();
		Thread.sleep(5000);
		
		Select s=new Select(driver.findElement(By.name("payment_plan_id")));
		s.selectByVisibleText("Free Edition");
		Thread.sleep(5000);
		driver.findElement(By.name("first_name")).sendKeys("SaiPrasad");
		Thread.sleep(5000);
		driver.findElement(By.name("surname")).sendKeys("Chigullapally");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("saiprasadchigullapally23@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("email_confirm")).sendKeys("saiprasadchigullapally23@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("saiprasad");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("hanuman@12c");
		Thread.sleep(5000);
		driver.findElement(By.name("passwordconfirm")).sendKeys("hanuman@12c");
		Thread.sleep(5000);
		driver.findElement(By.name("agreeTerms")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='myButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("company_name")).sendKeys("Strugle for Destiny");
		Thread.sleep(5000);
		driver.findElement(By.id("phone")).sendKeys("918106803994");
		Thread.sleep(5000);
		driver.findElement(By.id("website")).sendKeys("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(5000);
		driver.findElement(By.id("company_email")).sendKeys("saip14433@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("service")).sendKeys("Company is looking for smart and hardworking with minimun common senses");
		Thread.sleep(5000);
		driver.findElement(By.id("address")).sendKeys("Rocktown colony,hyderabad");
		Thread.sleep(5000);
		driver.findElement(By.id("city")).sendKeys("Hyderabad");
		Thread.sleep(5000);
		driver.findElement(By.id("state")).sendKeys("Telangana");
		Thread.sleep(5000);
		driver.findElement(By.id("postcode")).sendKeys("500006");
		Thread.sleep(5000);
		Select ss=new Select(driver.findElement(By.name("country")));
		ss.selectByVisibleText("India");
		driver.findElement(By.name("copy_address")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("first_name")).sendKeys("sreenivasulusetty");
		Thread.sleep(5000);
		driver.findElement(By.name("surname")).sendKeys("chigullapally");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("saip14433@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("email_confirm")).sendKeys("saip14433@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("sreenivasulusetty");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("hanuman@12g");
		Thread.sleep(5000);
		driver.findElement(By.name("passwordconfirm")).sendKeys("hanuman@12g");
		Thread.sleep(5000);
		Select s3=new Select(driver.findElement(By.xpath("//*[text()='User']")));
		s3.selectByVisibleText("User");
		Thread.sleep(5000);
		driver.findElement(By.name("finish")).click();
		Thread.sleep(5000);
		
		
		
		
		
			
		

	}

}
