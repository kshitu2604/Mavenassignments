package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {

	public static void main(String[] args) {
	
		// 1: Launch the Chrome browser
			WebDriver driver = new ChromeDriver();

		// 2: Maximize the browser window to full screen
			driver.manage().window().maximize();
				
		// 3: Clear all cookies from the browser
			driver.manage().deleteAllCookies();
				
		// 4: Open parabank  homepage
			driver.get("https://parabank.parasoft.com/parabank/index.htm");
			
		//5: Locate Para services tab using Syntax-4 CssLocator
			driver.findElement(By.cssSelector("ul[class='leftmenu']>li>a[href='services.htm']"));
			
			driver.close();

	}

}
