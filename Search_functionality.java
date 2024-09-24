import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search_functionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setup the chromedriver
		WebDriverManager.chromedriver().setup();
		
		//create chromedriver oject
		ChromeDriver driver=new ChromeDriver();
		try {
		
		//Open web site
		driver.navigate().to("https://www.w3schools.com/");
		//maximize the website
		driver.manage().window().maximize();
		//check the search functionality button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.id("tnb-google-search-icon"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tnb-google-search-icon")));
		search.click();
		
		//Enter the search bar text
		
	
		//submit the search data
		WebElement searchtext=driver.findElement(By.cssSelector("input#tnb-google-search-input"));
		searchtext.sendKeys("Java Tutorial");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tnb-google-search-input")));
		WebElement searchbutton=driver.findElement(By.cssSelector("#tnb-google-search-input"));
		searchbutton.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#subtopnav > a.ga-nav.active")));

		WebElement firstresult=driver.findElement(By.cssSelector("#subtopnav > a.ga-nav.active"));
		
		if (firstresult.isDisplayed()) {
			System.out.println("Test Case is Passed:"+"Search result is found");
		}
		else {
			System.out.println("Test Case is Failes:"+"Search result is not found");
		}
		}
		catch (Exception e){
			System.out.println("Test Failed: "+ e.getMessage());
		}
		finally {
			driver.close();
		}
		
		
	}

}
