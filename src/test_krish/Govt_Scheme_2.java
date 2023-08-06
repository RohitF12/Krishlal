package test_krish;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Govt_Scheme_2 {

	public static void main(String[]args) throws InterruptedException  {
		
		

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
		
	     	WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.krishlal.com/index.php");
	     	

	        driver.manage().window().maximize();    
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	      WebElement Government_Scheme =  driver.findElement(By.xpath("//a[@href='governmentScheme.php']"));
	        
	      Government_Scheme.click();	
	      
//TC_ID_103_check more info button of Mukhya_Mantri_Bhed
	      
	      
		  WebElement Mukhya_Mantri_Bhed =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=17']"));
	      
		  Mukhya_Mantri_Bhed.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_103_1_check more details button is workiing and open new tab with new page	  
		  
		  WebElement More_Info19 = driver.findElement(By.xpath("//a[@href='http://pashudhanharyana.gov.in/schemes']"));
							        
		  More_Info19.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles19 = driver.getWindowHandles();
					      
	    Iterator it19 = handles19.iterator();
		
	   String Parent_id19 = (String) it19.next();
					      
	   String Child_Id19 = (String) it19.next();
						     
	   driver.switchTo().window(Child_Id19).close();
						      
	   driver.switchTo().window(Parent_id19); 
	   
	   driver.navigate().back();	
	   
	   
//TC_ID_104_check more info button of Scheme_for_the_conservation 
	      
	      
		  WebElement Scheme_for_the_conservation =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=16']"));
	      
		  Scheme_for_the_conservation.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//TC_ID_104_1_check more details button is workiing and open new tab with new page
		  
		  WebElement More_Info20 = driver.findElement(By.xpath("//a[@href='http://pashudhanharyana.gov.in/schemes']"));
							        
		  More_Info20.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles20 = driver.getWindowHandles();
					      
	    Iterator it20 = handles20.iterator();
		
	   String Parent_id20 = (String) it20.next();
					      
	   String Child_Id20 = (String) it20.next();
						     
	   driver.switchTo().window(Child_Id20).close();
						      
	   driver.switchTo().window(Parent_id20); 
	   
	   driver.navigate().back();	
	   

//TC_ID_105_check more info button of Scheme_for_Integrated_Murrah_Development
	      
	      
		  WebElement Scheme_for_Integrated_Murrah_Development =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=15']"));
	      
		  Scheme_for_Integrated_Murrah_Development.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_105_1_check more details button is workiing and open new tab with new page
		  
		  WebElement More_Info21 = driver.findElement(By.xpath("//a[@href='http://pashudhanharyana.gov.in/schemes']"));
							        
		  More_Info21.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles21 = driver.getWindowHandles();
					      
	    Iterator it21 = handles21.iterator();
		
	   String Parent_id21 = (String) it21.next();
					      
	   String Child_Id21 = (String) it21.next();
						     
	   driver.switchTo().window(Child_Id21).close();
						      
	   driver.switchTo().window(Parent_id21); 
	   
	   driver.navigate().back();	
	   
	   
//TC_ID_106_check more info button of Har_Khet_ko_Pani_Prime_Minister
	      
	      
		  WebElement Har_Khet_ko_Pani_Prime_Minister =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=14']"));
	      
		  Har_Khet_ko_Pani_Prime_Minister.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
//TC_ID_106_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info22 = driver.findElement(By.xpath("//a[@href='http://pmksy.gov.in/']"));
							        
		  More_Info22.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles22 = driver.getWindowHandles();
					      
	    Iterator it22 = handles22.iterator();
		
	   String Parent_id22 = (String) it22.next();
					      
	   String Child_Id22 = (String) it22.next();
						     
	   driver.switchTo().window(Child_Id22).close();
						      
	   driver.switchTo().window(Parent_id22); 
	   
	   driver.navigate().back();
	   
	   
//TC_ID_107_check more info button of Soil_Health_Card
	      
	      
		  WebElement Soil_Health_Card =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=14']"));
	      
		  Soil_Health_Card.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_107_1_check more details button is workiing and open new tab with new page
		  
		  WebElement More_Info23 = driver.findElement(By.xpath("//a[@href='http://pmksy.gov.in/']"));
							        
		  More_Info23.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles23 = driver.getWindowHandles();
					      
	    Iterator it23 = handles23.iterator();
		
	   String Parent_id23 = (String) it23.next();
					      
	   String Child_Id23 = (String) it23.next();
						     
	   driver.switchTo().window(Child_Id23).close();
						      
	   driver.switchTo().window(Parent_id23); 
	   
	   driver.navigate().back();
	   

//TC_ID_108_check more info button of Pradhan_Mantri_Fasal 
	      
	      
		  WebElement Pradhan_Mantri_Fasal =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=12']"));
	      
		  Pradhan_Mantri_Fasal.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_108_1_check more details button is workiing and open new tab with new page	  
		  
		  WebElement More_Info24 = driver.findElement(By.xpath("//a[@href='https://pmfby.gov.in/']"));
							        
		  More_Info24.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles24 = driver.getWindowHandles();
					      
	    Iterator it24 = handles24.iterator();
		
	   String Parent_id24 = (String) it24.next();
					      
	   String Child_Id24 = (String) it24.next();
						     
	   driver.switchTo().window(Child_Id24).close();
						      
	   driver.switchTo().window(Parent_id24); 
	   
	   driver.navigate().back();	   
	   
	   
//TC_ID_109_check more info button of प्रधानमंत्री_किसान_सम्मान_निधि
	      
	      
		  WebElement प्रधानमंत्री_किसान_सम्मान_निधि =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=11']"));
	      
		  प्रधानमंत्री_किसान_सम्मान_निधि.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_109_1_check more details button is workiing and open new tab with new page
		  
		  WebElement More_Info25 = driver.findElement(By.xpath("//a[@href='https://pmkisan.gov.in/']"));
							        
		  More_Info25.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles25 = driver.getWindowHandles();
					      
	    Iterator it25 = handles25.iterator();
		
	   String Parent_id25 = (String) it25.next();
					      
	   String Child_Id25 = (String) it25.next();
						     
	   driver.switchTo().window(Child_Id25).close();
						      
	   driver.switchTo().window(Parent_id25); 
	   
	   driver.navigate().back();		   
	   

//TC_ID_110_check more info button of बैटरी_चलित_स्प्रे_पंप 
	      
	      
		  WebElement बैटरी_चलित_स्प्रे_पंप =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=10']"));
	      
		  बैटरी_चलित_स्प्रे_पंप.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_110_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info26 = driver.findElement(By.xpath("//a[@href='https://www.agriharyanacrm.com/beneficiary/scheme/']"));
							        
		  More_Info26.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles26 = driver.getWindowHandles();
					      
	    Iterator it26 = handles26.iterator();
		
	   String Parent_id26 = (String) it26.next();
					      
	   String Child_Id26 = (String) it26.next();
						     
	   driver.switchTo().window(Child_Id26).close();
						      
	   driver.switchTo().window(Parent_id26); 
	   
	   driver.navigate().back();	   
	   
	   
//TC_ID_111_check more info button of मेरा_पानी_मेरी_विरासत 
	      
	      
		  WebElement मेरा_पानी_मेरी_विरासत =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=9']"));
	      
		  मेरा_पानी_मेरी_विरासत.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_111_1_check more details button is workiing and open new tab with new page
		  
		  WebElement More_Info27 = driver.findElement(By.xpath("//a[@href='http://117.240.196.238:1670/Default.aspx']"));
							        
		  More_Info27.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles27 = driver.getWindowHandles();
					      
	    Iterator it27 = handles27.iterator();
		
	   String Parent_id27 = (String) it27.next();
					      
	   String Child_Id27 = (String) it27.next();
						     
	   driver.switchTo().window(Child_Id27).close();
						      
	   driver.switchTo().window(Parent_id27); 
	   
	   driver.navigate().back();	   	   
	   
//TC_ID_112_check more info button of Krashi_Raksh 
	      
	      
		  WebElement Krashi_Raksh =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=7']"));
	      
		  Krashi_Raksh.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_112_1_check more details button is workiing and open new tab with new page
		  
		  WebElement More_Info28 = driver.findElement(By.xpath("//a[@href='http://upagripardarshi.gov.in/staticpages/KrshiRakshaYojana.aspx#']"));
							        
		  More_Info28.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles28 = driver.getWindowHandles();
					      
	    Iterator it28 = handles28.iterator();
		
	   String Parent_id28 = (String) it28.next();
					      
	   String Child_Id28 = (String) it28.next();
						     
	   driver.switchTo().window(Child_Id28).close();
						      
	   driver.switchTo().window(Parent_id28); 
	   
	   driver.navigate().back();
	   
	   
//TC_ID_113_check more info button of National_Mission_For_Sustainable
	      
	      
		  WebElement National_Mission_For_Sustainable =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=6']"));
	      
		  National_Mission_For_Sustainable.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_113_1_check more details button is workiing and open new tab with new page 
		  
		  WebElement More_Info29 = driver.findElement(By.xpath("//a[@href='https://nmsa.dac.gov.in/']"));
							        
		  More_Info29.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles29 = driver.getWindowHandles();
					      
	    Iterator it29 = handles29.iterator();
		
	   String Parent_id29 = (String) it29.next();
					      
	   String Child_Id29 = (String) it29.next();
						     
	   driver.switchTo().window(Child_Id29).close();
						      
	   driver.switchTo().window(Parent_id29); 
	   
	   driver.navigate().back();	  	   

//TC_ID_114_check more info button of National_Agriculture_Market 	   
	   
		  WebElement National_Agriculture_Market =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=5']"));
	      
		  National_Agriculture_Market.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_114_1_check more details button is workiing and open new tab with new page  
		  
		  WebElement More_Info30 = driver.findElement(By.xpath("//a[@href='https://enam.gov.in/web/']"));
							        
		  More_Info30.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles30 = driver.getWindowHandles();
					      
	    Iterator it30 = handles30.iterator();
		
	   String Parent_id30 = (String) it30.next();
					      
	   String Child_Id30= (String) it30.next();
						     
	   driver.switchTo().window(Child_Id30).close();
						      
	   driver.switchTo().window(Parent_id30); 
	   
	   driver.navigate().back();	  	   

//TC_ID_115_check more info button of Gramin_Bhandaran_Yojana	   
	   
		  WebElement Gramin_Bhandaran_Yojana =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=4']"));
	      
		  Gramin_Bhandaran_Yojana.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_115_check more details button is workiing and open new tab with new page
		  
		  WebElement More_Info31 = driver.findElement(By.xpath("//a[@href='http://dmi.gov.in/Schemegby.aspx']"));
							        
		  More_Info31.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles31 = driver.getWindowHandles();
					      
	    Iterator it31 = handles31.iterator();
		
	   String Parent_id31 = (String) it31.next();
					      
	   String Child_Id31 = (String) it31.next();
						     
	   driver.switchTo().window(Child_Id31).close();
						      
	   driver.switchTo().window(Parent_id31); 
	   
	   driver.navigate().back();	   
	   
//TC_ID_116_check more info button of Pradhan_Mantri_Fasal_Bima_Yojana	   
	   
		  WebElement Pradhan_Mantri_Fasal_Bima_Yojana =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=3']"));
	      
		  Pradhan_Mantri_Fasal_Bima_Yojana.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
//TC_ID_116_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info32 = driver.findElement(By.xpath("//a[@href='https://pmfby.gov.in/']"));
							        
		  More_Info32.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles32 = driver.getWindowHandles();
					      
	    Iterator it32 = handles32.iterator();
		
	   String Parent_id32 = (String) it32.next();
					      
	   String Child_Id32 = (String) it32.next();
						     
	   driver.switchTo().window(Child_Id32).close();
						      
	   driver.switchTo().window(Parent_id32); 
	   
	   driver.navigate().back();	
	   
//TC_ID_117_check more info button of Integrated_Scheme_for_Agricultural_Marketing   
	   
		  WebElement Integrated_Scheme_for_Agricultural_Marketing =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=2']"));
	      
		  Integrated_Scheme_for_Agricultural_Marketing.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TC_ID_117_1_check more details button is workiing and open new tab with new page 
		  
		  WebElement More_Info33 = driver.findElement(By.xpath("//a[@href='http://dmi.gov.in/Schemeisam.aspx']"));
							        
		  More_Info33.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles33 = driver.getWindowHandles();
					      
	    Iterator it33 = handles33.iterator();
		
	   String Parent_id33 = (String) it33.next();
					      
	   String Child_Id33 = (String) it33.next();
						     
	   driver.switchTo().window(Child_Id33).close();
						      
	   driver.switchTo().window(Parent_id33); 
	   
	   driver.navigate().back();	
	   
//TC_ID_118_check more info button of Pradhan_Mantri_Krishi_Sinchai_Yojana   
	   
		  WebElement Pradhan_Mantri_Krishi_Sinchai_Yojana =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=2']"));
	      
		  Pradhan_Mantri_Krishi_Sinchai_Yojana.click();	
							     
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
//TC_ID_118_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info34 = driver.findElement(By.xpath("//a[@href='http://dmi.gov.in/Schemeisam.aspx']"));
							        
		  More_Info34.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles34 = driver.getWindowHandles();
					      
	    Iterator it34 = handles34.iterator();
		
	   String Parent_id34 = (String) it34.next();
					      
	   String Child_Id34 = (String) it34.next();
						     
	   driver.switchTo().window(Child_Id34).close();
						      
	   driver.switchTo().window(Parent_id34); 
	   
	   driver.navigate().back();	   
	   
	   
}	   	   
	   
	   
}
