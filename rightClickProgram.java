package mouseMovements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class rightClickProgram {

	@Test
	public void rightClickMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmila\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action = new Actions(driver);
		WebElement rightClickElement =  driver.findElement(By.cssSelector(".context-menu-one"));
		
		action.contextClick(rightClickElement).build().perform();
		
		WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		System.out.println(copy.getText());
		
		copy.click();
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	
	}
	
	
	
}
