package test_krish;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {
	
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
	      
	      
	      //we need to automate it
	      
//TC_ID_143_Check verify OTP button 	      
	            
	      WebElement Verify_otp = driver.findElement(By.xpath("//button[@name='form2']"));

	      Verify_otp.click();
	      
	      Thread.sleep(10000);
	      
	//TC_ID_144_check  My product  tab is working 
	      
	      WebElement My_product = driver.findElement(By.xpath("//a[@href='productlist.php']"));

	      My_product.click();
	      
	      Thread.sleep(5000);
	      
//TC_ID_145_check  My service  tab is working	      
	      
	      WebElement My_service = driver.findElement(By.xpath("//a[@href='servicelist.php']"));

	      My_service.click();
	      
	      Thread.sleep(5000);
	      
//TC_ID_146_check  Product orders  tab is working	      
	      
	      WebElement Product_orders = driver.findElement(By.xpath("//a[@href='product-order.php']"));

	      Product_orders.click();
	      
	      Thread.sleep(5000);
	      
//TC_ID_147_check  service booking  tab is working	      
	      
	      WebElement service_booking = driver.findElement(By.xpath("//a[@href='service-booking.php']"));

	      service_booking.click();
	      
	      Thread.sleep(5000);
	      
//TC_ID_148_check my order  tab is working	      
	      WebElement my_order = driver.findElement(By.xpath("//a[@href='product-order-by-me.php']"));

	      my_order.click();
	      
	      Thread.sleep(5000);
	      
//TC_ID_149_check  my booking  tab is working	      
	      
	      WebElement my_booking = driver.findElement(By.xpath("//a[@href='service-booking-by-me.php']"));

	      my_booking.click();
	      
	      Thread.sleep(5000);
	      
//TC_ID_150_check  update profile tab is working	      
	      
	      WebElement update_profile = driver.findElement(By.xpath("//a[@href='customer-profile-update.php']"));

	      update_profile.click();
	            
	      Thread.sleep(5000);
	      
	      
	      //TC_ID_152_Check Register no field is disabled  
	          
	      boolean Register_Mobile = driver.findElement(By.xpath("//input[@name='mobile']")).isEnabled();
          
	        System.out.println("fiels enabled= " + Register_Mobile);
	      
	      //TC_ID_153_Check Adhar_Id no field is disabled
	      
		   boolean Adhar_Id = driver.findElement(By.xpath("//input[@name='aadhaar']")).isEnabled();
	          
		   System.out.println("fiels enabled= " + Adhar_Id);
	      
	      
	      //TC_ID_154_Check Alternate_Mobile no field is working 
	      
		   boolean Alternate_Mobile = driver.findElement(By.xpath("//input[@name='altmobile']")).isEnabled();
	          
		   System.out.println("fiels enabled= " + Alternate_Mobile);	
		   
		   driver.findElement(By.xpath("//input[@name='altmobile']")).sendKeys("8999144992");
	      
	      //TC_ID_155_Check Email  field is working 
	      
		   boolean Email = driver.findElement(By.xpath("//input[@name='emailId']")).isEnabled();
		   	          
		   System.out.println("fiels enabled= " + Email);	   
		   
		   driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("rfulzele@reyan.co.in");
	      
	      //TC_ID_156_ Check First name  field is working 
		   
		  //TC_ID_157_Check profile photo update section
		   
	    //TC_ID_158_Dashboard icon is clickable
		   
	   WebElement dashboard = driver.findElement(By.xpath(" //a[@href='dashboard.php']"));

	   dashboard.click();		   
		   
		//TC_ID_159_Logout icon is working
	   
	   WebElement Logout = driver.findElement(By.xpath(" //a[@href='logout.php']"));

	   Logout.click();
}
}