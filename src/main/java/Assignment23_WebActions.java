import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment23_WebActions {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
		
		//1.Launch Chrome Browser     
		driver = new ChromeDriver();
		
		//2.Maximize the browser window 
		driver.manage().window().maximize();
		
		//3.Launch the application    (https://demoqa.com/frames)   
		driver.get("https://demoqa.com/frames");
		
		//4.Locate elements 'Frames' header in main window and 'This is a sample page' inside the frame  
		WebElement e1 = driver.findElement(By.xpath("//h1[contains(@class,'text-center')]"));
		System.out.println("Main Window Header: " + e1.getText());
		
		driver.switchTo().frame("frame1"); 
		
		//5.Print frame element text   
		WebElement e2 = driver.findElement(By.id("sampleHeading"));
		System.out.println("Frame element text: " + e2.getText());
		
		//6.Print main window element text   
		driver.switchTo().defaultContent();
		//7.Close browser window
		driver.quit();
		
		

	}

}
