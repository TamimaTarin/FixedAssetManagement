package locator;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.DriverSetup;



public class login extends DriverSetup{

		
	@Test (priority = 0)
	public void LogIn() throws InterruptedException { 
		
		assertEquals(driver.getTitle(), "IDRA Fixed Assets Management System Dashboard");
		//System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		}

	
	@Test(priority = 1)
public void descriptionByClassName() throws InterruptedException { 
		
		
		WebElement description = driver.findElement(By.xpath("//a[contains(text(),'INSURANCE DEVELOPMENT & REGULATORY AUTHORITY (IDRA')]"));
		assertEquals(description.getText(), "INSURANCE DEVELOPMENT & REGULATORY AUTHORITY (IDRA)");
		//System.out.println(description.getText());
		Thread.sleep(3000);
		}
	@Test(priority = 2)
public void LogInPage() throws InterruptedException { 

		String actualUrl="http://123.200.20.20:7015/dashboard";
		String expectedUrl= driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl);
}
	
	//Asset Group
	@Test(priority = 3)
	public void assetGroup() throws InterruptedException{
	    
	    WebElement setup = driver.findElement(By.xpath("//span[normalize-space()='Setup']"));
	    setup.click();
	    WebElement assetgroup = driver.findElement(By.xpath("//a[@href ='/asstes-group']"));
	    assetgroup.click();
	    WebElement groupCode = driver.findElement(By.id("asset_group_code"));
	    groupCode.sendKeys("0098");
	    WebElement groupName = driver.findElement(By.id("asset_group_name"));
	    groupName.sendKeys("Automaion Test");
	    WebElement groupNameBangla = driver.findElement(By.id("asset_group_name_bn"));
	    groupNameBangla.sendKeys("অটোমেশন টেস্ট");
	    WebElement description = driver.findElement(By.id("description"));
	    description.sendKeys("For Automation Testing");
	    WebElement descriptionBangle = driver.findElement(By.id("description_bn"));
	    descriptionBangle.sendKeys("অটোমেশন টেস্ট");
	    
	    WebElement submitbutton = driver.findElement(By.cssSelector("button[class='btn btn btn-dark shadow mr-1 mb-1 btn-secondary']"));
	    submitbutton.submit();
	   
		Thread.sleep(12000);

	}
	
	// Asset Group Edit
	@Test(priority = 4)
	public void assetGroupEdit() throws InterruptedException {

		 WebElement setup = driver.findElement(By.linkText("Setup")); 
		 setup.click();
		 WebElement assetgroup = driver.findElement(By.xpath("//a[@href ='/asstes-group']"));
		 assetgroup.click();
		 WebElement editbutton=driver.findElement(By.xpath("//a[@href='http://123.200.20.20:7015/asstes-group/12']")); 
		 editbutton.sendKeys(Keys.ENTER);
		
		 driver.navigate().to ("http://123.200.20.20:7015/asstes-group/12");
		 WebElement description =driver.findElement(By.xpath("//textarea[@id='description']"));
		 description.clear();
		 description.sendKeys("Edit Test");
		 WebElement descriptionBangle = driver.findElement(By.xpath("//textarea[@id='description_bn']"));
		 descriptionBangle.clear();
		 descriptionBangle.sendKeys("Edit অটোমেশন টেস্ট");
		
		 WebElement updateButton = driver.findElement(By.cssSelector("button[class='btn btn btn-dark shadow mr-1 mb-1 btn-secondary']"));
		 updateButton.submit();
		 
		 Thread.sleep(12000);
		
	}
	
	
	// Active Status Change
	@Test(priority = 5)
	public void activeStatus() throws InterruptedException {
	   
        JavascriptExecutor js = (JavascriptExecutor) driver;


		 WebElement setup = driver.findElement(By.linkText("Setup")); 
		 setup.click();
		 WebElement assetgroup = driver.findElement(By.xpath("//a[@href ='/asstes-group']"));
		 assetgroup.click();
		 WebElement editbutton=driver.findElement(By.xpath("//a[@href='http://123.200.20.20:7015/asstes-group/12']")); 
		 editbutton.sendKeys(Keys.ENTER);
		 driver.navigate().to ("http://123.200.20.20:7015/asstes-group/14");
		 
		 WebElement activeStatus = driver.findElement(By.xpath("//label[@for='customSwitch1']"));
	     js.executeScript("arguments[0].click();", activeStatus);

	     //checkbox.click();
	     WebElement updateButton = driver.findElement(By.cssSelector("button[class='btn btn btn-dark shadow mr-1 mb-1 btn-secondary']"));
		 updateButton.submit();
		 Thread.sleep(4000);
		
	}
	
	//AssetSubGroup
	@Test (priority = 9)
	public void assetSubGroup() throws InterruptedException {
		

		WebElement setup = driver.findElement(By.linkText("Setup"));
	    setup.click();
	    WebElement assetSubGroup = driver.findElement(By.linkText("Asset SubGroup"));
	    assetSubGroup.click();
	    WebElement groupCode = driver.findElement(By.id("asset_sub_group_code"));
	    groupCode.sendKeys("008");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
	    WebElement Name=driver.findElement(By.xpath("//span[@title='Select One']"));
	    Name.click();
	    WebElement Name1=driver.findElement(By.xpath("//input[@role='textbox']"));
        Name1.sendKeys("Automaion Test");
        Name1.sendKeys(Keys.ENTER);


	    WebElement subGroupName = driver.findElement(By.id("asset_sub_group"));
	    subGroupName.sendKeys("Automaion");
	    WebElement groupNameBangla = driver.findElement(By.id("asset_sub_group_bn"));
	    groupNameBangla.sendKeys("অটোমেশন");
	    WebElement description = driver.findElement(By.id("description"));
	    description.sendKeys("For Automation sub group");
		Thread.sleep(12000);

	    
	    WebElement submitbutton = driver.findElement(By.cssSelector("button[class='btn btn btn-dark shadow mr-1 mb-1 btn-secondary']"));
	    submitbutton.submit();
	   
		Thread.sleep(12000);
		
	}
	
	//Asset Sub Group Edit
	@Test
	public void subGroupEdit() throws InterruptedException {
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement setup = driver.findElement(By.linkText("Setup"));
	    setup.click();
	    WebElement assetgroup = driver.findElement(By.linkText("Asset SubGroup"));
	    assetgroup.click();
	    WebElement editbutton=driver.findElement(By.cssSelector("a[href='http://123.200.20.20:7015/asstes-sub-group/37']")); 
		editbutton.sendKeys(Keys.ENTER);
		 driver.navigate().to ("http://123.200.20.20:7015/asstes-sub-group/37");

	    WebElement description = driver.findElement(By.id("description"));
	    description.clear();
	    description.sendKeys("Update For Automation sub group");
		Thread.sleep(12000);
		
		//Active status change
		 WebElement activeStatus = driver.findElement(By.xpath("//label[@for='customSwitch1']"));
	     js.executeScript("arguments[0].click();", activeStatus);

	    
	    WebElement updatebutton = driver.findElement(By.cssSelector("button[class='btn btn btn-dark shadow mr-1 mb-1 btn-secondary']"));
	    updatebutton.submit();
	   
		Thread.sleep(12000);
		
	}
	
	//location View
	@Test(priority = 6)
public void location() throws InterruptedException{
	    
	    WebElement setup = driver.findElement(By.xpath("//span[normalize-space()='Setup']"));
	    setup.click();
	    WebElement assetgroup = driver.findElement(By.xpath("//a[@href ='/asstes-location']"));
	    assetgroup.click();
	    WebElement locationName = driver.findElement(By.xpath("//td[normalize-space()='IDRA Head Office']"));
	    assertEquals(locationName.getText(), "IDRA Head Office");
	    WebElement locationAttributes = driver.findElement(By.xpath("//td[normalize-space()='Motijheel,Dhaka']"));
	    assertEquals(locationAttributes.getText(), "Motijheel,Dhaka");
	    WebElement floorName = driver.findElement(By.xpath("//td[normalize-space()='6th']"));
	    assertEquals(floorName.getText(), "6th");
	    WebElement postalCode = driver.findElement(By.xpath("//td[normalize-space()='1222']"));
	    assertEquals(postalCode.getText(), "1222");
	    WebElement status = driver.findElement(By.xpath("//td[normalize-space()='Active']"));
	    assertEquals(status.getText(), "Active");
        Thread.sleep(12000);

	}
	
	
	//Financial Year
	@Test(priority = 7)
public void financialYear() throws InterruptedException{
	    
	    WebElement setup = driver.findElement(By.xpath("//span[normalize-space()='Setup']"));
	    setup.click();
	    WebElement financialYearPage = driver.findElement(By.xpath("//a[@href ='/financial-year']"));
	    financialYearPage.click();
	    WebElement financialYearCode = driver.findElement(By.xpath("//input[@id='financial_year_code']"));
	    financialYearCode.sendKeys("2018");
	    WebElement financialYear = driver.findElement(By.xpath("//input[@id='financial_year']"));
	    financialYear.sendKeys("2018-2019");
	    WebElement financialYearBangla = driver.findElement(By.xpath("//input[@id='financial_year_bn']"));
	    financialYearBangla.sendKeys("২০১৮-২০১৯");
	    WebElement startDate=driver.findElement(By.xpath("//input[@placeholder='01-July-2000']"));
	    startDate.sendKeys("2018-10-9");
	    WebElement endDate = driver.findElement(By.xpath("//input[@placeholder='30-June-2001']"));
	    endDate.sendKeys("2019-10-9");
	    Thread.sleep(12000);

	    
	    //Reset Button check-It works
//	    driver.findElement(By.cssSelector("button[class='btn btn btn-outline shadow mb-1 btn-secondary']")).click();
//	    financialYearCode.clear();
//	    financialYear.clear();
//	    financialYearBangla.clear();
//	    startDate.clear();
//	    endDate.clear();
//	    Thread.sleep(12000);
	    
	    //submit
	    WebElement submitbutton = driver.findElement(By.cssSelector("button[class='btn btn btn-dark shadow mr-1 mb-1 btn-secondary']"));
	    submitbutton.submit();
        Thread.sleep(12000);

	}
	
	
	//Schedule Edit
	@Test(priority = 8)
	public void scheduleType() throws InterruptedException {
		
		 WebElement setup = driver.findElement(By.xpath("//span[normalize-space()='Setup']"));
		 setup.click();
		 WebElement scheduleType = driver.findElement(By.xpath("//a[@href='/maintenance-type']"));
		 scheduleType.click();
		 WebElement editSchedule = driver.findElement(By.xpath("//tr[@role='row']//td//a"));
		 editSchedule.sendKeys(Keys.ENTER);
		 driver.navigate().to("http://123.200.20.20:7015/maintenance-type-edit/1");
		 WebElement month =driver.findElement(By.xpath("//input[@name='maintenance_period_month']"));
		 month.clear();
		 month.sendKeys("8");
		 WebElement days = driver.findElement(By.xpath("//input[@name='maintenance_period_day']"));
		 days.clear();
		 days.sendKeys("0");
		 Thread.sleep(4000);
		 WebElement updateButton = driver.findElement(By.cssSelector("button[type='submit']"));
		 updateButton.submit();
		 
		 Thread.sleep(12000);
		 
		
	}

	

}
