package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.DriverSetup;

public class Report extends DriverSetup{
	
	//Asset Register Report
	
	@Test
	public void AssetRegisterReport () throws InterruptedException {
		
		
		//Click on Report

		driver.findElement(By.cssSelector("a[href='/report-generators']")).click();
		Thread.sleep(1000);
		
		//Select Reports
		
		driver.findElement(By.xpath("//span[@id='select2-report-container']")).click();
		WebElement assetRegister=driver.findElement(By.xpath("//input[@role='textbox']"));
		assetRegister.sendKeys("Asset Register Report");
		assetRegister.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		//Select Group
		
		driver.findElement(By.xpath("//span[@id='select2-p_group_id-container']")).click();
		WebElement selectgroup= driver.findElement(By.xpath("//input[@role='textbox']"));
		selectgroup.sendKeys("Computer & Network Equipment");
		selectgroup.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		//Select SubGroup
		
		driver.findElement(By.xpath("//span[@id='select2-p_sub_gourp-container']")).click();
		WebElement selectSubgroup= driver.findElement(By.xpath("//input[@role='textbox']"));
		selectSubgroup.sendKeys("Monitor");
		Thread.sleep(1000);

		selectSubgroup.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		//Select Code
		
		driver.findElement(By.xpath("//span[@id='select2-asset_code-container']")).click();
		WebElement selectCode= driver.findElement(By.xpath("//input[@role='textbox']"));
		selectCode.sendKeys("751837015");
		Thread.sleep(1000);

		selectCode.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Generate Report']")).click();
		Thread.sleep(1000);

		//driver.navigate().to("http://123.200.20.20:7015/report/render/Asset%20Register%20Report");
		
		//Thread.sleep(1000);

	}
	
	
	//Department Wise Summary Report
	@Test
	
	public void DepartmentWiseSummaryReport() throws InterruptedException {
		
		
		//Click on Report

				driver.findElement(By.cssSelector("a[href='/report-generators']")).click();
				Thread.sleep(1000);
				
				//Select Reports
				
				driver.findElement(By.xpath("//span[@id='select2-report-container']")).click();
				WebElement departmentWise=driver.findElement(By.xpath("//input[@role='textbox']"));
				departmentWise.sendKeys("Department Wise Summary Report");
				departmentWise.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				
				//Select Department
				
				driver.findElement(By.xpath("//span[@id='select2-p_dept-container']")).click();
				WebElement selectdept= driver.findElement(By.xpath("//input[@role='textbox']"));
				selectdept.sendKeys("ADMINISTRATION DEPARTMENT");
				selectdept.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				
				
				
				//Select Group
				
				driver.findElement(By.xpath("//span[@id='select2-asset_group_id-container']")).click();
				WebElement selectgroup= driver.findElement(By.xpath("//input[@role='textbox']"));
				selectgroup.sendKeys("Computer & Network Equipment");
				selectgroup.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				//Select SubGroup
				
				driver.findElement(By.xpath("//span[@id='select2-asset_sub_group_id-container']")).click();
				WebElement selectSubgroup= driver.findElement(By.xpath("//input[@role='textbox']"));
				selectSubgroup.sendKeys("Monitor");
				Thread.sleep(1000);

				selectSubgroup.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				//Generate Report
				
				driver.findElement(By.xpath("//button[normalize-space()='Generate Report']")).click();
				Thread.sleep(3000);
				
				
		
	}
	
	
	//Depreciation Report
		@Test
		
		public void DepreciationReport() throws InterruptedException {
			
			
			//Click on Report

					driver.findElement(By.cssSelector("a[href='/report-generators']")).click();
					Thread.sleep(1000);
					
					//Select Reports
					
					driver.findElement(By.xpath("//span[@id='select2-report-container']")).click();
					WebElement depreciation=driver.findElement(By.xpath("//input[@role='textbox']"));
					depreciation.sendKeys("Depreciation Report");
					depreciation.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
					//Select Financial Year
					
					driver.findElement(By.xpath("//span[@id='select2-p_fyr_id-container']")).click();
					WebElement selectYear= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectYear.sendKeys("2020-2021");
					selectYear.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
				

					//Select Group
					
					driver.findElement(By.xpath("//span[@id='select2-asset_group_id-container']")).click();
					WebElement selectgroup= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectgroup.sendKeys("Computer & Network Equipment");
					selectgroup.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
			
					
					//Select Department
					
					driver.findElement(By.xpath("//span[@id='select2-department_id-container']")).click();
					WebElement selectdept= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectdept.sendKeys("ADMINISTRATION DEPARTMENT");
					selectdept.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					//Generate Report
					
					driver.findElement(By.xpath("//button[normalize-space()='Generate Report']")).click();
					Thread.sleep(3000);
					
					
		}
		
		
		//Asset Summary Report
		@Test
		
		public void AssetSummaryReport() throws InterruptedException {
			
			
			//Click on Report

					driver.findElement(By.cssSelector("a[href='/report-generators']")).click();
					Thread.sleep(1000);
					
					//Select Reports
					
					driver.findElement(By.xpath("//span[@id='select2-report-container']")).click();
					WebElement assetSummary=driver.findElement(By.xpath("//input[@role='textbox']"));
					assetSummary.sendKeys("Asset Summary Report");
					assetSummary.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
                    //Select Financial Year
					
					driver.findElement(By.xpath("//span[@id='select2-p_financial_year_id-container']")).click();
					WebElement selectYear= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectYear.sendKeys("2020-2021");
					selectYear.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
				

					//Select Group
					
					driver.findElement(By.xpath("//span[@id='select2-p_asset_group_id-container']")).click();
					WebElement selectgroup= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectgroup.sendKeys("Computer & Network Equipment");
					selectgroup.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
                     //Generate Report
					
					driver.findElement(By.xpath("//button[normalize-space()='Generate Report']")).click();
					Thread.sleep(3000);
			
		}
		
		//Details History Report
		@Test
		
		public void DetailsHistoryReport() throws InterruptedException {
			
			
			//Click on Report

					driver.findElement(By.cssSelector("a[href='/report-generators']")).click();
					Thread.sleep(1000);
					
					//Select Reports
					
					driver.findElement(By.xpath("//span[@id='select2-report-container']")).click();
					WebElement detailHistory=driver.findElement(By.xpath("//input[@role='textbox']"));
					detailHistory.sendKeys("Details History Report");
					detailHistory.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
					
                    //Select Code
					
					driver.findElement(By.xpath("//span[@id='select2-asset_code-container']")).click();
					WebElement selectYear= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectYear.sendKeys("751837763");
					
					Thread.sleep(1000);

					selectYear.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
				

					//Select From Date
					
					driver.findElement(By.xpath("//input[@name='p_send_date_from']")).sendKeys("2019-01-30");
					Thread.sleep(1000);
			
					
					//Select To Date
					
					driver.findElement(By.xpath("//input[@name='p_send_date_to']")).sendKeys("2023-10-22");
					Thread.sleep(1000);
					
                    //Generate Report
					
					driver.findElement(By.xpath("//button[normalize-space()='Generate Report']")).click();
					Thread.sleep(3000);
					
			
		}
		
		
		//Status Wise Report
		@Test
		
		public void StatusWiseReport() throws InterruptedException {
			
			
			//Click on Report

					driver.findElement(By.cssSelector("a[href='/report-generators']")).click();
					Thread.sleep(1000);
					
					//Select Reports
					
					driver.findElement(By.xpath("//span[@id='select2-report-container']")).click();
					WebElement statusWise=driver.findElement(By.xpath("//input[@role='textbox']"));
					statusWise.sendKeys("Status Wise Report");
					statusWise.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
					//Select Status
					
					driver.findElement(By.xpath("//span[@id='select2-p_status_id-container']")).click();
					WebElement status= driver.findElement(By.xpath("//input[@role='textbox']"));
					status.sendKeys("Scrap");
					status.sendKeys(Keys.ENTER);
					Thread.sleep(1200);
					
					
                    //Generate Report
					
					driver.findElement(By.xpath("//button[normalize-space()='Generate Report']")).click();
					Thread.sleep(3000);
			
		}
		
		//Asset History Report
		@Test
		
		public void AssetHistoryReport() throws InterruptedException {
			
			
			//Click on Report

					driver.findElement(By.cssSelector("a[href='/report-generators']")).click();
					Thread.sleep(1000);
					
					//Select Reports
					
					driver.findElement(By.xpath("//span[@id='select2-report-container']")).click();
					WebElement assetHistory=driver.findElement(By.xpath("//input[@role='textbox']"));
					assetHistory.sendKeys("Asset History Report");
					assetHistory.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
					//Select Group
					
					driver.findElement(By.xpath("//span[@id='select2-p_group_id-container']")).click();
					WebElement selectgroup= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectgroup.sendKeys("Computer & Network Equipment");
					selectgroup.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					//Select SubGroup
					
					driver.findElement(By.xpath("//span[@id='select2-p_sub_gourp-container']")).click();
					WebElement selectSubgroup= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectSubgroup.sendKeys("Monitor");
					selectSubgroup.sendKeys(Keys.ENTER);

					Thread.sleep(1000);
					
					
					//Select Department
					
					driver.findElement(By.xpath("//span[@id='select2-p_dept_id-container']")).click();
					WebElement selectdept= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectdept.sendKeys("ADMINISTRATION DEPARTMENT");
					selectdept.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
                    //Generate Report
					
					driver.findElement(By.xpath("//button[normalize-space()='Generate Report']")).click();
					Thread.sleep(3000);
					
			
		}
		
		
		//Maintenance Details Report
		@Test
		
		public void MaintenanceDetailsReport() throws InterruptedException {
			
			
			//Click on Report

					driver.findElement(By.cssSelector("a[href='/report-generators']")).click();
					Thread.sleep(1000);
					
					//Select Reports
					
					driver.findElement(By.xpath("//span[@id='select2-report-container']")).click();
					WebElement maintenanceDetails=driver.findElement(By.xpath("//input[@role='textbox']"));
					maintenanceDetails.sendKeys("Maintenance Details Report");
					maintenanceDetails.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
					//Select maintenance Type
					
		            driver.findElement(By.xpath("//span[@id='select2-p_maintenance_type-container']")).click();
					WebElement selectgroup= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectgroup.sendKeys("ADHOC SCHEDULE SERVICE");
					selectgroup.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					//Select Asset Code
					
					driver.findElement(By.xpath("//span[@id='select2-asset_code-container']")).click();
					WebElement selectSubgroup= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectSubgroup.sendKeys("851838299");
					Thread.sleep(1000);

					selectSubgroup.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
					//Select Maintenance Status
					
					driver.findElement(By.xpath("//span[@id='select2-p_maintenance_status-container']")).click();
					WebElement selectdept= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectdept.sendKeys("Upcoming ");
					selectdept.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
                    //Select From Date
					
					driver.findElement(By.xpath("//input[@name='p_send_date_from']")).sendKeys("2019-01-30");
					Thread.sleep(1000);
			
					
					//Select To Date
					
					driver.findElement(By.xpath("//input[@name='p_send_date_to']")).sendKeys("2023-10-22");
					Thread.sleep(1000);
					
					
                    //Generate Report
					
					driver.findElement(By.xpath("//button[normalize-space()='Generate Report']")).click();
					Thread.sleep(6000);
					
			
		}
		
		//Maintenance Ledger Report
		@Test
		
		public void MaintenanceLedgerReport() throws InterruptedException {
			
			
			//Click on Report

					driver.findElement(By.cssSelector("a[href='/report-generators']")).click();
					Thread.sleep(1000);
					
					//Select Reports
					
					driver.findElement(By.xpath("//span[@id='select2-report-container']")).click();
					WebElement maintenanceLedger=driver.findElement(By.xpath("//input[@role='textbox']"));
					maintenanceLedger.sendKeys("Maintenance Ledger Report");
					maintenanceLedger.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
                    //Select Asset Code
					
					driver.findElement(By.xpath("//span[@id='select2-asset_code-container']")).click();
					WebElement selectSubgroup= driver.findElement(By.xpath("//input[@role='textbox']"));
					selectSubgroup.sendKeys("751837002");
					Thread.sleep(1000);

					selectSubgroup.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
                    //Generate Report
					
					driver.findElement(By.xpath("//button[normalize-space()='Generate Report']")).click();
					Thread.sleep(6000);
					
					
		}

}
