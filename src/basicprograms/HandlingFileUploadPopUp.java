package basicprograms;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopUp {

	
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("saip14433@gmail.com",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("1hanuman",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("to")).sendKeys("saiprasadchigullapally23@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("subjectbox")).sendKeys("Try and Try until u suceed in Software Testing engineer");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@role='textbox']")).sendKeys("Dear Sai, You should understand the value of time then only you will succed in the time else you will fail.? Khal kara so Aja ,Aja kara so Ab");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@data-tooltip='Attach files']/descendant ::*[3]")).click();
		Thread.sleep(5000);
		// Window Handling by robot and StringSelection
		StringSelection ss=new StringSelection("C:\\Users\\SAI\\Pictures\\Untitled.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		String g=driver.findElement(By.xpath("//*[contains(text(),'Your message has been sent')]")).getText();
		System.out.println(g);
		Thread.sleep(5000);
		if(g.equals("Your message has been sent. View message"))
		{
			System.out.println("Message has sent to recepient and test was passed");
		}
		else
		{
			System.out.println("Message was not sent and test was failed");
		}
		
		
		 
		
		
driver.quit();
	}

}
