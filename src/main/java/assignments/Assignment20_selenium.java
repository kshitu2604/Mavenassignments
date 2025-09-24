package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Assignment20_selenium {

	public static void main(String[] args) {
	
		//1. Launch the Chrome browser window
		WebDriver driver = new ChromeDriver();

		//2. Maximize the browser window
		driver.manage().window().maximize();
		
		//3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
		//4. Enter URL "https://parabank.parasoft.com/parabank&quot; and Launch the application
		driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=20C5B903577ECEFAFA76502483969CF7");
		
		//5. Verify application title
		String ExpectedTitle = "ParaBank | Welcome | Online Banking";
		String ActualTitle = driver.getTitle();
		
		if(!ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Browser not launched properly");	
		}

		//6. Verify application logo image
		WebElement element = driver.findElement(By.xpath("//img[@class='logo']"));

		String ExpectedSrclink = element.getAttribute("src");
		String ActualSrclink = "https://parabank.parasoft.com/parabank/images/logo.gif;jsessionid=20C5B903577ECEFAFA76502483969CF7";
		if(!ExpectedSrclink.equals(ActualSrclink)) {
			System.out.println("Wrong image is selected");	
		}

		
		//7. Verify application caption " Experience the difference"
		WebElement element1 = driver.findElement(By.xpath("//p[text()='Experience the difference']"));
			
		String ExpectedText = element1.getText();
		String ActualText = "Experience the difference";
			if(!ExpectedText.equals(ActualText)) {
				System.out.println("Wrong caption is selected");	
			}
			
		//8. Enter Invalid credentials in Username (Invalid User) and Password (Empty) textboxes
		WebElement username1 = driver.findElement(By.xpath("//input[@name='username']"));
		username1.sendKeys("Invalid User 1");
		WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("Empty 1");
			
		//9. Click on Login Button
		WebElement login1 = driver.findElement(By.xpath("//input[@class='button']"));
		login1.click();
			
		//10. Verify error message is displayed (The username and password could not be verified.)
		 WebElement element2 = driver.findElement(By.xpath("//p[contains(text(),'The username and password could not be verified.')]"));
			
		String ExpectedText1 = element2.getText();
		String ActualText1 ="The username and password could not be verified.";
				if(ExpectedText1.equals(ActualText1)) {
					System.out.println("Error seen for Wrong Credentials");	
				}
			
		//11. Click on Adminpage link
		WebElement element3 = driver.findElement(By.xpath("//a[starts-with(text(),'Admin Page')]"));	
		element3.click();
		
		//12. Wait for admin page
		
		//13. Select Data access mode as ' SOAP'
		WebElement element4 = driver.findElement(By.xpath("//input[@value='soap']"));	
		element4.click();
		
		//14. Scrolldown till Loan provider
	
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement element5 = driver.findElement(By.xpath("//select[@name='loanProvider']"));
		 js.executeScript("arguments[0].scrollIntoView(true)",element5);
		 
		//15. Select Loanprovider as 'Web Service'
		 Select select1 = new Select(element5);
		 select1.selectByValue("ws");
	  
		//16. Click on Submit button
		 WebElement element6 = driver.findElement(By.xpath("//input[@value='Submit']"));	
		 element6.click();
			
		//17.wait for Successful submission message
			
		//18.Click on Services Link
			WebElement element7 = driver.findElement(RelativeLocator.with(By.linkText("Services")).below(By.linkText("About Us")));	
			element7.click();
			
		//19.Wait for Services page 
			
		//20.Scrolldown till Bookstore services
			WebElement element8 = driver.findElement(By.xpath("//span[starts-with(text(),'Bookstore services:')]"));
			 js.executeScript("arguments[0].scrollIntoView(true)",element8);
			 
			
		//21.Get total rows, columns in the bookstore service table
			
		//22.Get Column headers of book store services table
			
		//23.Get all the data from book store service table
			
		//24.Close browser window
	}

}
