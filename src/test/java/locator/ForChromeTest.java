package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class ForChromeTest {
	WebDriver driver;
	@Test
	public void chromeTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://123.200.20.20:7015/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("exampleInputPassword1"));
		username.sendKeys("023024");
		WebElement password = driver.findElement(By.cssSelector("input[class='form-control input-password']"));
		password.sendKeys("Cns@1234#");
		WebElement loginbutton = driver.findElement(By.cssSelector("button[class='btn glow position-relative w-100 submit-btn']"));
		loginbutton.click();
		Thread.sleep(2000);
		//driver.quit();
		
		WebElement setup = driver.findElement(By.linkText("Setup"));
	    setup.click();
	    WebElement assetgroup = driver.findElement(By.xpath("//a[@href ='/asstes-group']"));
	    assetgroup.click();
	    WebElement groupCode = driver.findElement(By.id("asset_group_code"));
	    groupCode.sendKeys("009");
	    WebElement groupName = driver.findElement(By.id("asset_group_name"));
	    groupName.sendKeys("Automaion_Test");
	    WebElement groupNameBangla = driver.findElement(By.id("asset_group_name_bn"));
	    groupNameBangla.sendKeys("অটোমেশন_টেস্ট");
	    WebElement description = driver.findElement(By.id("description"));
	    description.sendKeys("For Automation Testing");
	    WebElement descriptionBangle = driver.findElement(By.id("description_bn"));
	    descriptionBangle.sendKeys("অটোমেশন টেস্ট");
	    
	    WebElement submitbutton = driver.findElement(By.cssSelector("button[class='btn btn btn-dark shadow mr-1 mb-1 btn-secondary']"));
	    submitbutton.submit();
	   
		Thread.sleep(12000);

	}
	
	
//public void assetGroup() throws InterruptedException{
//	    
//	    WebElement setup = driver.findElement(By.linkText("Setup"));
//	    setup.click();
//	    WebElement assetgroup = driver.findElement(By.linkText("Asset Group"));
//	    assetgroup.click();
//	    WebElement groupCode = driver.findElement(By.id("asset_group_code"));
//	    groupCode.sendKeys("0098");
//	    WebElement groupName = driver.findElement(By.id("asset_group_name"));
//	    groupName.sendKeys("Automaion Test");
//	    WebElement groupNameBangla = driver.findElement(By.id("asset_group_name_bn"));
//	    groupNameBangla.sendKeys("অটোমেশন টেস্ট");
//	    WebElement description = driver.findElement(By.id("description"));
//	    description.sendKeys("For Automation Testing");
//	    WebElement descriptionBangle = driver.findElement(By.id("description_bn"));
//	    descriptionBangle.sendKeys("অটোমেশন টেস্ট");
//	    
//	    WebElement submitbutton = driver.findElement(By.cssSelector("button[class='btn btn btn-dark shadow mr-1 mb-1 btn-secondary']"));
//	    submitbutton.submit();
//	   
//		Thread.sleep(12000);
//
//	}

}
