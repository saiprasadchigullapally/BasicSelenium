package basicprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlertHandler {

	//Locate  operate and observe is known as web pages automation testing
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();// Locating and operate
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		String ss=al.getText();
		
		// Observations
		if(ss.equals("Please enter your User ID"))
		{
			System.out.println("Pop up text was correct ");
		}
		else
		{
			System.out.println("Pop up text was incorrect");
		}
		al.accept();
		
		Thread.sleep(5000);
		
		
        driver.quit();
	}

}
