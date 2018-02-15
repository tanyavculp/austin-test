import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import com.jaunt.*;
import com.jaunt.component.*;
import java.io.*;

public class Chrome_Web_Opener {

	
	public void OpenChrome()
	
	{
	//this opens Chrome
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKirby\\Desktop\\selenium\\chromedriver.exe");
	WebDriver driver2 = new ChromeDriver();
    String appUrl = "https://accounts.google.com";
    driver2.get("https://measureqa.lennar.com/bi/");
   
    /*
  //--------------------------------------------------------------------------------------------------
  	//Start of OpenFireFox()
  		
  	System.setProperty("webdriver.gecko.driver", "C:\\Users\\AKirby\\Desktop\\selenium\\geckodriver.exe");
      
      FirefoxOptions options = new FirefoxOptions();
      options.setBinary("C:\\Users\\AKirby\\AppData\\Local\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine

      
      
      //--------------------------------------------------------------------------------------------------
      
      WebDriver driver = new FirefoxDriver(options);
      driver.get("https://measureqa.lennar.com/bi/");
      
      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
      
      System.out.println("Webpage Loaded");
      //--------------------------------------------------------------------------------------------------
      WebElement username = driver.findElement(By.name("CAMUsername"));
      WebElement password = driver.findElement(By.name("CAMPassword"));
      WebElement SignInButton = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div/div[3]/div/button"));
          
      username.clear();username.sendKeys("Akirby");
      password.sendKeys("Ahk4551531788!!!!");
      SignInButton.click();
      
      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
      
      System.out.println("Information Inserted and Button Clicked");
    //--------------------------------------------------------------------------------------------------
      
       
      WebElement TeamContentButtonClassName = driver.findElement(By.className("button labelled"));
      TeamContentButtonClassName.click();
      
            
       driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
       
       System.out.println("Selected Team Content");
    //--------------------------------------------------------------------------------------------------  

      
      // WebElement CrmImpactButton = driver.findElement(By.linkText("CRM Impact Dashboard"));
       //CrmImpactButton.click();
       
       

      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
      
      System.out.println("CRM Impact Selected");
      
    //--------------------------------------------------------------------------------------------------
      

     // driver.close();
     // driver.quit();
    
    
    
    */
    
	}
	
	
	
	
	
}
