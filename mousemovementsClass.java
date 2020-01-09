package mouseMovements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mousemovementsClass {
	
	@Test
	public void hoverAndClickMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmila\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//waits globally for all the elements which will be interacted by the WebDriver
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://mrbool.com/introducing-javascript-6-arrow-functions/36854");
		
		Actions action = new Actions(driver);		
		action.moveToElement(driver.findElement(By.xpath("//a[@rel='nofollow' and @class='menulink']"))).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Articles']")).click();
		
		System.out.println(driver.getTitle());
		
	
	}
	
	

}
