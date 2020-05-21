package sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ajout {
	@Test
	public void Adding() {
		// System Property for Chrome Driver 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
		WebDriver driver=new ChromeDriver();  
		// Launch Website  		        
	   //Maximize the browser  
	    driver.manage().window().maximize(); 
	    driver.get("https://www.amazon.fr");
   
	  //Get the Window Handle
	    String mainWindow = driver.getWindowHandle();
	    //To click on Element
	    driver.findElement(By.xpath("//div/h2[contains(.,'Apprendre � coder gratuitement')]/../following-sibling::div[1]/a")).click();
	    //TO Switch to Window
	    Set<String> windowHndls = driver.getWindowHandles();
	    for(String hndl : windowHndls){
	    String WindowURL = driver.switchTo().window(hndl).getCurrentUrl();
	    if(WindowURL.equalsIgnoreCase("https://www.code-decode.net/code-amazon")){
	    break;
	    }
	    }
}
	}