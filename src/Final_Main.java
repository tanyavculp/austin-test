import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import com.jaunt.*;
import com.jaunt.component.*;
import java.io.*;

public class Final_Main {

	public static void main(String[] args) {
		
		Fire_Fox_Web_Opener Fire_Fox_Web_OpenerObject = new Fire_Fox_Web_Opener();
		Fire_Fox_Web_OpenerObject.OpenFireFox();
		System.out.println("Code Completed");
		
		//Chrome_Web_Opener Chrome_Web_Opener_OpenerObject = new Chrome_Web_Opener();
		//Chrome_Web_Opener_OpenerObject.OpenChrome();
		
		
		
		
	}

}
