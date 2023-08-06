package test_krish;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Page {
	
	public static void main(String[]args) throws InterruptedException {
			
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
	
     	WebDriver driver = new ChromeDriver();
	
        driver.get("https://www.krishlal.com/index.php");

        driver.manage().window().maximize();
        
//TC_ID_01_Check krishlal logo is display 
        
        boolean Logo = driver.findElement(By.xpath("//img[@src='assets/uploads/logo.png']")).isDisplayed();
                
        System.out.println("Display logo = " + Logo);
        
//TC_ID_02_check search field is enable or not        
        
        boolean searchbox = driver.findElement(By.xpath("//input[@id='search-box1']")).isDisplayed();
        
        boolean searchbox1 = driver.findElement(By.xpath("//input[@id='search-box1']")).isEnabled();
        
        System.out.println("Display searchbox = " + searchbox);
        
        System.out.println("searchbox enable = " + searchbox1);
        

//TC_ID_03_ check search button is enable or not  
        
        boolean Buttondisplay = driver.findElement(By.xpath("//input[@id='search-box1']")).isDisplayed();
        
        boolean Buttonenable = driver.findElement(By.xpath("//input[@id='search-box1']")).isEnabled();
        
        System.out.println("Display search button = " + Buttondisplay);
        
        System.out.println("Enable search button = " + Buttonenable);
        
//TC_ID_04_Enter the value and search any text to check its working
        
        driver.findElement(By.xpath("//input[@id='search-box1']")).sendKeys("Test");
        
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        
//TC_ID_05_check Cowin Logo is enable or not         
        
        boolean Cowin_Logo = driver.findElement(By.xpath("//img[@src='assets/img/covidlogo.jpg']")).isDisplayed();
        
        System.out.println("Display Cowin_Logo = " + Cowin_Logo);
        
        WebElement click_here_to_register = driver.findElement(By.xpath("//img[@src='assets/img/covidlogo.jpg']"));
        
        click_here_to_register.click();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
	      Set<String> handles = driver.getWindowHandles();
	      
	      Iterator it = handles.iterator();
	 
	      String Parent_id = (String) it.next();
	      
	      String Child_Id = (String) it.next();
	      		                 
	      driver.switchTo().window(Child_Id).close();
	      
	      driver.switchTo().window(Parent_id);
	      
	      driver.navigate().back();
                

//TC_ID_06_ To check all pages tab is working      
        
 //open Home page
              
        WebElement Name = driver.findElement(By.xpath("//a[@href='index.php']"));
                     
        Name.click();
        
        Thread.sleep(5000);
                         
 //About us page open
        
        driver.findElement(By.xpath("//a[@href='about.php']")).click();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
 //Service
        driver.findElement(By.xpath("//a[@href='product-category.php?id=1&type=top-category']")).click();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
//Product
        driver.findElement(By.xpath("//a[@href='product-category.php?id=2&type=top-category']")).click();    
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
 //Government Scheme
        
        driver.findElement(By.xpath("//a[@href='governmentScheme.php']")).click();   
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
// FAQs
        
        driver.findElement(By.xpath("//a[@href='faq.php']")).click();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
// Contact Us
        
        driver.findElement(By.xpath("//a[@href='contact.php']")).click();
        
        Thread.sleep(10000);
        
// Mandi Rate
//        
//          WebElement MR =  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/ul/li[8]/a"));
//        
//	      MR.click(); 
//	      
//	      Thread.sleep(30000);
        
// Login Page
        
        driver.findElement(By.xpath("//a[@href='login.php']")).click();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      

        
//Home_page       
        driver.findElement(By.xpath("//a[@href='index.php']")).click();
        
        
 //TC_ID_07_check < > buttons are working   
        
        driver.findElement(By.xpath("//a[@data-slide='prev']")).click();
        
        Thread.sleep(2000);   
        
       driver.findElement(By.xpath("//a[@data-slide='next']")).click();
        
       Thread.sleep(2000);       
        
//TC_ID_08_check download now button is working
       
       driver.findElement(By.xpath("//*[@id=\"bootstrap-touch-slider\"]/ol/li[1]")).click();
       
       Thread.sleep(3000); 
       
       driver.findElement(By.xpath("//*[@id=\"bootstrap-touch-slider\"]/div/div[1]/div/div/div[1]/a")).click();
       
       Thread.sleep(15000); 
       
      driver.navigate().back();
          
       
//TC_ID_13_welcome to krishlal read more button working or not
        
        driver.findElement(By.xpath("//a[@href='about.php']")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//a[@href='https://krishlal.com/']")).click();
        
        Thread.sleep(7000);
        
	      Set<String> handles01 = driver.getWindowHandles();
	      
	      Iterator it01 = handles01.iterator();
	 
	      String Parent_id01 = (String) it01.next();
	      
	      String Child_Id01 = (String) it01.next();
	      		                 
	      driver.switchTo().window(Child_Id01).close();
	      
	      driver.switchTo().window(Parent_id01);
	      
	      driver.navigate().back();
             
//TC_ID_14_Check Top product( > <)button  working fine       
        
        
        JavascriptExecutor scrolls = (JavascriptExecutor)driver;
        
        scrolls.executeScript("window, scrollBy(0,2000)");
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
        
        driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/div[2]/div[1]/div[1]")).click();
        
        driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/div[2]/div[1]/div[2]")).click();
        
        
//TC_ID_15_Check Top services( > <)button  working fine       
   
   
   JavascriptExecutor scrolls1 = (JavascriptExecutor)driver;
   
   scrolls1.executeScript("window, scrollBy(0,2000)");
   
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
   
   driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/div/div/div[2]/div[1]/div[1]")).click();
   
   driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/div/div/div[2]/div[1]/div[2]")).click();
          

 //TC_ID_16_<> button should working properly in Testimonial section       
   
   
   JavascriptExecutor scrolls2 = (JavascriptExecutor)driver;
   
   scrolls2.executeScript("window, scrollBy(0,2000)");
   
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
   
   driver.findElement(By.xpath("/html/body/section[1]/div/div[2]/div/div/div[2]/div[1]/div[1]")).click();
   
   driver.findElement(By.xpath("/html/body/section[1]/div/div[2]/div/div/div[2]/div[1]/div[2]")).click();        
        

 //TC_ID_17_click privacy policy link is working or not
   
   driver.findElement(By.xpath("//a[@href='privacypolicy.php']")).click();
   
   Thread.sleep(10000);
   
 
   
                //TC_ID_17_1_krishlal link will be working
   
   driver.findElement(By.xpath("/html/body/div[6]/div/div/div/p[1]/a[1]")).click();
   
   Thread.sleep(10000);
   
   Set<String> handles1 = driver.getWindowHandles();
   
   Iterator it1 = handles1.iterator();

   String Parent_id1 = (String) it1.next();
   
   String Child_Id1 = (String) it1.next();
   		                 
   driver.switchTo().window(Child_Id1).close();
   
   driver.switchTo().window(Parent_id1);
   
   
   
           //TC_ID_17_2_By email link should be working
   
   driver.findElement(By.xpath("/html/body/div[6]/div/div/div/p[1]/a[1]")).click();

   Thread.sleep(10000);

   Set<String> handles2 = driver.getWindowHandles();

   Iterator it2 = handles2.iterator();

   String Parent_id2 = (String) it2.next();

  String Child_Id2 = (String) it2.next();
               
  driver.switchTo().window(Child_Id2).close();

  driver.switchTo().window(Parent_id2);



          //TC_ID_17_3_Reyanarth link will be working
  
  driver.findElement(By.xpath("/html/body/div[6]/div/div/div/p[1]/a[1]")).click();

  Thread.sleep(10000);

  Set<String> handles3 = driver.getWindowHandles();

  Iterator it3 = handles3.iterator();

  String Parent_id3 = (String) it3.next();

 String Child_Id3 = (String) it3.next();
              
 driver.switchTo().window(Child_Id3).close();

 driver.switchTo().window(Parent_id3);

 driver.navigate().back();   
   
  

//TC_ID_18_click Term and condition link is working or not
   
      driver.findElement(By.xpath("//a[@href='terms.php']")).click();
   
      Thread.sleep(10000);
   
             //TC_ID_18_1_check krishlal link should be working
   
      driver.findElement(By.xpath("//a[@href='https://www.krishlal.com/']")).click();
   
      Thread.sleep(10000);
   
      Set<String> handles4 = driver.getWindowHandles();

     Iterator it4 = handles4.iterator();

     String Parent_id4 = (String) it4.next();

     String Child_Id4 = (String) it4.next();
               
     driver.switchTo().window(Child_Id4).close();

     driver.switchTo().window(Parent_id4);


  
  
  //TC_ID_18_2_check privacy notice link should be working
  
    driver.findElement(By.xpath("//a[@href='https://www.krishlal.com/privacypolicy.php']")).click();

     Thread.sleep(10000);

    Set<String> handles5 = driver.getWindowHandles();

    Iterator it5 = handles5.iterator();

    String Parent_id5 = (String) it5.next();

   String Child_Id5 = (String) it5.next();
    
   driver.switchTo().window(Child_Id5).close();

   driver.switchTo().window(Parent_id5);
    
   
   //TC_ID_19_check working policy link should be working
   
   driver.findElement(By.xpath("//a[@href='https://www.krishlal.com/workingpolicy.php']")).click();

   Thread.sleep(10000);

   Set<String> handles6 = driver.getWindowHandles();

   Iterator it6 = handles6.iterator();

   String Parent_id6 = (String) it6.next();

   String Child_Id6 = (String) it6.next();
    
   driver.switchTo().window(Child_Id6).close();

   driver.switchTo().window(Parent_id6);
    
   driver.navigate().back();
    
   
   //click our services link is working or not
   
   driver.findElement(By.xpath("//a[@href='service.php']")).click();
   
   Thread.sleep(10000);
   
   
          
   //TC_ID_19_1_check Krishlal Reyan link should be working
   
   driver.findElement(By.xpath("//a[@href='http://krishlal.reyan.co.in/']")).click();

   Thread.sleep(10000);

   Set<String> handles7 = driver.getWindowHandles();

   Iterator it7 = handles7.iterator();

   String Parent_id7 = (String) it7.next();

   String Child_Id7 = (String) it7.next();
    
   driver.switchTo().window(Child_Id7).close();

   driver.switchTo().window(Parent_id7);
    
   
   
   
   //TC_ID_19_2_check krishlal mobile app link should be working
   
   driver.findElement(By.xpath("//a[@href='https://play.google.com/store/apps/details?id=com.rcs.krishlal&hl=en']")).click();

   Thread.sleep(10000);

   Set<String> handles8 = driver.getWindowHandles();

   Iterator it8 = handles8.iterator();

   String Parent_id8 = (String) it8.next();

   String Child_Id8 = (String) it8.next();
    
   driver.switchTo().window(Child_Id8).close();

   driver.switchTo().window(Parent_id8);
    
   driver.navigate().back();
    
  
   //TC_ID_20_check what is irrigation link should be working
   
   driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div/ul/li[1]/a")).click();

   Thread.sleep(10000);

   driver.navigate().back();
  
   
   //TC_ID_21_check what is sowing link should be working
   
   driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div/ul/li[2]/a")).click();

   Thread.sleep(10000);

   driver.navigate().back();  
   
   
   //TC_ID_22_check what is harvesting link should be working
   
   driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div/ul/li[3]/a")).click();
   
   Thread.sleep(10000);

   driver.navigate().back();
   
  
   //TC_ID_23_Facebook icon link should be working
   
   driver.findElement(By.xpath("//a[@href='https://www.facebook.com/reyanarth']")).click();
   
   Thread.sleep(10000);

   driver.navigate().back();
   
   Set<String> handles9 = driver.getWindowHandles();

   Iterator it9 = handles9.iterator();

   String Parent_id9 = (String) it9.next();

   String Child_Id9 = (String) it9.next();
    
   driver.switchTo().window(Child_Id9).close();

   driver.switchTo().window(Parent_id9);
   
   
  //TC_ID_24_Twitter icon link should be working
   
   driver.findElement(By.xpath("//a[@href='https://twitter.com/KrishLal2']")).click();
   
   Thread.sleep(10000);

   driver.navigate().back();
   
   Set<String> handles10 = driver.getWindowHandles();

   Iterator it10 = handles10.iterator();

   String Parent_id10 = (String) it10.next();

   String Child_Id10 = (String) it10.next();
    
   driver.switchTo().window(Child_Id10).close();

   driver.switchTo().window(Parent_id10);
   
   
  //TC_ID_25_Linkedin icon link should be working
   
   driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/in/krishlal-krishlal-360291184/']")).click();
   
   Thread.sleep(10000);

   driver.navigate().back();
   
   Set<String> handles11 = driver.getWindowHandles();

   Iterator it11 = handles11.iterator();

   String Parent_id11 = (String) it11.next();

   String Child_Id11 = (String) it11.next();
    
   driver.switchTo().window(Child_Id11).close();

   driver.switchTo().window(Parent_id11);
   
   
  //TC_ID_26_YouTube icon link should be working
   
   driver.findElement(By.xpath("//a[@href='https://www.youtube.com/channel/UCHWNRTRv2vrznwIxWdbM-4Q']")).click();
   
   Thread.sleep(10000);

  
   
   Set<String> handles12 = driver.getWindowHandles();

   Iterator it12 = handles12.iterator();

   String Parent_id12 = (String) it12.next();

   String Child_Id12 = (String) it12.next();
    
   driver.switchTo().window(Child_Id12).close();

   driver.switchTo().window(Parent_id12);
   
   
  //TC_ID_27_Whats app icon link should be working
   
   driver.findElement(By.xpath("//a[@href='https://api.whatsapp.com/send?phone=+919671731990']")).click();
   
   Thread.sleep(10000);

   
   Set<String> handles13 = driver.getWindowHandles();

   Iterator it13 = handles13.iterator();

   String Parent_id13 = (String) it13.next();

   String Child_Id13 = (String) it13.next();
    
   driver.switchTo().window(Child_Id13).close();

   driver.switchTo().window(Parent_id13);
   
   
   //TC_ID_28_Get on play store
    
   
  driver.findElement(By.xpath("/html/body/div[11]/div/div/div[5]/a/img")).click();
   
   Thread.sleep(10000);


   
   Set<String> handles14 = driver.getWindowHandles();

   Iterator it14 = handles14.iterator();

   String Parent_id14 = (String) it14.next();

   String Child_Id14 = (String) it14.next();
    
   driver.switchTo().window(Child_Id14).close();

   driver.switchTo().window(Parent_id14);
        


//messenger       
      
   Thread.sleep(10000);
        
      driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div/div/div/div")).click();
      
      Thread.sleep(10000);
      
    
      // start chat
      
      driver.findElement(By.xpath("//*[@id=\"u_0_0_/R\"]/div/div/div/div/div[1]/div/div[5]/div/div/div/span")).click();
      
      Thread.sleep(10000);
      
      //continue as guest
      
    
      
      driver.findElement(By.xpath("//*[@id=\"u_0_0_/R\"]/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]")).click();
      
      Thread.sleep(10000);
      
      //send messge
      
      driver.findElement(By.xpath("//*[@id=\"u_0_0_/R\"]/div/div/div/div[3]/div/div/div[1]/label/input")).sendKeys("Hello");
      
      Thread.sleep(10000);
      
      //send button
      
      driver.findElement(By.xpath("//*[@id=\"u_0_0_/R\"]/div/div/div/div[3]/div/div/div[2]/div/svg/g/g/g/g/path")).click();      
        
        driver.quit();
      
        }
	
}