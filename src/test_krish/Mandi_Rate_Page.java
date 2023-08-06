package test_krish;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mandi_Rate_Page {
	
	public static void main(String[]args) throws InterruptedException  {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
		
	     	WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.krishlal.com/index.php");
	     	
	        driver.manage().window().maximize();    
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       
	        
//TC_ID_137_Open mandi rate page	
	        
	        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		      
		     //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
		      
		     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div/div/div/ul/li[8]/a")));
		      
		     element.click();
		     
		     
		     driver.quit();
		     
//		      System.out.println("clicked the checkbox");      	
//
//	      WebElement MR =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/ul/li[8]/a"));
//	        
//	      MR.click();
	      
	     // Thread.sleep(20000);

    
}
}