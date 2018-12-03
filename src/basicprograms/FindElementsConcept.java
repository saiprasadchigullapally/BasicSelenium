package basicprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//*[@class='multiselect dropdown-toggle btn btn-default']")).click();
		Thread.sleep(5000);
		List<WebElement> elements=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
        Thread.sleep(5000);
        System.out.println(elements.size());
     
        
        for(int i=0;i<elements.size();i++)
        {
       	 System.out.println(elements.get(i).getText());
       	 
       	 if(elements.get(i).isSelected())
       	 {
       		elements.get(i).click(); 
       	 
       	 }
       	 
       	 }
       	 
        
    
        
        
 /*       
        for(int i=0;i<elements.size();i++)
     {
    	 System.out.println(elements.get(i).getText());
    	 if(elements.get(i).getText().contains("Angular"))
    	 {
    		 elements.get(i).click();
    		 break;
    	 }
     }
   */  
       
        
	} 

}

