package CnetLogin;

import java.io.File;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CnetLogin {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		File file = new File("driver//chromedriver.exe");
 		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
 		driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://dev21017.service-now.com");
 		driver.switchTo().frame("gsft_main");
 		
 		
 		WebElement user_name = driver.findElement(By.id("user_name"));
 		user_name.clear();
 		user_name.sendKeys("test.user");
 		
 		
 		WebElement user_password = driver.findElement(By.id("user_password"));
 		user_password.clear();
 		user_password.sendKeys("test");
 		
 		WebElement singIn = driver.findElement(By.id("sysverb_login"));
 		singIn.click();
 		
 		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		
		
	}
	

	

}
