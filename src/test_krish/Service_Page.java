package test_krish;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Service_Page {
	
	
	public static void main(String[]args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
		
	     	WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.krishlal.com/index.php");

	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        
	      WebElement Services =  driver.findElement(By.xpath("//a[@href='product-category.php?id=1&type=top-category']"));
	        
	      Services.click();
	      
//TC_ID_31_Check the Service Page open properly          
	      
	      WebElement Services1 =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-1']"));
	      
	      Services1.click();
	      
//TC_ID_33_check the cultivation page open properly
	      
          WebElement cultivation =  driver.findElement(By.xpath("//span[@class='lbl lbl1']"));
	      
          cultivation.click();
          
	      //TC_ID_34_check the MB Plaugh details button working fine
	      
          String Text2 = driver.findElement(By.xpath("//a[@href='product.php?id=310']")).getText();
	      
	      System.out.println("Name = " + Text2);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=310']")).click();
	      
	      driver.navigate().back();   
	      
          //TC_ID_35_check the Rotavator details button working fine
	      
          String Text4 = driver.findElement(By.xpath("//a[@href='product.php?id=299']")).getText();
	      
	      System.out.println("Name = " + Text4);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=299']")).click();
	      
	      driver.navigate().back();
	      
          //TC_ID_36_check the Harrow details button working fine
	      
          String Text5 = driver.findElement(By.xpath("//a[@href='product.php?id=293']")).getText();
	      
	      System.out.println("Name = " + Text5);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=293']")).click();
	      
	      driver.navigate().back();
	      
          //TC_ID_37_check the plow details button working fine
	      
          String Text6 = driver.findElement(By.xpath("//a[@href='product.php?id=294']")).getText();
	      
	      System.out.println("Name = " + Text6);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=294']")).click();
	      
	      driver.navigate().back();
	      
          //TC_ID_38_check the spray details button working fine
	      
          String Text7 = driver.findElement(By.xpath("//a[@href='product.php?id=295']")).getText();
	      
	      System.out.println("Name = " + Text7);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=295']")).click();
	      
	      driver.navigate().back();
	      	      
          //TC_ID_39_check the sowing details button working fine
	      
          String Text8 = driver.findElement(By.xpath("//a[@href='product.php?id=296']")).getText();
	      
	      System.out.println("Name = " + Text8);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=296']")).click();
	      
	      driver.navigate().back();
	      
          //TC_ID_40_check the Digital Goddi details button working fine
	      
          String Text9 = driver.findElement(By.xpath("//a[@href='product.php?id=297']")).getText();
	      
	      System.out.println("Name = " + Text9);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=297']")).click();
	      
	      driver.navigate().back();
	      

          //TC_ID_41_check the slasher details button working fine
	      
          String Text10 = driver.findElement(By.xpath("//a[@href='product.php?id=311']")).getText();
	      
	      System.out.println("Name = " +Text10);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=311']")).click();
	      
	      driver.navigate().back();
	      
//TC_ID_42_check the Fertilizing button should be work
	      
          WebElement Service =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-1']"));
	      
          Service.click();
	      
          WebElement Fertilizing =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-12']"));
	      
          Fertilizing.click();
	      	            

//TC_ID_43_check the Harvesting button should be work
	      
          WebElement Service3 =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-1']"));
	      
          Service3.click();
	      
          WebElement Harvesting =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-13']"));
	      
          Harvesting.click();
          
 	     //TC_ID_44_check Straw reaper page working properly
	      
          String Text14 = driver.findElement(By.xpath("//a[@href='product.php?id=300']")).getText();
 	      
 	      System.out.println("Name = " + Text14);
 	            	      	     
 	      driver.findElement(By.xpath("//a[@href='product.php?id=300']")).click();
 	      
 	      driver.navigate().back();	  
          
          //TC_ID_45_check the Dhaan cutter page open properly
	      
	      String Text16 = driver.findElement(By.xpath("//a[@href='product.php?id=301']")).getText();
		      
		  System.out.println("Name = " + Text16);
		            	      	     
		  driver.findElement(By.xpath("//a[@href='product.php?id=301']")).click();
		      
	      driver.navigate().back();	    
	      
          //TC_ID_46_check the Reaper binder details button working fine
	      
	      String Text17 = driver.findElement(By.xpath("//a[@href='product.php?id=292']")).getText();
		      
		  System.out.println("Name = " + Text17);
		            	      	     
		  driver.findElement(By.xpath("//a[@href='product.php?id=292']")).click();
		      
	      driver.navigate().back();	  
	      
//TC_ID_47_check the Irrigation button should be work
	      
          WebElement Service4 =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-1']"));
	      
          Service4.click();
	      
          WebElement Irrigation =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-14']"));
	      
          Irrigation.click();	      
	      
	      
//TC_ID_48_check the sowing button should be work
	      
          WebElement Service5 =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-1']"));
	      
          Service5.click();
	      
          WebElement Sowing =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-15']"));
	      
          Sowing.click();	      
	      
	      //TC_ID_49_check the super seeder page open properly
	      
	      String Text22 = driver.findElement(By.xpath("//a[@href='product.php?id=309']")).getText();
		      
		  System.out.println("Name = " + Text22);
		            	      	     
		  driver.findElement(By.xpath("//a[@href='product.php?id=309']")).click();
		      
		  driver.navigate().back();		
		  
         //TC_ID_50_check the benefits_of_seed_remedies details button working fine
	      
	      String Text23 = driver.findElement(By.xpath("//a[@href='product.php?id=320']")).getText();
		      
		  System.out.println("Name = " + Text23);
		            	      	     
		  driver.findElement(By.xpath("//a[@href='product.php?id=320']")).click();
		      
		  driver.navigate().back();	 
	      
// Animal
	      
          WebElement Service6 =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-1']"));
	      
          Service6.click();
	      
          WebElement Animal =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-16']"));
	      
          Animal.click();	      
	      
	      
//TC_ID_51_check the Transportation button should be work
	      
          WebElement Service7 =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-1']"));
	      
          Service7.click();
	      
          WebElement Transportation =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-17']"));
	      
          Transportation.click();
	      
	      //TC_ID_52_check the Trolley page open properly
          
  	      String Text34 = driver.findElement(By.xpath("//a[@href='product.php?id=298']")).getText();
	      
	      System.out.println("Name = " + Text34);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=298']")).click();
	      
	      driver.navigate().back();		      
	      
//TC_ID_53_check the Others button should be work
	      
          WebElement Service8 =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-1']"));
	      
          Service8.click();
	      
          WebElement Others =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-18']"));
	      
          Others.click();
	      
	      //TC_ID_54_check the Uple or Kanda or Goitha page open properly
          
  	      String Text35 = driver.findElement(By.xpath("//a[@href='product.php?id=303']")).getText();
	      
	      System.out.println("Name = " + Text35);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=303']")).click();
	      
	      driver.navigate().back();	 
	      
	      //TC_ID_55_check the Green Fodder Sorghum page open properly
          
  	      String Text36 = driver.findElement(By.xpath("//a[@href='product.php?id=304']")).getText();
	      
	      System.out.println("Name = " + Text36);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=304']")).click();
	      
	      driver.navigate().back();		      
	      
	      //TC_ID_56_check the Berseem page open properly
          
  	      String Text37 = driver.findElement(By.xpath("//a[@href='product.php?id=305']")).getText();
	      
	      System.out.println("Name = " + Text37);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=305']")).click();
	      
	      driver.navigate().back();		      
	      
	      
	      //TC_ID_57_check the Oat page open properly
          
  	      String Text38 = driver.findElement(By.xpath("//a[@href='product.php?id=306']")).getText();
	      
	      System.out.println("Name = " + Text38);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=306']")).click();
	      
	      driver.navigate().back();		      
	      
	      //TC_ID_58_check the Maize page open properly
          
  	      String Text39 = driver.findElement(By.xpath("//a[@href='product.php?id=307']")).getText();
	      
	      System.out.println("Name = " + Text39);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=307']")).click();
	      
	      driver.navigate().back();			      
	      
	      //TC_ID_59_check the Straw page open properly
          
  	      String Text40 = driver.findElement(By.xpath("//a[@href='product.php?id=308']")).getText();
	      
	      System.out.println("Name = " + Text40);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=308']")).click();
	      
	      driver.navigate().back();		      	      
	      
	      
	      //TC_ID_60_check the Benefits of wheat grass page open properly
          
  	      String Text42 = driver.findElement(By.xpath("//a[@href='product.php?id=313']")).getText();
	      
	      System.out.println("Name = " + Text42);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=313']")).click();
	      
	      driver.navigate().back();		 
	      
	      //TC_ID_61_check the Onion crop page open properly
          
  	      String Text43 = driver.findElement(By.xpath("//a[@href='product.php?id=318']")).getText();
	      
	      System.out.println("Name = " + Text43);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=318']")).click();
	      
	      driver.navigate().back();	
	      
	      //TC_ID_62_check the Kisan Credit Card Yojna page open properly
          
  	      String Text44 = driver.findElement(By.xpath("//a[@href='product.php?id=321']")).getText();
	      
	      System.out.println("Name = " + Text44);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=321']")).click();
	      
	      driver.navigate().back();	  
	      
	      //TC_ID_63_check the Wheat Storage page open properly
          
  	      String Text45 = driver.findElement(By.xpath("//a[@href='product.php?id=322']")).getText();
	      
	      System.out.println("Name = " + Text45);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=322']")).click();
	      
	      driver.navigate().back();		      

	      //TC_ID_64_check the When and how to check the soil page open properly
          
  	      String Text46 = driver.findElement(By.xpath("//a[@href='product.php?id=323']")).getText();
	      
	      System.out.println("Name = " + Text46);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=323']")).click();
	      
	      driver.navigate().back();		
	      
	      
//TC_ID_65_check the Pest Control button should be work
	      
          WebElement Service9 =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-1']"));
	      
          Service9.click();
	      
          WebElement Pest_Control =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-19']"));
	      
          Pest_Control.click();
	      
	      //TC_ID_66_check the chane ke fasl page open properly
          
  	      String Text47 = driver.findElement(By.xpath("//a[@href='product.php?id=312']")).getText();
	      
	      System.out.println("Name = " + Text47);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=312']")).click();
	      
	      driver.navigate().back();	 
	      
	      //TC_ID_67_check the Mango Diseases and Control page open properly
          
  	      String Text49 = driver.findElement(By.xpath("//a[@href='product.php?id=316']")).getText();
	      
	      System.out.println("Name = " + Text49);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=316']")).click();
	      
	      driver.navigate().back();	 
	      
	      //TC_ID_68_check the Major diseases and prevention of wheat page open properly
          
  	      String Text50 = driver.findElement(By.xpath("//a[@href='product.php?id=319']")).getText();
	      
	      System.out.println("Name = " + Text50);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=319']")).click();
	      
	      driver.navigate().back();		
	      	      
// Fertilizers
	      
          WebElement Service10 =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-1']"));
	      
          Service10.click();
	      
          WebElement Fertilizers =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-110']"));
	      
          Fertilizers.click();
	      
	      //organic fertilizers and synthetic or chemical fertilizers
          
  	      String Text51 = driver.findElement(By.xpath("//a[@href='product.php?id=315']")).getText();
	      
	      System.out.println("Name = " + Text51);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=315']")).click();
	      
	      driver.navigate().back();		      
	      
// Health_Wellness
	      
          WebElement Service11 =  driver.findElement(By.xpath("//span[@href='#cat-lvl1-id-1']"));
	      
          Service11.click();
	      
          WebElement Health_Wellness =  driver.findElement(By.xpath("//span[@href='#cat-lvl2-id-111']"));
	      
          Health_Wellness.click();
	      
	      //Benefits of crop residue decomposition in the field
          
  	      String Text52 = driver.findElement(By.xpath("//a[@href='product.php?id=317']")).getText();
	      
	      System.out.println("Name = " + Text52);
	            	      	     
	      driver.findElement(By.xpath("//a[@href='product.php?id=317']")).click();
	      
	      driver.navigate().back();	 
	      
	      driver.quit();
}	      
	      
}
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      

