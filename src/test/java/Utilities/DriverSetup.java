package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
	public WebDriver driver;
	
	
	@BeforeSuite
	public void setDriver() throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver = new ChromeDriver(options);
//		driver.get("");
//		driver.manage().window().maximize();
		driver.get("");
		WebElement username = driver.findElement(By.id("exampleInputPassword1"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.cssSelector("input[class='form-control input-password']"));
		password.sendKeys("");
		WebElement loginbutton = driver.findElement(By.cssSelector("button[class='btn glow position-relative w-100 submit-btn']"));
		loginbutton.click();
		Thread.sleep(2000);
		
	}
	@AfterSuite
	public void quitDriver() {
		
		driver.quit();

		
	}
	
}
