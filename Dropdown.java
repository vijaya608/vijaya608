import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setup chromedriver using webdrivermanager
		WebDriverManager.chromedriver().setup();
		//Create an instance of a chromedriver
		ChromeDriver d=new ChromeDriver();
		//Open a website
		d.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		d.manage().window().maximize();
		//Locating the dropdown list
		WebElement courseElement=d.findElement(By.id("course"));
		Select courseNameDropDown=new Select(courseElement);
		
		//List of options
		List<WebElement> courseNameDropDownOptions=courseNameDropDown.getOptions();
		for (WebElement option:courseNameDropDownOptions) {
			System.out.println(option.getText());
		}
		courseNameDropDown.selectByIndex(1);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		courseNameDropDown.selectByValue("net");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		courseNameDropDown.selectByVisibleText("Javascript");
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("course")));
		
		String selectedText=courseNameDropDown.getFirstSelectedOption().getText();
		System.out.println("Selected visible text - " + selectedText);
	}

}
