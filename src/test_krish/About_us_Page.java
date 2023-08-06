package test_krish;



import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class About_us_Page {

	
	public static void main(String[]args) throws InterruptedException, IOException {
		
		

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
		
	     	WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.krishlal.com/index.php");

	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
	        
//TC_ID_30_About Us should be open	        
	        
	      WebElement Aboutus =  driver.findElement(By.xpath("//a[@href='about.php']"));
	        
	      Aboutus.click();
	      
//TC_ID_31_Check the Krishlal link working properly
	      
	      WebElement CheckLinks =  driver.findElement(By.xpath("//a[@href='https://krishlal.com/']"));
	      
	      CheckLinks.click();
	      
	      Thread.sleep(5000);
          
          Set<String> handles3 = driver.getWindowHandles();

          Iterator it3 = handles3.iterator();

          String Parent_id3 = (String) it3.next();

         String Child_Id3 = (String) it3.next();
                      
         driver.switchTo().window(Child_Id3).close();

         driver.switchTo().window(Parent_id3);

         driver.quit(); 
	
          
          //public static void takeSnapShot(WebDriver driver,String test) throws Exception{

              //Convert web driver object to TakeScreenshot

//              File SrcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// 
//              Files.copy(SrcFile, new File("C:\\Users\\RohitFulzele\\Desktop\\RCS\\test1.png"));
//              
//             driver.quit(); 
              
         
	}
         
    	 
       
    
    	 
     }











