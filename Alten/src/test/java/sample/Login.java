package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
  
	@Test
	
	public void logining() {  
	      
		
		// System Property for Chrome Driver 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");  
			          
		// Instantiate a ChromeDriver class.     
		WebDriver driver=new ChromeDriver();  
		
		// Launch Website  
	 driver.get("https://www.amazon.fr"); 		        
	 //Maximize the browser  
	driver.manage().window().maximize(); 
	// Click on the Search button  
	driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]")).click();     
	//driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click(); 
	driver.findElement(By.xpath(" //*[@id=\"ap_email\"]")).sendKeys("khalloufijamila8@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click(); 
	driver.findElement(By.xpath("//*[@id=\"ap_password\"] ")).sendKeys("Jamila1234@");
	driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click(); 
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click(); 
	//Thread.sleep(3000);
	//driver.findElement(By.xpath(" //*[@id=\"cvf-page-content\"]/div/div/div[1]/form/div[2]/input")).sendKeys();
	//driver.findElement(By.xpath("//*[@id=\"dmF__4AiR_D-SHfWQBiL8w\"]/div[2]/a/div")).click(); 

	}




}
