package locator;


import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.DriverSetup;

import org.openqa.selenium.interactions.Actions;




public class assetRegister extends DriverSetup{
	@Test
	public void registerAsset() throws InterruptedException {
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement assetRegister = driver.findElement(By.cssSelector("a[href='/asset-register']"));
		assetRegister.click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
		

		WebElement requisitionNo=driver.findElement(By.xpath("//span[@id='select2-requisition_no-container']"));
		requisitionNo.click();
	    WebElement requisitionNo1=driver.findElement(By.xpath("//input[@role='textbox']"));
	    requisitionNo1.sendKeys("230918105251842920");
	    Thread.sleep(1200);
	    requisitionNo1.sendKeys(Keys.ENTER);
		Thread.sleep(1200);

		
		WebElement po=driver.findElement(By.xpath("//span[@id='select2-po_no-container']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(po).click().perform();
		WebElement selectpo= driver.findElement(By.xpath("//input[@role='textbox']"));
		actions.sendKeys(selectpo, "PO251").perform();
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1200);
	
		WebElement invoiceNo=driver.findElement(By.xpath("//span[@id='select2-rcv_invoice_no-container']"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(invoiceNo).click().perform();
		WebElement selectInvoice= driver.findElement(By.xpath("//input[@role='textbox']"));
		actions1.sendKeys(selectInvoice, "123").perform();
		actions1.sendKeys(Keys.ENTER).perform();
		
		
		WebElement itemName=driver.findElement(By.xpath("//span[@id='select2-item_name-container']"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(itemName).click().perform();
		WebElement selectItemName= driver.findElement(By.xpath("//input[@role='textbox']"));
		actions2.sendKeys(selectItemName, "521-Air Condition").perform();
		actions2.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1200);
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-btn']"));
		searchButton.click();
		
	    driver.findElement(By.xpath("//span[@id='select2-asset_group_id-container']")).click();
	    WebElement groupSelect = driver.findElement(By.xpath("//input[@role='textbox']"));
	    groupSelect.sendKeys("Automaion Test");
	    groupSelect.sendKeys(Keys.ENTER);
	    //Thread.sleep(12000);
	    
	    driver.findElement(By.xpath("//span[@id='select2-asset_sub_group-container']")).click();
	    WebElement subGroupSelect = driver.findElement(By.xpath("//input[@role='textbox']"));
	    subGroupSelect.sendKeys("Automaion");
	    subGroupSelect.sendKeys(Keys.ENTER);
	    //Thread.sleep(12000);
	    
	    
	    driver.findElement(By.xpath("//label[normalize-space()='Bulk']")).click();
	    Thread.sleep(12000);
	    

	    WebElement html = driver.findElement(By.tagName("html"));
	    html.sendKeys(Keys.PAGE_DOWN);
	    //Thread.sleep(12000);
	    
	    //Asset Details
	    
	    driver.findElement(By.xpath("//input[@id='asset_life']")).sendKeys("3");
	    driver.findElement(By.xpath("//span[@id='select2-location_id-container']")).click();
	    WebElement location = driver.findElement(By.xpath("//input[@role='textbox']"));
	    location.sendKeys("IDRA Head Office");
	    location.sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//input[@name='asset_reg_dates']")).sendKeys("2023-09-17");
	    
	    driver.findElement(By.xpath("//span[@id='select2-department_id-container']")).click();
	    WebElement department = driver.findElement(By.xpath("//input[@role='textbox']"));
	    department.sendKeys("ACTUARIAL DEPERTMENT");
	    department.sendKeys(Keys.ENTER);
	    
	    driver.findElement(By.xpath("//input[@id='scrap_amount']")).sendKeys("2000");
	    driver.findElement(By.xpath("//textarea[@id='remarks']")).sendKeys("Asset Register");
//	    
//	    Thread.sleep(12000);

        //Depreciation
	    
	    driver.findElement(By.xpath("//span[@id='select2-deprecation_yn-container']")).click();
	    WebElement depreciation = driver.findElement(By.xpath("//input[@role='textbox']"));
	    depreciation.sendKeys("Yes");
	    depreciation.sendKeys(Keys.ENTER);
	    
	    driver.findElement(By.xpath("//span[@id='select2-deprecation_method-container']")).click();
	    WebElement method = driver.findElement(By.xpath("//input[@role='textbox']"));
	    method.sendKeys("STRAIGHT LINE METHOD");
	    method.sendKeys(Keys.ENTER);
//	    Thread.sleep(12000);

	    
	    //Maintenance Schedule
	    
	    driver.findElement(By.xpath("//span[@id='select2-schedule_type-container']")).click();
	    WebElement maintenance = driver.findElement(By.xpath("//input[@role='textbox']"));
	    maintenance.sendKeys("ADHOC SCHEDULE SERVICE");
	    maintenance.sendKeys(Keys.ENTER);
//	    Thread.sleep(12000);

	    driver.findElement(By.xpath("//input[@id='maintenance_months']")).sendKeys("1");
	    driver.findElement(By.xpath("//input[@id='maintenance_days']")).sendKeys("0");
//	    Thread.sleep(12000);

	    
	    //Attachment
	    
	    WebElement attachment= driver.findElement(By.xpath("//input[@id='attachment']"));
	    attachment.sendKeys("C:\\Users\\TAMIMA\\Downloads\\12.jpg");
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Add Asset']")).submit();
	    Thread.sleep(12000);

	}
	
	@Test
	
	public void assetList() throws InterruptedException {
		//load Asset List Page
		WebElement assetList = driver.findElement(By.xpath("//span[normalize-space()='Asset List']"));
		assetList.click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
        
        //Show asset details
        
        driver.findElement(By.xpath("//span[@id='select2-asset_code-container']")).click();
        WebElement assetCode = driver.findElement(By.xpath("//input[@role='textbox']"));
        assetCode.sendKeys("14351852055");
        Thread.sleep(1000);
        assetCode.sendKeys(Keys.ENTER);
       
        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
        Thread.sleep(3100);
		
	}
	
	@Test
	
	public void locationChange() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[normalize-space()='Asset Allocation']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Location Change']")).click();
		
		//search Asset
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
		 driver.findElement(By.xpath("//span[@id='select2-asset_code-container']")).click();
	     WebElement assetCode = driver.findElement(By.xpath("//input[@role='textbox']"));
	     assetCode.sendKeys("14351852055");
	     Thread.sleep(1500);
	     assetCode.sendKeys(Keys.ENTER);
	     Thread.sleep(1500);

	     driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		
        //Thread.sleep(1000);
	     WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	     wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
        driver.findElement(By.xpath("//i[@title='Change']")).click();
        
        driver.findElement(By.xpath("//span[@id='select2-asset_new_department-container']")).click();
        WebElement newLocation = driver.findElement(By.xpath("//input[@role='textbox']"));
        newLocation.sendKeys("ADMINISTRATION DEPARTMENT ");
        Thread.sleep(1000);
        newLocation.sendKeys(Keys.ENTER);
       // Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@id='start_dates']")).sendKeys("2023-10-18");	     
        //Thread.sleep(1500);

        driver.findElement(By.xpath("//textarea[@id='movement_remarks']")).sendKeys("Asset Allocate to new Location");
	     //Thread.sleep(1500);

        
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
	     //Thread.sleep(1500);
//        Alert alert = driver.switchTo().alert();
//        alert.accept();

	     driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	     Thread.sleep(3900);
	     //driver.navigate().to("");
	
	}
	
	//Track Location
	
	@Test
	
	
	public void trackLocation() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[normalize-space()='Asset Allocation']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Asset Tracking']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
		 driver.findElement(By.xpath("//span[@id='select2-asset_code-container']")).click();
	     WebElement assetCode = driver.findElement(By.xpath("//input[@role='textbox']"));
	     assetCode.sendKeys("14351852055");
	     Thread.sleep(1500);
	     assetCode.sendKeys(Keys.ENTER);
	     Thread.sleep(1500);

	     driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	     
	     WebElement location=driver.findElement(By.xpath("(//td[contains(text(),'ADMINISTRATION DEPARTMENT')])[2]"));
	     //System.out.println(location.getText());
	     assertEquals(location.getText(), "ADMINISTRATION DEPARTMENT");
	     Thread.sleep(1200);
		
	}
	
	
	//Maintenance List
	@Test
	public void maintenanceList() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[normalize-space()='Maintenance List']")).click();
		Thread.sleep(1200);
		
//		//Outdated Maintenance
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
//		driver.findElement(By.xpath("//a[@id='outdated-tab-fill']")).click();
//		
//		
//		//search An asset
//		
//		driver.findElement(By.xpath("//input[@aria-controls='maintenance-outdated-list']")).sendKeys("14351852055");
//		Thread.sleep(1000);
//		//Click Edit Button
//		
//		driver.findElement(By.xpath("//i[@class='bx bx-edit cursor-pointer bx-border bx-burst-hover']")).click();
//		
//		// MAINTENANCE COMPLETED -Yes
//		
//		driver.findElement(By.xpath("//label[@for='schedule_applied_y']")).click();
//		driver.findElement(By.xpath("//input[@id='service_name']")).sendKeys("AC Repair");
//		driver.findElement(By.xpath("//input[@id='service_date']")).sendKeys("2023-10-19");
//		driver.findElement(By.xpath("//input[@id='service_provider_name']")).sendKeys("Amin");
//		driver.findElement(By.xpath("//textarea[@id='service_comment']")).sendKeys("Ac maintenance");
//		
//		driver.findElement(By.xpath("//input[@id='maintenance_item_name_0']")).sendKeys("1");
//		driver.findElement(By.xpath("//input[@id='maintenance_item_quantity_0']")).sendKeys("1");
//		driver.findElement(By.xpath("//input[@id='maintenance_item_price_0']")).sendKeys("120");
//		
//		
//		driver.findElement(By.xpath("//button[@id='item_btn_more']")).click();	
//		
//		driver.findElement(By.xpath("//input[@id='maintenance_item_name_1']")).sendKeys("2");
//		driver.findElement(By.xpath("//input[@id='maintenance_item_quantity_1']")).sendKeys("1");
//		driver.findElement(By.xpath("//input[@id='maintenance_item_price_1']")).sendKeys("150");
//
//		driver.findElement(By.xpath("//input[@id='maintenance_attachment']")).sendKeys("C:\\Users\\TAMIMA\\Downloads\\1linkedin.jpeg");
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();		
//		
//		
//		driver.findElement(By.xpath("//label[@for='addition_applied_n']")).click();
//		
//		driver.findElement(By.xpath("//textarea[@id='reason']")).sendKeys("No need");
//		
//		
//		driver.findElement(By.xpath("//button[normalize-space()='save']")).click();
		
		// Complete Maintenance

		driver.findElement(By.xpath("(//i[@class='bx bx-show cursor-pointer bx-border bx-burst-hover'])[3]")).click();
		
		Thread.sleep(2200);

		
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='Close']")).click();
		
		Thread.sleep(2200);
			
	}
	
//Maintenance Ledger	
	
	@Test
	
	public void maintenanceLedger() throws InterruptedException {
		
		//Click Maintenance Ledger
		
		driver.findElement(By.xpath("//span[normalize-space()='Maintenance Ledger']")).click();
		Thread.sleep(1000);
		
		//Search Asset
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("14351852055");
		Thread.sleep(1200);
		
		//Click Eye Icon
		
		driver.findElement(By.xpath("//i[@class='bx bx-show cursor-pointer bx-border bx-burst-hover']")).click();
		
		//Check Asset Details
		
		WebElement assetName= driver.findElement(By.xpath("//input[@id='d_asset_name']"));
		assertEquals(assetName.getAttribute("value"), "Air Condition");
		
		WebElement department= driver.findElement(By.xpath("//div[@class='col-12']//div[1]//div[1]//fieldset[1]//div[1]//div[2]//input[1]"));
		assertEquals(department.getAttribute("value"), "ADMINISTRATION DEPARTMENT");

		WebElement assetCode= driver.findElement(By.xpath("(//input[@id='d_asset_code'])[2]"));
		assertEquals(assetCode.getAttribute("value"), "14351852055");
		
		WebElement groupName= driver.findElement(By.xpath("//input[@id='d_group_name']"));
		assertEquals(groupName.getAttribute("value"), "Automaion Test");
		
		WebElement assetLife= driver.findElement(By.xpath("(//input[@id='d_asset_code'])[3]"));
		assertEquals(assetLife.getAttribute("value"), "3");
		
		WebElement assetPrice= driver.findElement(By.xpath("(//input[@id='d_asset_code'])[4]"));
		assertEquals(assetPrice.getAttribute("value"), "50000.0");
		
		WebElement assetQuantity= driver.findElement(By.xpath("(//input[@id='d_asset_code'])[5]"));
		assertEquals(assetQuantity.getAttribute("value"), "1");
		Thread.sleep(1000);

		//Asset Maintenance Number - 1
		
		WebElement acRepair= driver.findElement(By.xpath("//input[@value='AC Repair']"));
		assertEquals(acRepair.getAttribute("value"), "AC Repair");
		
		WebElement providerName= driver.findElement(By.xpath("//input[@value='Amin']"));
		assertEquals(providerName.getAttribute("value"), "Amin");
		
		WebElement serviceDate= driver.findElement(By.xpath("//input[@value='19-10-2023']"));
		assertEquals(serviceDate.getAttribute("value"), "19-10-2023");
		
		
		//Check Maintenance Item 1
	    WebElement name1=	driver.findElement(By.xpath("(//input[@value='1'])[2]"));
		assertEquals(name1.getAttribute("value"), "1");
		
		WebElement quantity1= driver.findElement(By.xpath("(//input[@value='1'])[3]"));
		assertEquals(quantity1.getAttribute("value"), "1");
		
		WebElement price1= driver.findElement(By.xpath("//input[@value='120.0']"));
		assertEquals(price1.getAttribute("value"), "120.0");
		
		
		//Check Maintenance Item 2
	    WebElement name2=	driver.findElement(By.xpath("//input[@value='2']"));
		assertEquals(name2.getAttribute("value"), "2");
		
		WebElement quantity2= driver.findElement(By.xpath("(//input[@value='1'])[4]"));
		assertEquals(quantity2.getAttribute("value"), "1");
		
		WebElement price3= driver.findElement(By.xpath("//input[@value='150.0']"));
		assertEquals(price3.getAttribute("value"), "150.0");
		
	}
	
	
	//Depreciation Run
	
	@Test
	
	public void depreciationMethod() throws InterruptedException {
		
		//Click Depreciation Run
		
		driver.findElement(By.xpath("(//span[normalize-space()='Depriciation Process'])[1]")).click();
		Thread.sleep(1000);
		
		
		//Select Financial Year and group
		
		driver.findElement(By.xpath("//span[@id='select2-financial_year_id-container']")).click();
	    WebElement yearSelect=	driver.findElement(By.xpath("//input[@role='textbox']"));
	    yearSelect.sendKeys("2023-2024");
	    yearSelect.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//span[@id='select2-asset_group_id-container']")).click();
        WebElement groupSelect= driver.findElement(By.xpath("//input[@role='textbox']"));	
        groupSelect.sendKeys("Automaion Test");
		groupSelect.sendKeys(Keys.ENTER);
		
		
		//Click RunDepreciation
		
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);

	}
}
