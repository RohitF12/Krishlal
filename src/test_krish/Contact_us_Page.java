package test_krish;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contact_us_Page {
	
	public static void main(String[]args) throws InterruptedException  {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
		
	     	WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.krishlal.com/index.php");
	     	
	        driver.manage().window().maximize();    
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        

//TC_ID_130_click on Contact_us page
	        
	      WebElement Contact_us =  driver.findElement(By.xpath("//a[@href='contact.php']"));
	        
	      Contact_us.click();
	      
	      
//TC_ID_131_Name field should accept any value     
	      
	      WebElement Name =  driver.findElement(By.xpath("//input[@name='visitor_name']"));
	        
	      Name.sendKeys("Test_45");
	
	
//TC_ID_132_Email_Address field should accept any value	
	
	      WebElement Email_Address =  driver.findElement(By.xpath("//input[@name='visitor_email']"));
	        
	      Email_Address.sendKeys("rfulzele@reyan.co.in");

	      
//TC_ID_133_Phone_Number field should accept any value	      
	      
	      WebElement Phone_Number =  driver.findElement(By.xpath("//input[@name='visitor_phone']"));
	        
	      Phone_Number.sendKeys("9080706050");	      
	      
	     // Thread.sleep(5000);
	      
//TC_ID_134_Message field should accept any value	      
	      
	      WebElement message =  driver.findElement(By.xpath("//textarea[@placeholder='Enter message']"));
	        
	      message.sendKeys("Krishlal is good application");	      
	      
//TC_ID_135_Check that I_am_not_robot should be tick	      
	      
	       
	       WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		      
		     wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
		      
		     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']")));
		      
		     element.click();
		     
		      System.out.println("clicked the checkbox");      	      
	      
//TC_ID_136_Check send message button is working 	  
		      
		  driver.switchTo().defaultContent();
		  
		  WebElement Submit_button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='form_contact']")));
	      
		  Submit_button.click();
	      
	      driver.switchTo().alert().accept();

}
}