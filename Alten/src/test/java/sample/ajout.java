package sample;

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
    driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"RqamFcM39zjxdPIPn6B2xQ\"]/div[2]/a")));
}
}