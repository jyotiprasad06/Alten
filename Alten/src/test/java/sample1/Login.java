package sample1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	  static WebDriver driver;
	    static WebDriverWait wait;
	@Test
	
	public void logining() {  
	      
		
		// System Property for Chrome Driver 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Jenkins\\tools\\chromedriver\\chromedriver.exe");  
			          
		// Instantiate a ChromeDriver class.     
		WebDriver driver=new ChromeDriver();  
		 WebDriverWait wait = new WebDriverWait(driver, 40);
		
		// Launch Website  
	 driver.get("https://www.amazon.fr"); 		        
	 //Maximize the browser  
	driver.manage().window().maximize(); 
	// Click on the Search button  
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div/span")))).click();
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(" //*[@id=\"ap_email\"]")))).sendKeys("khalloufijamila8@gmail.com");
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"continue\"]")))).click();
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"ap_password\"] ")))).sendKeys("Jamila1234@");
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")))).click(); 

	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"continue\"]")))).click(); 
	// System.out.println("veuillez Entrer le code de verivication envoyé par message ");

	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"continue\"]")))).click(); 

	}




}
