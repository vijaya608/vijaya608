/**
 * 
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */
public class Logintext {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Step 1: Set up ChromeDriver using WebDriverManager
		//WebDriverManager to automatically download and set up the ChromeDriver binary that matches your installed version of Google Chrome.
		WebDriverManager.chromedriver().setup();
		
		//You can also configure WebDriverManager to use specific driver versions:
		//WebDriverManager.chromedriver().browserVersion("115.0").setup();

		
		//Step 2: Create an instance of ChromeDriver
		//This initializes the ChromeDriver instance, which opens the Chrome browser.
		ChromeDriver driver=new ChromeDriver();
		
		//Step 3: Open a website
		//This tells the browser to navigate to Git website.
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Print the page title to verify that page is loaded
		/*System.out.println("Page title is:"+ driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("contactvijaya1989@gmail.com");
		driver.findElement(By.xpath("/html//input[@id='email']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Signin
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div/a")).click();
		*/
		
		WebElement usernametxt=driver.findElement(By.id("login_field"));
		if(usernametxt.isDisplayed()) {
			if(usernametxt.isEnabled()) {
				usernametxt.sendKeys("vijaya21989");
				String enteredText=usernametxt.getAttribute("value");
				System.out.println(enteredText);
				usernametxt.clear();
			}
			else {
				System.err.println("username text box is not enabled");
				
			}
			
		}
		else {
			System.err.println("Username textbox is not displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//This closes the browser and ends the WebDriver session.
		driver.close();
	       
	    }
	}

