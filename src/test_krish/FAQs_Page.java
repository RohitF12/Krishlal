package test_krish;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FAQs_Page {
	
	public static void main(String[]args) throws InterruptedException  {
		
		

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
		
	     	WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.krishlal.com/index.php");
	     	
	        driver.manage().window().maximize();    
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
//TC_ID_119_Check FAQ's page open properly	        
	        
	      WebElement FAQs =  driver.findElement(By.xpath("//a[@href='faq.php']"));
	        
	      FAQs.click();
	      
//TC_ID_120_check Who_we_are are clickable
	      
	      WebElement Who_we_are =  driver.findElement(By.xpath("//div[@data-target='#question14']"));
	        
	      Who_we_are.click();	
	      
	      Thread.sleep(5000);
	      
//TC_ID_121_check What_do_you_mean_by_KrishLal_Knowledge_base are clickable
	      
	      WebElement What_do_you_mean_by_KrishLal_Knowledge_base =  driver.findElement(By.xpath("//div[@data-target='#question15']"));
	        
	      What_do_you_mean_by_KrishLal_Knowledge_base.click();
	      
	      Thread.sleep(5000);
	      
//TC_ID_122_check Can_we_sell_rent_tools_and_equipment_for_agriculture_How are clickable
	      
	      WebElement Can_we_sell_rent_tools_and_equipment_for_agriculture_How =  driver.findElement(By.xpath("//div[@data-target='#question16']"));
	        
	      Can_we_sell_rent_tools_and_equipment_for_agriculture_How.click();
	      
	      Thread.sleep(5000);
	      

//TC_ID_123_check Are_you_providing_tools_and_equipment_on_rent_or_lease_for_agriculture_purpose are clickable
	      
	      WebElement  Are_you_providing_tools_and_equipment_on_rent_or_lease_for_agriculture_purpose =  driver.findElement(By.xpath("//div[@data-target='#question17']"));
	        
	      Are_you_providing_tools_and_equipment_on_rent_or_lease_for_agriculture_purpose.click();	      
	      
	      Thread.sleep(5000);
	      
//TC_ID_124_check How_mobile_apps_and_technologies_help_farmer are clickable
	      
	      WebElement  How_mobile_apps_and_technologies_help_farmer =  driver.findElement(By.xpath("//div[@data-target='#question18']"));
	        
	      How_mobile_apps_and_technologies_help_farmer.click();	      
	      
	      Thread.sleep(5000);
	      
//TC_ID_125_check Where_can_I_purchase_fertilizers_and_pesticides_How_do_I_select_the_right_ones are clickable
	      
	      WebElement  Where_can_I_purchase_fertilizers_and_pesticides_How_do_I_select_the_right_ones =  driver.findElement(By.xpath("//div[@data-target='#question19']"));
	        
	      Where_can_I_purchase_fertilizers_and_pesticides_How_do_I_select_the_right_ones.click();	 	      
	      
	      Thread.sleep(5000);
	      
	      
//TC_ID_126_check Why_do_we_need_cultivation are clickable
	      
	      WebElement  Why_do_we_need_cultivation =  driver.findElement(By.xpath("//div[@data-target='#question20']"));
	        
	      Why_do_we_need_cultivation.click();		
	      
	      Thread.sleep(5000);
	      
//What_is_fertilizer
	      
	      WebElement  What_is_fertilizer =  driver.findElement(By.xpath("//div[@data-target='#question21']"));
	        
	      What_is_fertilizer.click();	      
	      
	      Thread.sleep(5000);
	      
//TC_ID_127_check What_is_harvesting are clickable
	      
	      WebElement  What_is_harvesting =  driver.findElement(By.xpath("//div[@data-target='#question22']"));
	        
	      What_is_harvesting.click();      
	      
	      Thread.sleep(5000);
	      
//TC_ID_128_check What_is_sowing are clickable
	      
	      WebElement  What_is_sowing =  driver.findElement(By.xpath("//div[@data-target='#question23']"));
	        
	      What_is_sowing.click(); 
	      
	      Thread.sleep(5000);
	      
//TC_ID_129_check What_is_Irrigation are clickable
	      
	      WebElement  What_is_Irrigation =  driver.findElement(By.xpath("//div[@data-target='#question24']"));
	        
	      What_is_Irrigation.click(); 	      
	      
	      Thread.sleep(5000);
	      
	      What_is_Irrigation.click(); 
	      
	      driver.quit();

}}
