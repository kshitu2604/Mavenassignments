package assignments;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment21_Webactions {

	private static Function ExpectecConditions;

	public static void main(String[] args) {

		// 1. Launch browser window(Chrome)
		WebDriver driver = new ChromeDriver();

		// 2. Maximize the browser window
		driver.manage().window().maximize();

		// 3. Delete all the cookies
		driver.manage().deleteAllCookies();

		// 4. Enter URL and Launch the application
		// (https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");

		// 5. Wait for Page-load

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.titleIs("DEMOQA"));

		String element1 = driver.getTitle();
		Assert.assertEquals("DEMOQA", element1, "page not loaded");

		// 6. Enter First name and Last name
		WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		element2.sendKeys("My First Name");

		WebElement element3 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		element3.sendKeys("My last Name");

		// 7. Enter Email
		WebElement element4 = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		element4.sendKeys("Myemail123@gmail.com");

		// 8. Select Gender (Female)
		WebElement element5 = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
		element5.click();

		// 9. Enter mobile number
		WebElement element6 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		//element6.sendKeys("1234567890");
		wait1.until(ExpectedConditions.elementToBeClickable(element6)).sendKeys("1234567890");

		// 10.Select DOB (1-Feb-1991)
		WebElement element7 = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		element7.clear();
		//element7.sendKeys("1-Feb-1991");
		wait1.until(ExpectedConditions.elementToBeClickable(element7)).sendKeys("1-Feb-1991");
		element7.sendKeys(Keys.ENTER);

		// 11.Search and Select Computer Science
		WebElement element8 = driver.findElement(By.id("subjectsInput"));
		//element8.sendKeys("Computer Science");
		wait1.until(ExpectedConditions.elementToBeClickable(element8)).sendKeys("Computer Science");
		element8.sendKeys(Keys.ENTER);


		// 12.Select Hobbies as Sports and Reading
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element9 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		js.executeScript("arguments[0].scrollIntoView(true)", element9);
		wait1.until(ExpectedConditions.elementToBeClickable(element9)).click();

		 WebElement element10 =
		 driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
		 wait1.until(ExpectedConditions.elementToBeClickable(element10)).click();
		// element10.click();
		 

		// 13.Upload photo
		 WebElement element11 = driver.findElement(By.xpath("//input[@type='file']"));
		 element11.sendKeys("C:\\Users\\win 10\\OneDrive\\Pictures\\Screenshots 1");
		 
		 

		// 14. Wait till file upload
		 wait1.until(ExpectedConditions.visibilityOf(element11));

		// 15.Submit Details
		 WebElement element12 =driver.findElement(By.xpath("//button[@type='submit']"));
		 js.executeScript("arguments[0].scrollIntoView(true)", element12);
		// element12.click();
		 wait1.until(ExpectedConditions.elementToBeClickable(element12)).click();
		 
		// 16. Close browser window
		//driver.quit();

	}

}
