package Parameterisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterProgram {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","username"})
	public void parameterTest(String browser,String url, String username) {
	
		if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharmila\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sharmila\\Downloads\\chromedriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
	}
}
