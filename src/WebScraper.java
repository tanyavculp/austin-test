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


public class WebScraper {

	
	public void WebScraperCollect()
	
	{

		
		  try{
		      File file = new File("C:\\Users\\AKirby\\Desktop\\selenium\\test.txt");
		      FileWriter fileWriter = new FileWriter(file);
	      	  UserAgent userAgent = new UserAgent();                       //create new userAgent (headless browser).
	      	  userAgent.visit("http://jaunt-api.com/download.htm");                        //visit a url  
	      	  System.out.println(userAgent.doc.innerHTML());               //print the document as HTML
	      	  fileWriter.write(userAgent.doc.innerHTML());
	      	  fileWriter.flush();
			  fileWriter.close();
	        
	        }
	      	catch(JauntException e){         //if an HTTP/connection error occurs, handle JauntException.
	      	  System.err.println(e);
	      	  
	      	  
	      	} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
		
	}
	
	
	
	
	
}
