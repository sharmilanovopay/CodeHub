package alertHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertHandlerClass {
	
	@Test
	public void alertMethod() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmila\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.className("signin")).click();
		//driver.findElement(By.id("signin_info")).click();
		driver.findElement(By.name("proceed")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		// implicit wait
		Thread.sleep(5000);
		
		//Explicit wait
		//WebDriverWait wait = new WebDriverWait(driver,5);
		//wait.equals(obj);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/div/div[7]/a")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement daySelector = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"));
		Select select = new Select (daySelector);
		
		select.selectByVisibleText("17");
		//Thread.sleep(5000);
		
		WebElement monthSelector = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]"));
		Select selectMonth = new Select(monthSelector);
		selectMonth.selectByVisibleText("OCT");
		//Thread.sleep(5000);

		WebElement yearSelector = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]"));
		Select selectYear = new Select(yearSelector);
		selectYear.selectByVisibleText("1994");
	}

}
