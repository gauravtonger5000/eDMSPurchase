package Page_Object_Model_Purchase_Entry_Page;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChassisEntry1 {

		WebDriver driver;

		public ChassisEntry1(WebDriver driver) {
			this.driver = driver;
		}
		
		By modelField=By.id("ctl00_cpForm_grdStock_ctl02_txtModel");
		By chassisNoField=By.id("ctl00_cpForm_grdStock_ctl02_txtChassisNo");
		By subModelField=By.id("ctl00_cpForm_grdStock_ctl02_txtSubModel");
		By EngineNoField=By.id("ctl00_cpForm_grdStock_ctl02_txtEngineNo");
		By colorField=By.id("ctl00_cpForm_grdStock_ctl02_txtColor");
		By keyNoField=By.id("ctl00_cpForm_grdStock_ctl02_txtKeyNo");
		By ReceivedAtField=By.id("ctl00_cpForm_grdStock_ctl02_ddlReceivedAt");
		By remarksField=By.id("ctl00_cpForm_grdStock_ctl02_txtRemarks");
		By statusField=By.id("ctl00_cpForm_grdStock_ctl02_ddlStatus");
		By purchasePriceField=By.id("ctl00_cpForm_grdStock_ctl02_txtPurPrice");
		By DlrVinNoField=By.id("ctl00_cpForm_grdStock_ctl02_txtDlrVinNo");
		By discountField=By.id("ctl00_cpForm_grdStock_ctl02_txtManufDisc");
		By emissionField=By.id("ctl00_cpForm_grdStock_ctl02_ddlAddEmission");

			 public void selectModel(String model) throws InterruptedException {
			 try {
		        WebElement selectModel = driver.findElement(modelField);
		        selectModel.sendKeys(model);
		       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		       // wait.until(ExpectedConditions.attributeToBeNotEmpty(selectModel, "value"));
			 }
			 catch(StaleElementReferenceException e)
			 {
				  WebElement selectModel = driver.findElement(modelField);
			        selectModel.sendKeys(model);
			 }
		    }
		    
		   
		  
		    
		    public void sub_model(String subModel) throws InterruptedException {
		      try {
		    	  	
		            WebElement submodel = driver.findElement(subModelField);
		            submodel.click();
		            Thread.sleep(2000);
		            submodel.sendKeys(subModel);
		            
		      } catch (StaleElementReferenceException e) {
		    	  WebElement submodel = driver.findElement(subModelField);
		            submodel.click();
		            Thread.sleep(2000);
		            submodel.sendKeys(subModel);
		       }
		    }
		    public void color(String color) throws InterruptedException {
			       
			    try {
			    	WebElement colorElement = driver.findElement(colorField);
			        colorElement.click();
			        Thread.sleep(4000);
			        colorElement.click();

			        colorElement.sendKeys(color);
			    } catch (StaleElementReferenceException e) {
			    	WebElement colorElement = driver.findElement(colorField);
			        colorElement.click(); 
			        Thread.sleep(4000);
			        colorElement.sendKeys(color);
			       }
			    }

		    public void chassis_no(String chassisNo) throws InterruptedException {
		        WebElement chassis = driver.findElement(chassisNoField);
		        chassis.click();
		        Thread.sleep(2000);
		        chassis.click();
		        chassis.sendKeys(chassisNo);
		     
		    }
		   
		    
		    public void engine_no(String engineNo) throws InterruptedException {
		        try {
		        	
		            WebElement engineNoElement = driver.findElement(EngineNoField);
		            engineNoElement.click();
		            Thread.sleep(1000);
		            engineNoElement.sendKeys(engineNo);
		            // Further actions after entering engine number
		       }  catch (StaleElementReferenceException e)
		        {    
		        	WebElement engineNoElement = driver.findElement(EngineNoField);
		            engineNoElement.click();
		            Thread.sleep(1000);
		            engineNoElement.sendKeys(engineNo);	       
		    	}
		    }
		    
		   	    
		    public void key_no(String keyNo) throws InterruptedException {
		        WebElement keyNum = driver.findElement(keyNoField);
		     //   Thread.sleep(3000);
		        keyNum.sendKeys(keyNo);
		        Thread.sleep(2000);
		        // Further actions after entering key number
		    }
			 public void Received_At(String receivedAT) throws InterruptedException
		 {
			 WebElement received__at=driver.findElement(ReceivedAtField);
			 Select ra = new Select(received__at);
			 ra.selectByVisibleText(receivedAT);
			 Thread.sleep(2000);
		 }
		 
		 public void setRemarks(String remarks)
		 {
			 WebElement remarks1=driver.findElement(remarksField);
			 remarks1.sendKeys(remarks);
		 }
		 
		 public void selectStatus(String status) throws InterruptedException {
			 WebElement select_status=driver.findElement(statusField);
			 Select status1 = new Select(select_status);
			 status1.selectByVisibleText(status); 
			 Thread.sleep(2000);
		 }
		 
		 public void purchasePrice(String purchase_price) {
			 WebElement pur = driver.findElement(purchasePriceField);
			 pur.sendKeys(purchase_price);
		 }	 
		 
		 public void dlrVinNo(String dlr_vin_no) throws InterruptedException
		 {
		       try {
			 
			 WebElement dlr = driver.findElement(DlrVinNoField);
			 dlr.click();
			 Thread.sleep(1000);
			 dlr.sendKeys(dlr_vin_no);
			 Thread.sleep(1000);
		 
		    } catch (StaleElementReferenceException e) {	    	
		    	 WebElement dlr = driver.findElement(DlrVinNoField);
				 dlr.click();
				 Thread.sleep(1000);
				 dlr.sendKeys(dlr_vin_no);
				 Thread.sleep(1000);
		       } 
		       }
		    
		 public void manufacturerDiscount(String man_discount) throws InterruptedException {
			 WebElement md = driver.findElement(discountField);
			 md.click();
			 Thread.sleep(2000);
			 md.sendKeys(man_discount);
			// Thread.sleep(2000);

		 }
		 
		 public void selectEmission(String emission) throws InterruptedException {
			 WebElement emis = driver.findElement(emissionField);
			Select se = new Select(emis);
			Thread.sleep(2000);
			se.selectByVisibleText(emission);
		 }
		 
		 
		
		public void ChassisEntry(String model,String subModel,String color,String chassisNo, String engineNo,String keyNo,String receivedAT, String remarks, String status, String purchase_price,
	        String dlr_vin_no, String man_discount, String emission)  throws InterruptedException
		{
			selectModel(model);
			sub_model(subModel);
			color(color);
			chassis_no(chassisNo);
			engine_no(engineNo);
			key_no(keyNo);
			Received_At(receivedAT);
			setRemarks(remarks);
			selectStatus(status);
			purchasePrice(purchase_price);
		    dlrVinNo(dlr_vin_no);
		    manufacturerDiscount(man_discount);
		    selectEmission(emission);    			
		}
		    
}
