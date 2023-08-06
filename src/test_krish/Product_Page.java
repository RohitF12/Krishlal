package test_krish;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_Page {

	public static void main(String[]args) throws InterruptedException {
				

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
		
	     	WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.krishlal.com/index.php");

	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
//TC_ID_73_Check the Product Page open properly	        
	  WebElement Product =  driver.findElement(By.xpath("//a[@href='product-category.php?id=2&type=top-category']"));
	        
	  Product.click();
	      
//TC_ID_74_check Product drop working properly	          
	     WebElement PRODUCT =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-2']"));
	      
	      PRODUCT.click();
	      
//TC_ID_75_check the Crop_Protection page open properly
	      
       WebElement Crop_Protection =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-21']"));
	      
       Crop_Protection.click();
       
       
 //TC_ID_76_check Fertilizer_Manure  button working fine 
       
       driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-2']")).click();
       
       WebElement Fertilizer_Manure =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-22']"));
	      
       Fertilizer_Manure.click();
       
       
          //TC_ID_77_check the Dung Compost page open properly
       
          String Text1 = driver.findElement(By.xpath("//a[@href='product.php?id=302']")).getText();
	      
	      System.out.println("Name = " + Text1);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=302']")).click();
	      
	      driver.navigate().back();
       
	      
         //TC_ID_78_check the seeds button should be work 
		    
	     driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-2']")).click();

	     
	     WebElement seeds =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-23']"));
		      
	     seeds.click();
                 	         
       
	   //TC_ID_79_check the Tool and Equipment button should be work
	     
	     driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-2']")).click();

	      WebElement ToolandEquipment =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-24']"));
			      
	      ToolandEquipment.click();
       
	    //TC_ID_80_check the other button should be work
		     
		  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-2']")).click();

	      WebElement other =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-25']"));
				      
	      other.click();
       
       driver.quit();
            
	      
	     
}
}