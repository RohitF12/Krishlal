package test_krish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Govt_Schme_1 {
	
	public static void main(String[]args) throws InterruptedException  {
		

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
		
	     	WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.krishlal.com/index.php");
	     	
	        driver.manage().window().maximize();    
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
//TC_ID_81_Check the Government Scheme Page open properly	        
	        
	   WebElement Government_Scheme =  driver.findElement(By.xpath("//a[@href='governmentScheme.php']"));
	        
	   Government_Scheme.click();
	   
//TC_ID_82_check more info button of Rashtriya Gokul Mission 2023 
	     
	     WebElement Rashtriya_Gokul_Mission_2023 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=42']"));
	        
	     Rashtriya_Gokul_Mission_2023.click();	
	     
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
//TC_ID_82_1_check more details button is workiing and open new tab with new page	     
	     
	     WebElement More_Info01 = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/a"));
	        
	     More_Info01.click();
	     
	     Thread.sleep(10000);
	     
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
	     Set<String> handles01 = driver.getWindowHandles();
	      
	      Iterator it01 = handles01.iterator();
	 
	      String Parent_id01 = (String) it01.next();
	      
	      String Child_Id01 = (String) it01.next();
	     
	     driver.switchTo().window(Child_Id01).close();
	      
	      driver.switchTo().window(Parent_id01);
	      
	      driver.navigate().back();	 
	      
//TC_ID_83_check more info button of Agriculture Infrastructure Fund 
	      
	      WebElement Agriculture_Infrastructure_Fund =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=41']"));
	        
	      Agriculture_Infrastructure_Fund.click();	
	      
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      
	      
//TC_ID_83_1_check more details button is workiing and open new tab with new page
	      
		  WebElement More_Info = driver.findElement(By.xpath("//a[@href='https://www.drishtiias.com/hindi/loksabha-rajyasabha-discussions/agriculture-infrastructure-fund']"));
		        
		  More_Info.click();	
		  
		  Thread.sleep(10000);
		  
		  	      	      
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     
		      Set<String> handles = driver.getWindowHandles();
		      
		      Iterator it = handles.iterator();
		 
		      String Parent_id = (String) it.next();
		      
		      String Child_Id = (String) it.next();
		      		                 
		      driver.switchTo().window(Child_Id).close();
		      
		      driver.switchTo().window(Parent_id);
		      
		      driver.navigate().back();	  
		      
		      
//TC_ID_84_check more info button of National Horticulture Mission 
		      
			   WebElement National_Horticulture_Mission = driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=40']"));

			   National_Horticulture_Mission.click();
			   
			   driver.navigate().back();
			   
		      
//TC_ID_85_check more info button of किसान_ट्रैक्टर_योजना_2023       
		     
			   WebElement किसान_ट्रैक्टर_योजना_2023 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=39']"));
		        
			    किसान_ट्रैक्टर_योजना_2023.click();
			    
			    Thread.sleep(10000);
		      
			    driver.navigate().back();
			    		    
	      
	      
//TC_ID_86_check more info button of Rashtriya Krishi Vikas Yojana
		     
		     WebElement Rashtriya_Krishi_Vikas_Yojana =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=38']"));
		        
		     Rashtriya_Krishi_Vikas_Yojana.click();	
		     
		     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		     
//TC_ID_86_1_check more details button is workiing and open new tab with new page		     
		     
		     WebElement More_Info1 = driver.findElement(By.xpath("//a[@href='https://byjus.com/ias-hindi/rkvy-raftaar-in-hindi/']"));
		        
		     More_Info1.click();
		     
		     Thread.sleep(10000);
		     
		     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      
		     Set<String> handles1 = driver.getWindowHandles();
		      
		      Iterator it1 = handles1.iterator();
		 
		      String Parent_id1 = (String) it1.next();
		      
		      String Child_Id1 = (String) it1.next();
		     
		     driver.switchTo().window(Child_Id1).close();
		      
		      driver.switchTo().window(Parent_id1);
		      
		      driver.navigate().back();
	             
	      
//TC_ID_87_check more info button of Livestock_Insurance_Scheme
		      
			     WebElement Livestock_Insurance_Scheme =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=37']"));
				        
			     Livestock_Insurance_Scheme.click();	
				     
			     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				    
			     
//TC_ID_87_1_check more details button is working and open new tab with new page
			     
			     WebElement More_Info2 = driver.findElement(By.xpath("//a[@href='https://dahd.nic.in/related-links/livestock-insurance']"));
				        
			     More_Info2.click();
	      
			     Thread.sleep(10000);
			     
			     Set<String> handles2 = driver.getWindowHandles();
			      
			      Iterator it2 = handles2.iterator();
			 
			      String Parent_id2 = (String) it2.next();
			      
			      String Child_Id2 = (String) it2.next();
			     
			     driver.switchTo().window(Child_Id2).close();
			      
			      driver.switchTo().window(Parent_id2);
			      
			      driver.navigate().back();
			      
	      
//TC_ID_88_check more info button of मधुमक्खी पालन नीति-2021
	      
			      WebElement मधुमक्खी_पालन_नीति_2021 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=36']"));
			        
			      मधुमक्खी_पालन_नीति_2021.click();	
					     
			     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					     
//TC_ID_88_1_check more details button is workiing and open new tab with new page
			     
			     WebElement More_Info3 = driver.findElement(By.xpath("//a[@href='https://kisansamadhan.com/government-launched-a-new-scheme-to-encourage-farmers-to-take-up-beekeeping/']"));
					        
			     More_Info3.click();
			     
			     Thread.sleep(10000);
		      
			     Set<String> handles3 = driver.getWindowHandles();
				      
			     Iterator it3 = handles3.iterator();
			 
     		      String Parent_id3 = (String) it3.next();
				      
				  String Child_Id3 = (String) it3.next();
				     
				  driver.switchTo().window(Child_Id3).close();
				      
				  driver.switchTo().window(Parent_id3);
				      
				  driver.navigate().back();
				      
				      
	      
//TC_ID_89_check more info button of पाईप_लाईन_विद्युत_पंप
				      
		WebElement पाईप_लाईन_विद्युत_पंप =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=35']"));
				        
		पाईप_लाईन_विद्युत_पंप.click();	
						     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  driver.navigate().back();	
						     

//TC_ID_90_check more info button of Rप्याज_भंडार_गृह			      
				      
				      
		  WebElement प्याज_भंडार_गृह =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=34']"));
	        
		  प्याज_भंडार_गृह.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
//TC_ID_90_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info5 = driver.findElement(By.xpath("//a[@href='https://kisansamadhan.com/apply-for-construction-of-onion-warehouse-on-subsidy/']"));
							        
		  More_Info5.click();
		  
		  Thread.sleep(10000);
			 		 		      
		  Set<String> handles5 = driver.getWindowHandles();
						      
		  Iterator it5 = handles5.iterator();
					 
		  String Parent_id5 = (String) it5.next();
						      
		  String Child_Id5 = (String) it5.next();
						     
		  driver.switchTo().window(Child_Id5).close();
						      
		  driver.switchTo().window(Parent_id5); 
			      
		  driver.navigate().back();							      
				      
				      
//TC_ID_91_check more info button of Kusum_Component_A_Scheme 	      
	      
	      
		  WebElement Kusum_Component_A_Scheme =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=33']"));
	        
		  Kusum_Component_A_Scheme.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
//TC_ID_91_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info6 = driver.findElement(By.xpath("//a[@href='https://hindi.krishijagran.com/government-scheme/kusum-scheme-how-to-online-apply-in-kusum-component-a-scheme/']"));
							        
		  More_Info6.click();
		  
		  Thread.sleep(10000);
			 		 		      
		  Set<String> handles6 = driver.getWindowHandles();
					      
	      Iterator it6 = handles6.iterator();
		
	     String Parent_id6 = (String) it6.next();
					      
	     String Child_Id6 = (String) it6.next();
						     
	     driver.switchTo().window(Child_Id6).close();
						      
	     driver.switchTo().window(Parent_id6); 
	     
	     driver.navigate().back();	
	     
				      			      
//TC_ID_92_check more info button of Animal_Husbandry_Infrastructure_Developement	      
	      
	      
		  WebElement Animal_Husbandry_Infrastructure_Developement =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=32']"));
	        
		  Animal_Husbandry_Infrastructure_Developement.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//TC_ID_92_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info7 = driver.findElement(By.xpath("//a[@href='https://hindi.krishijagran.com/government-scheme/ahidf-is-giving-loan-to-livestock-owners-know-the-process-of-applying/']"));
							        
		  More_Info7.click();
		  
		  Thread.sleep(10000);
			 		 		      
		  Set<String> handles7 = driver.getWindowHandles();
					      
	      Iterator it7 = handles7.iterator();
		
	     String Parent_id7 = (String) it7.next();
					      
	     String Child_Id7 = (String) it7.next();
						     
	     driver.switchTo().window(Child_Id7).close();
						      
	     driver.switchTo().window(Parent_id7); 
	     
	     driver.navigate().back();					
	     
	     
				      
//TC_ID_93_check more info button of Pashu_Credit_Card	      
	      
	      
		  WebElement Pashu_Credit_Card =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=31']"));
	        
		  Pashu_Credit_Card.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
//TC_ID_93_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info8 = driver.findElement(By.xpath("//a[@href='https://hindi.krishijagran.com/government-scheme/government-is-giving-loan-of-rs-3-lakh-on-animal-husbandry-apply-soon/']"));
							        
		  More_Info8.click();
		  
		  Thread.sleep(10000);
			 		 		      
		  Set<String> handles8 = driver.getWindowHandles();
					      
	      Iterator it8 = handles8.iterator();
		
	     String Parent_id8 = (String) it8.next();
					      
	     String Child_Id8 = (String) it8.next();
						     
	     driver.switchTo().window(Child_Id8).close();
						      
	     driver.switchTo().window(Parent_id8); 
	     
	     driver.navigate().back();					      
				      
				      
//TC_ID_94_check more info button of अनुदान_पर_गौशाला_निर्माण	      
	      
	      
		  WebElement अनुदान_पर_गौशाला_निर्माण =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=30']"));
	        
		  अनुदान_पर_गौशाला_निर्माण.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//TC_ID_94_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info9 = driver.findElement(By.xpath("//a[@href='https://kisansamadhan.com/a-grant-of-rs-10-lakh-is-being-given-on-the-construction-of-gaushala/']"));
							        
		  More_Info9.click();
		  
		  Thread.sleep(10000);
			 		 		      
		  Set<String> handles9 = driver.getWindowHandles();
					      
	      Iterator it9 = handles9.iterator();
		
	     String Parent_id9 = (String) it9.next();
					      
	     String Child_Id9 = (String) it9.next();
						     
	     driver.switchTo().window(Child_Id9).close();
						      
	     driver.switchTo().window(Parent_id9); 
	     
	     driver.navigate().back();					      
				      				      
				      
//TC_ID_95_check more info button ofअनुदानपर_पाली_हॉउस 				      
	     
				      
		  WebElement अनुदानपर_पाली_हॉउस =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=29']"));
	        
		  अनुदानपर_पाली_हॉउस.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
//TC_ID_95_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info10 = driver.findElement(By.xpath("//a[@href='https://kisansamadhan.com/apply-for-subsidy-on-green-house-shed-net-house-plastic-mulching-and-pack-house/']"));
							        
		  More_Info10.click();
		  
		  Thread.sleep(10000);
			 		 		      
		  Set<String> handles10 = driver.getWindowHandles();
					      
	      Iterator it10 = handles10.iterator();
		
	     String Parent_id10 = (String) it10.next();
					      
	     String Child_Id10 = (String) it10.next();
						     
	     driver.switchTo().window(Child_Id10).close();
						      
	     driver.switchTo().window(Parent_id10); 
	     
	     driver.navigate().back();					      
				      
//TC_ID_96_check more info button of नए_बाग_लगाने_पर_सब्सिडी 
	     
		  WebElement नए_बाग_लगाने_पर_सब्सिडी =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=28']"));
	        
		  नए_बाग_लगाने_पर_सब्सिडी.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//TC_ID_96_1_check more details button is workiing and open new tab with new page  
		  
		  WebElement More_Info11 = driver.findElement(By.xpath("//a[@href='https://hindi.krishijagran.com/government-scheme/haryana-government-will-give-50-percent-subsidy-on-planting-orchard/']"));
							        
		  More_Info11.click();
		  
		  Thread.sleep(10000);
			 		 		      
		  Set<String> handles11 = driver.getWindowHandles();
					      
	      Iterator it11 = handles11.iterator();
		
	     String Parent_id11 = (String) it11.next();
					      
	     String Child_Id11 = (String) it11.next();
						     
	     driver.switchTo().window(Child_Id11).close();
						      
	     driver.switchTo().window(Parent_id11); 
	     
	     driver.navigate().back();	     
				      
//TC_ID_97_check more info button of मत्स्य_विकास_पुरस्कार_योजना
	     
		  WebElement मत्स्य_विकास_पुरस्कार_योजना	 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=27']"));
	        
		  मत्स्य_विकास_पुरस्कार_योजना.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//TC_ID_97_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info12 = driver.findElement(By.xpath("//a[@href='https://hindi.krishijagran.com/government-scheme/complete-information-about-matsya-vikas-puraskar-yojana-of-chhattisgarh-government/']"));
							        
		  More_Info12.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles12 = driver.getWindowHandles();
					      
	      Iterator it12 = handles12.iterator();
		
	     String Parent_id12 = (String) it12.next();
					      
	     String Child_Id12 = (String) it12.next();
						     
	     driver.switchTo().window(Child_Id12).close();
						      
	     driver.switchTo().window(Parent_id12); 
	     
	     driver.navigate().back();	 	
	     
//TC_ID_98_check more info button of फसल_अवशेषों_के_प्रबंधन 	
	     
		  WebElement फसल_अवशेषों_के_प्रबंधन	 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=26']"));
	        
		  फसल_अवशेषों_के_प्रबंधन.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//TC_ID_98_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info13 = driver.findElement(By.xpath("//a[@href='https://agrimachinery.nic.in/Files/Guidelines/CRM.pdf']"));
							        
		  More_Info13.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles13 = driver.getWindowHandles();
					      
	      Iterator it13 = handles13.iterator();
		
	     String Parent_id13 = (String) it13.next();
					      
	     String Child_Id13 = (String) it13.next();
						     
	     driver.switchTo().window(Child_Id13).close();
						      
	     driver.switchTo().window(Parent_id13); 
	     
	     driver.navigate().back();	 	     
	     
//TC_ID_99_check more info button of Beej_Anudan_Avedan_Yojana     
	     
		  WebElement Beej_Anudan_Avedan_Yojana	 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=25']"));
	        
		  Beej_Anudan_Avedan_Yojana.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
//TC_ID_99_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info14 = driver.findElement(By.xpath("//a[@href='http://brbn.bihar.gov.in/']"));
							        
		  More_Info14.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles14 = driver.getWindowHandles();
					      
	      Iterator it14 = handles14.iterator();
		
	     String Parent_id14 = (String) it14.next();
					      
	     String Child_Id14 = (String) it14.next();
						     
	     driver.switchTo().window(Child_Id14).close();
						      
	     driver.switchTo().window(Parent_id14); 
	     
	     driver.navigate().back();	     

//TC_ID_100_check more info button of Goat_Farming     
	     
		  WebElement Goat_Farming	 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=24']"));
	        
		  Goat_Farming.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//TC_ID_100_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info15 = driver.findElement(By.xpath("//a[@href='https://hindi.krishijagran.com/news/goat-farming-90-subsidy-on-goat-farming-and-artificial-insemination/']"));
							        
		  More_Info15.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles15 = driver.getWindowHandles();
					      
	      Iterator it15 = handles15.iterator();
		
	     String Parent_id15 = (String) it15.next();
					      
	     String Child_Id15 = (String) it15.next();
						     
	     driver.switchTo().window(Child_Id15).close();
						      
	     driver.switchTo().window(Parent_id15); 
	     
	     driver.navigate().back();	    	     
	     
	     
 //TC_ID_101_check more info button of Farm_Machinery_Bank_scheme    
	     
		  WebElement Farm_Machinery_Bank_scheme	 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=23']"));
	        
		  Goat_Farming.click();	

//TC_ID_101_1_check more details button is workiing and open new tab with new page		  
		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			   					     
		  WebElement More_Info17 = driver.findElement(By.xpath("//a[@href='https://hindi.krishijagran.com/government-scheme/under-farm-machinery-bank-up-to-80-percent-subsidy-is-being-given-on-agricultural-machinery/']"));
							        
		  More_Info17.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles17 = driver.getWindowHandles();
					      
	      Iterator it17 = handles17.iterator();
		
	     String Parent_id17 = (String) it17.next();
					      
	     String Child_Id17 = (String) it17.next();
						     
	     driver.switchTo().window(Child_Id17).close();
						      
	     driver.switchTo().window(Parent_id17); 
	     
	     driver.navigate().back();	     
	     
	     
//TC_ID_102_check more info button of Scheme_for_the_establishment_of_Hi_Tech
	     
		  WebElement Scheme_for_the_establishment_of_Hi_Tech =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=18']"));
	        
		  Scheme_for_the_establishment_of_Hi_Tech.click();	
							     
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//TC_ID_102_1_check more details button is workiing and open new tab with new page		  
		  
		  WebElement More_Info18 = driver.findElement(By.xpath("//a[@href='http://pashudhanharyana.gov.in/schemes']"));
							        
		  More_Info18.click();
		  
		  Thread.sleep(10000);
		  		 		 		      
		  Set<String> handles18 = driver.getWindowHandles();
					      
	      Iterator it18 = handles18.iterator();
		
	     String Parent_id18 = (String) it18.next();
					      
	     String Child_Id18 = (String) it18.next();
						     
	     driver.switchTo().window(Child_Id18).close();
						      
	     driver.switchTo().window(Parent_id18); 
	     
	     driver.navigate().back();		     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
}
}