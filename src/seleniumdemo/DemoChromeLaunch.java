package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChromeLaunch {
	
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com");
		
	}

}
