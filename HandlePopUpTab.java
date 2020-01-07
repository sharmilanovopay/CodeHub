package alertHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HandlePopUpWindow {

	@Test
	@Parameters({"email"})
	public void handlePopUpChildWindow(String email) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmila\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
		
	
		driver.findElement(By.xpath("/html/body/p/a")).click();

		//array list of 2 windows
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		//move to child window
		driver.switchTo().window(tabs.get(1));

		System.out.println("child window title = "+driver.getTitle());
		driver.findElement(By.xpath("//tr//td//input[@type=\"text\"]")).sendKeys(email);
		driver.findElement(By.name("btnLogin")).click();
		//switch to main window
		driver.switchTo().window(tabs.get(0));
		System.out.println("parent window title = "+ driver.getTitle());
	}
}


