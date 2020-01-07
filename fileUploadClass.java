package UploadingFile;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class fileUploadClass {
	
	@Test
	public void uploadFileMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmila\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://html.com/input-type-file/");
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.titleContains("<input type=\"file\">: How to Use This HTML Value"));

		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\Sharmila\\eclipse-workspace\\MavenProject\\test-output\\index.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/article/div/div[4]/form/input[2]")).click();
	}

}
