
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
		driver.getTitle();
		driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id='tnb-google-search-container']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
