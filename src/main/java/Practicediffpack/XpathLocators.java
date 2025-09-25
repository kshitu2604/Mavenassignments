package Practicediffpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	//Xpath locators --> 2 types
	//Abosulte path -->it is complete path from root element to the target element.(/)
	//Relative path --> it is partial path from any element to the target element.(//)
	
	//**************basic level 1--
	//Syntax 1 : //tagname[@attribute='attribute-value'];
	//Syntax 2 : //tagname[text()='text-value'];
	
	//**************Level 2 -- contains, starts-with
	//Syntax 3 : //tagname[contains(@attribute,'partial-attribute-value')];
	//Syntax 4 : //tagname[contains(@text(),'partial-text-value')];
	
	//Syntax 5 : //tagname[starts-with(@attribute,'partial-attribute-value-starts-with')];
	//Synatx 6 : //tagname[starts-with(@text(),'partial-text-value-starts-with')];
	
	//**************Level 3--combine multiple attribute & text value using 'and'operator
	//Syntax 7 : //tagname[attribute1='attribute-value1'and attribute2='attribute-value2' and text()='text-value'];
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Launch the Chrome browser window
				WebDriver driver = new ChromeDriver();

				//2. Maximize the browser window
				driver.manage().window().maximize();
				
				//3. Delete all the cookies
				driver.manage().deleteAllCookies();
				
				//4. Enter URL "https://parabank.parasoft.com/parabank&quot; and Launch the application
				driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=20C5B903577ECEFAFA76502483969CF7");
				
				
				
	}

}
