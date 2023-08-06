package test_krish;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OTP_TEst {
		
		public static void main(String[]args) throws InterruptedException  {
			
			   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
			
		     	WebDriver driver = new ChromeDriver();
			
		        driver.get("https://www.krishlal.com/index.php");
		     	
		        driver.manage().window().maximize();    
		        
		        Thread.sleep(5000);
		        
	//TC_ID_138_Check login page should be clickable
		        
		      WebElement login = driver.findElement(By.xpath("//a[@href='login.php']"));

		      login.click();
		      
		      Thread.sleep(5000);
		      
	//TC_ID_139_check Register mobile number field	      
		      
		      WebElement Mobile_No = driver.findElement(By.xpath("//input[@placeholder='Registered mobile number']"));

		      Mobile_No.sendKeys("8999144992");
		      
	//TC_ID_141_Check Send OTP button 
		      
		      WebElement send_otp = driver.findElement(By.xpath("//button[@name='form1']"));

		      send_otp.click();
		      
		      Thread.sleep(10000);
		      
		      
	// TC_ID_142 Check Enter OTP field
		      
		      ((JavascriptExecutor)driver).executeScript("window.open()");

		      ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		      driver.switchTo().window(tabs.get(1));
	      
		      driver.get("https://web.airdroid.com/?lang=en");

		        driver.manage().window().maximize();    
		        
		        Thread.sleep(5000);
		      
		     // driver.switchTo().alert().accept();
		      
		      WebElement Get_started =   driver.findElement(By.xpath("//div[@id='alert_box_yes_btn']"));
		      
		      Get_started.click();
		      
		      Thread.sleep(5000);
		      
              WebElement Email =   driver.findElement(By.xpath("//input[@class='widget-login-account-input']"));
		      
              Email.sendKeys("rfulzele@reyan.co.in");
		      
              WebElement password =   driver.findElement(By.xpath("//input[@class='widget-login-pwd-input']"));
		      
              password.sendKeys("Rohita@12");	
              
              Thread.sleep(5000);
		      
              WebElement signin =   driver.findElement(By.xpath("//button[@class='btn widget-login-btn']"));
		      
              signin.click();
		      
              //driver.switchTo().alert().accept();
		      
		      // got it
		      
            //  Thread.sleep(5000);
              
              
   	       WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		      
   		    // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
   		      
   		     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"alert_box_yes_btn\"]")));
   		      
   		     element.click();
              
          // driver.findElement(By.xpath("//*[@id=\"alert_box_yes_btn\"]")).click();
		      
   		   WebDriverWait wait1 = new WebDriverWait (driver, Duration.ofSeconds(20));
		      
  		    // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
  		      
  		     WebElement element2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"widget_widget_100\"]/div[2]/div/div[3]/button")));
  		      
  		     element2.click();
            
           // Thread.sleep(5000);
		      
           // WebElement getStarted =   driver.findElement(By.xpath("//*[@id=\"widget_widget_100\"]/div[2]/div/div[3]/button"));
		      
            //getStarted.click();		  
            
            // click on message
		      
            WebElement message =   driver.findElement(By.xpath("//*[@id=\"icon_1_0_1\"]/div[1]/img"));
		      
            message.click();		      
            
            Thread.sleep(10000);
		      
            
            WebElement element1 = driver.findElement(By.className("mod-multiChat-smsItemBody"));
            
                         
            element1.click();
            
            String content = element1.getText();
            
            System.out.println(content);
            
            Pattern pattern = Pattern.compile("\\b(\\d{4})\\b");
            
            Matcher matcher = pattern.matcher(content);
            
            String Verification_Code = null;
            
            if (matcher.find()) 
            
            { 
            	Verification_Code =  matcher.group(1);
            	
            	System.out.println(Verification_Code);
            	 	
            }
            else {
            	System.out.println("Verification_Code not found");
            }
            
            Set<String> handles = driver.getWindowHandles();
            
            Iterator it = handles.iterator();

            String Parent_id = (String) it.next();
            
            String Child_Id = (String) it.next();
            		                 
            driver.switchTo().window(Child_Id).close();
            
            driver.switchTo().window(Parent_id);
            
            
            WebElement otp_Field = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/form/div[2]/div[1]/input"));
            
            otp_Field.sendKeys(Verification_Code);
                        

		      
	//TC_ID_143_Check verify OTP button 

		      WebElement Verify_otp = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/form/div[2]/div[2]/button"));

		      Verify_otp.click();
		      
		      Thread.sleep(10000);
		
		
		
		

	}}


