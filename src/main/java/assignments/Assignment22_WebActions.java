package assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment22_WebActions {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1.Launch Chrome Browser  
		driver = new ChromeDriver();
		
		//2.Maximize the browser window    
		driver.manage().window().maximize();
		
		//3.Launch the application  ( https://demoqa.com/alerts ) 
		driver.get("https://demoqa.com/alerts");
		
		//4.Locate Alert buttons   
		WebElement e1 = FindAlertButton("timerAlertButton");
		
		//5.Launch Information alert 
		e1.click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.alertIsPresent());
		
		
		//6.Print Alert message 
		Alert Alert1 = driver.switchTo().alert();
		System.out.println("Alert 1 text: " + Alert1.getText());
       
        
		//7.Click on OK button  
		Alert1.accept();
		
		//8.Launch confirmation alert
		WebElement e2 = FindAlertButton("confirmButton");
		e2.click();
		wait1.until(ExpectedConditions.alertIsPresent());
        
		//9.Print Alert message  
		Alert Alert2 = driver.switchTo().alert();
		System.out.println("Alert 2 text: " + Alert2.getText());
       
		//10.Click on Cancel button 
		Alert2.dismiss();
		
		//11.Launch prompt alert with dialog box alert
		WebElement e3 = FindAlertButton("promtButton");
		e3.click();
		wait1.until(ExpectedConditions.alertIsPresent());
		
		//12.Print message
		Alert Alert3 = driver.switchTo().alert();
		System.out.println("Alert 3 text: " + Alert3.getText());
		
		//13.Enter Text in Alert  
		Alert3.sendKeys("Launching prompt alert with dialog box alert");
		
		//14.Click on OK button
		Alert3.accept();
		
		//15.Close browser window
		driver.quit();

	}
	
	
	 public static WebElement FindAlertButton(String AlertClickElement) {
	        WebElement element1 = driver.findElement(By.xpath("//button[@id='" + AlertClickElement + "']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	        return element1;
	    }
		
		
	}
	


