package test_krish;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class About_us_Page2 {

	
	public static void main(String[]args) throws InterruptedException, IOException {
		
		

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
		
	     	WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.krishlal.com/index.php");

	        driver.manage().window().maximize();
//	        
////	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////	     
//////	        JavascriptExecutor scrolls = (JavascriptExecutor)driver;
//////	        
//////	        scrolls.executeScript("window, scrollBy(0,2000)");
////	        
////	        
////	        
////	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////	        
////	        driver.findElement(By.xpath("//a[@href='index.php']"));
////	        
////	       
////	        
////	       WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
////	      
////	       WebElement MR = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@style='cursor: pointer;']")));
////	      
////	         MR.click();
////	         
////	       // driver.findElement(By.xpath("//div[@style='display: flex; align-items: center;']")).click();
////	        
////	        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
////
////	        // start chat
////	        
////	        driver.findElement(By.xpath("//*[@id=\"u_0_0_/R\"]/div/div/div/div/div[1]/div/div[5]/div/div/div/span")).click();
////	        
////	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
////	        //continue as guest
////	                     driver.findElement(By.xpath("//a[@href='service.php']")).click();
//	        
//            driver.findElement(By.xpath("//a[@href='service.php']")).click();
//
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//            driver.findElement(By.xpath("//a[@href='http://krishlal.reyan.co.in/']")).click();
//
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//	        
//			String expPageTitle = "http://krishlal.reyan.co.in";
//	
//			if (driver.getTitle().equalsIgnoreCase(expPageTitle)) {
//				
//				// This method will return True when the page title matches with specified string
//				System.out.println("Page is working fine");
//			}
//			else {
//				
//				System.out.println("page is not open");
//			}
//			
//	        
//	        Set<String> handles7 = driver.getWindowHandles();
//
//	        Iterator it7 = handles7.iterator();
//
//	        String Parent_id7 = (String) it7.next();
//
//	        String Child_Id7 = (String) it7.next();
//
//	        driver.switchTo().window(Child_Id7).close();
//
//	        driver.switchTo().window(Parent_id7);
//
//	        
//    driver.quit();
//    	 
//     }
//}
//
/////////////////////////screenshot
//
////public static void takeSnapShot(WebDriver driver,String test) throws Exception{
//
////Convert web driver object to TakeScreenshot
//
////File SrcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////
////Files.copy(SrcFile, new File("C:\\Users\\RohitFulzele\\Desktop\\RCS\\test1.png"));
////
////driver.quit(); 

	    	
	 	   WebElement Government_Scheme1 =  driver.findElement(By.xpath("//a[@href='governmentScheme.php']"));
	       
	 	  Government_Scheme1.click();
	 	   
	 	  
	 	
	 	
	 	
	    //TC_ID_100_check more info button of Goat_Farming     
	 	     
	 		 // WebElement Goat_Farming = driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=24']"));
	 	        
	 		//  Goat_Farming.click();
	 		
	 		
	 		
	 		 WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(100));
	 		  
	 		  WebElement Submit_button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='governmentScheme-details.php?id=24']")));
	 		
	 		  Submit_button1.click();
	 		
	}}




