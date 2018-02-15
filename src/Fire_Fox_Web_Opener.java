//import java.io.File;
//import com.jaunt.*;
//import com.jaunt.component.*;
//import java.io.*;
//import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.apache.http.util.Asserts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class Fire_Fox_Web_Opener {

	public void OpenFireFox()
	
	{

//--------------------------------------------------------------------------------------------------
        //****THIS PORTION IS SETTING THE PROPERTY AND BINARY OF GECKO DRIVER***
//-------------------------------------------------------------------------------------------------- 
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\AKirby\\Desktop\\selenium\\geckodriver.exe");
    FirefoxOptions options = new FirefoxOptions();
    options.setBinary("C:\\Users\\AKirby\\AppData\\Local\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine


//--------------------------------------------------------------------------------------------------
       //***THIS PORTION IS CREATING THE DRIVER/WAIT/BUILDER ELEMENTS***
//-------------------------------------------------------------------------------------------------- 
    
   
    WebDriver driver = new FirefoxDriver(options);
    WebDriverWait wait = new WebDriverWait(driver, 5);   // wait for 5 seconds
    Actions builder = new Actions(driver);
    
 
//--------------------------------------------------------------------------------------------------
     //***THIS PORTION IS THE INITAL LOGIN***
//-------------------------------------------------------------------------------------------------- 

    driver.get("https://measureqa.lennar.com/bi/");
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);   
    WebElement SignInButtonVisibleTest = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div/div[3]/div/button"));
    
    if (SignInButtonVisibleTest.isDisplayed())
    {
    	System.out.println("Sign In Button Visible");
    } 
    
//--------------------------------------------------------------------------------------------------
    //***THIS PORTION INSERTS THER USERNAME/PASSWORD/AND SELECTS SIGN-IN**
//--------------------------------------------------------------------------------------------------        
    WebElement username = driver.findElement(By.name("CAMUsername"));
    WebElement password = driver.findElement(By.name("CAMPassword"));
    WebElement SignInButton = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div/div[3]/div/button"));
  
    username.clear();username.sendKeys("Akirby");
    password.sendKeys("");
   
    if (SignInButton.isDisplayed())
    {
   	   SignInButton.click();
     	System.out.println("Sign In Button has been clicked");
    } 
    
//--------------------------------------------------------------------------------------------------
    //****THIS PORTION WILL CLICK THE "TEAM CONTENT BUTTON"***
//-------------------------------------------------------------------------------------------------- 
   
   
   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button[title='Team content']"))));
   WebElement TeamContentButton2 = driver.findElement(By.cssSelector("button[title='Team content']"));
     		  if (TeamContentButton2.isDisplayed())
    		    {
    		    	System.out.println("Team Content Button Exist");
    		    	TeamContentButton2.click();
    		    } 
     		  
     		  
//--------------------------------------------------------------------------------------------------
              //****THIS PORTION WILL CLICK THE "GAME OF HOMES LINK"***
//-------------------------------------------------------------------------------------------------- 

  
     wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("div[title='Game of Homes']"))));
     WebElement GameOfHomesButton = driver.findElement(By.cssSelector("div[title='Game of Homes']"));
     if (GameOfHomesButton.isDisplayed())
	    {
	    	System.out.println("Game of Homes Button Exist");
	    	GameOfHomesButton.click();
	    } 

     
//--------------------------------------------------------------------------------------------------
                    //****THIS PORTION WILL CLICK THE "CONSTRUCTION LINK"***
//--------------------------------------------------------------------------------------------------
     
     //WebElement ConstructionLink = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[2]/div[4]/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/div[1]/div"));
     //driver.findElement(ByClassName("nameColumnDiv contentListFocusable clickable active")); 	
     //WebElement ConstructionLink =  driver.findElement(ByClassName("nameColumnDiv contentListFocusable clickable active"));
     //WebElement ConstructionLink = driver.findElement(By.id("Construction"));
     WebElement ConstructionLink =  driver.findElement(By.className("nameColumnDiv contentListFocusable clickable active"));
     if (ConstructionLink.isDisplayed())
	    {
	    	System.out.println("Construction Link Exist");
	    	//builder.doubleClick(ConstructionLink).perform();
	
	    } 

          
//--------------------------------------------------------------------------------------------------
                       //****BELOW ARE FAILED ATTEMPTS AT FINDING ELEMENT IDS***
//--------------------------------------------------------------------------------------------------
     
     
     //assertion code  
     //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("div[title='Construction']"))));
     // WebElement ConstructionElement =  driver.findElement(By.cssSelector("div[title='Construction']"));
     //driver.findElement(By.cssSelector("div[title='Construction']")).click();
     //builder.doubleClick(ConstructionElement).perform();
     //driver.findElement(By.cssSelector("div[title='Construction']")).click();
     
     
     //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
     //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     //driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
     
     //driver.switchTo().frame(arg0)
     //WebElement GrandPaElement = driver.findElement(By.id("PRMT_SV_CONTAINER_N0xd6ba300x0x22b89398_NS_")); - failed
     //List<WebElement> allFormChildElements = driver.findElements(By.id("PRMT_SV_N0xdbf1c00x0x19faa398_NS_"));
     //WebElement GrandPaElement = driver.findElement(By.className("clsSelectControl pv")); -- will no work its not static
     //WebElement GrandPaElement = driver.findElement(By.className("mainViewerTable"));
     //WebElement GrandPaElement = driver.findElement(By.id("mainViewerTable_NS_"));
     //WebElement GrandPaElement = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("tb")))); //-- will no work its not static
     //WebElement GrandPaElement = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("mainViewerTable")))); //-- will no work its not static
     //WebElement GrandPaElement =  driver.findElement(By.cssSelector("div[class='q-div']"));
     //WebElement ParentElement = GrandPaElement.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div[2]"));
     //WebElement GrandPaElement =  driver.findElement(By.id("main"));;
     //WebElement ParentElement = GrandPaElement.findElement(By.name("i66254C9A1E164E8CB10D6A3A7AE02ECF")); //failed 
     //WebElement ChildElement = ParentElement.findElement(By.xpath("/html"));
     //System.out.println(DrpCity);
     //WebElement GrandpaElement = driver.findElement(By.xpath("/html/body"));
     //wait.until(ExpectedConditions.visibilityOf(GrandpaElement));
     //GrandpaElement.click();
     //DrpCity.selectByValue("AUS");
     // WebElement GrandpaElement = driver.findElement(By.xpath("//*[@id=\"mainViewerTable_NS_\"]"));
     //System.out.println(GrandpaElement.getText());
     //List<WebElement> allFormChildElements = driver.findElements(By.xpath("//*[@id=\"mainViewerTable_NS_\"]"));
     //WebElement GrandpaElement = driver.findElement(By.xpath("/html/body"));
     //wait.until(ExpectedConditions.visibilityOf(GrandpaElement));
     //GrandpaElement.click();
     //Select dropdown = new Select(driver.findElement(By.id("PRMT_SV_N0xdbf1c00x0x19faa398_NS_")));
     //List<WebElement> allFormChildElements = driver.findElements(By.id("PRMT_SV_N0xdbf1c00x0x19faa398_NS_"));
     //Select dropdown = new Select(driver.findElement(By.id("PRMT_SV_N0xdbf1c00x0x19faa398_NS_")));
     //System.out.println(allFormChildElements.toString());
     //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
     // driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[2]/div[2]/div[2]/iframe")));
     //WebElement GrandPaElement =  driver.findElement(By.name("/html/body/div/div[3]/div[2]/div[2]/div[2]/div[2]/iframe"));
     // System.out.println(GrandPaElement);
     //WebElement ParentElement = GrandPaElement.findElement(By.name("i66254C9A1E164E8CB10D6A3A7AE02ECF")); //failed 
     //WebElement ChildElement = ParentElement.findElement(By.xpath("/html"));
     //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
     //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     //driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
	

    //--------------------------------------------------------------------------------------------------  



  
	}


}
