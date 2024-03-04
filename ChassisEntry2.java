package Page_Object_Model_Purchase_Entry_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ChassisEntry2 {
	
	private static final String WebElement = null;
	
	WebDriver driver;

	By modelField2=By.id("ctl00_cpForm_grdStock_ctl03_txtModel");
	By chassisNoField2=By.id("ctl00_cpForm_grdStock_ctl03_txtChassisNo");
	By subModelField2=By.id("ctl00_cpForm_grdStock_ctl03_txtSubModel");
	By EngineNoField2=By.id("ctl00_cpForm_grdStock_ctl03_txtEngineNo");
	By colorField2=By.id("ctl00_cpForm_grdStock_ctl03_txtColor");
	By keyNoField2=By.id("ctl00_cpForm_grdStock_ctl03_txtKeyNo");
	By ReceivedAtField2=By.id("ctl00_cpForm_grdStock_ctl03_ddlReceivedAt");
	By remarksField2=By.id("ctl00_cpForm_grdStock_ctl03_txtRemarks");
	By statusField2=By.id("ctl00_cpForm_grdStock_ctl03_ddlStatus");
	By purchasePriceField2=By.id("ctl00_cpForm_grdStock_ctl03_txtPurPrice");
	By DlrVinNoField2=By.id("ctl00_cpForm_grdStock_ctl03_txtDlrVinNo");
	By discountField2=By.id("ctl00_cpForm_grdStock_ctl03_txtManufDisc");
	By emissionField2=By.id("ctl00_cpForm_grdStock_ctl03_ddlAddEmission");
	
	public ChassisEntry2(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void selectModel2(String model) throws InterruptedException {
		 try {
	        WebElement selectModel2 = driver.findElement(modelField2);
	        selectModel2.sendKeys(model);
	      
		 }
		 catch(StaleElementReferenceException e)
		 {
			  WebElement selectModel2 = driver.findElement(modelField2);
		        selectModel2.sendKeys(model);
		 }
	    }
	        
	    public void sub_model2(String subModel) throws InterruptedException {
	      try {
	    	  	
	            WebElement submodel2 = driver.findElement(subModelField2);
	            submodel2.click();
	            Thread.sleep(2000);
	            submodel2.sendKeys(subModel);
	            
	      } catch (StaleElementReferenceException e) {
	    	  WebElement submodel2 = driver.findElement(subModelField2);
	            submodel2.click();
	            Thread.sleep(2000);
	            submodel2.sendKeys(subModel);
	       }
	    }
	    public void color2(String color) throws InterruptedException {
		       
		    try {
		    	WebElement colorElement2 = driver.findElement(colorField2);
		        colorElement2.click();
		        Thread.sleep(4000);
		        colorElement2.click();

		        colorElement2.sendKeys(color);
		    } catch (StaleElementReferenceException e) {
		    	WebElement colorElement2 = driver.findElement(colorField2);
		        colorElement2.click(); 
		        Thread.sleep(4000);
		        colorElement2.sendKeys(color);
		       }
		    }

	    public void chassis_no2(String chassisNo) throws InterruptedException {
	        WebElement chassis2 = driver.findElement(chassisNoField2);
	        chassis2.click();
	        Thread.sleep(2000);
	        chassis2.click();
	        chassis2.sendKeys(chassisNo);
	     
	    }
	   
	    
	    public void engine_no2(String engineNo) throws InterruptedException {
	        try {
	        	
	            WebElement engineNoElement2 = driver.findElement(EngineNoField2);
	            engineNoElement2.click();
	            Thread.sleep(1000);
	            engineNoElement2.sendKeys(engineNo);
	            // Further actions after entering engine number
	       }  catch (StaleElementReferenceException e)
	        {    
	        	WebElement engineNoElement2 = driver.findElement(EngineNoField2);
	            engineNoElement2.click();
	            Thread.sleep(1000);
	            engineNoElement2.sendKeys(engineNo);	       
	    	}
	    }
	    
	   	    
	    public void key_no2(String keyNo) throws InterruptedException {
	        WebElement keyNum2 = driver.findElement(keyNoField2);
	     //   Thread.sleep(3000);
	        keyNum2.sendKeys(keyNo);
	        Thread.sleep(2000);
	        // Further actions after entering key number
	    }
		 public void Received_At2(String receivedAT) throws InterruptedException
	 {
		 WebElement received__at=driver.findElement(ReceivedAtField2);
		 Select ra2 = new Select(received__at);
		 ra2.selectByVisibleText(receivedAT);
		 Thread.sleep(2000);
	 }
	 
	 public void setRemarks2(String remarks)
	 {
		 WebElement remarks1=driver.findElement(remarksField2);
		 remarks1.sendKeys(remarks);
	 }
	 
	 public void selectStatus2(String status) throws InterruptedException {
		 WebElement select_status2=driver.findElement(statusField2);
		 Select status1 = new Select(select_status2);
		 status1.selectByVisibleText(status); 
		 Thread.sleep(2000);
	 }
	 
	 public void purchasePrice2(String purchase_price) {
		 WebElement pur2 = driver.findElement(purchasePriceField2);
		 pur2.sendKeys(purchase_price);
	 }	 
	 
	 public void dlrVinNo2(String dlr_vin_no) throws InterruptedException
	 {
	       try {
		 
		 WebElement dlr2 = driver.findElement(DlrVinNoField2);
		 dlr2.click();
		 Thread.sleep(1000);
		 dlr2.sendKeys(dlr_vin_no);
		 Thread.sleep(1000);
	 
	    } catch (StaleElementReferenceException e) {	    	
	    	 WebElement dlr2 = driver.findElement(DlrVinNoField2);
			 dlr2.click();
			 Thread.sleep(1000);
			 dlr2.sendKeys(dlr_vin_no);
			 Thread.sleep(1000);
	       } 
	       }
	    
	 public void manufacturerDiscount2(String man_discount) throws InterruptedException {
		 WebElement md2 = driver.findElement(discountField2);
		 md2.click();
		 Thread.sleep(2000);
		 md2.sendKeys(man_discount);
		// Thread.sleep(2000);

	 }
	 
	 public void selectEmission2(String emission) throws InterruptedException {
		 WebElement emis2 = driver.findElement(emissionField2);
		Select se2 = new Select(emis2);
		Thread.sleep(2000);
		se2.selectByVisibleText(emission);
	 }
	 
	 
			

	public void ChassisEntry(String model,String subModel,String color,String chassisNo, String engineNo,String keyNo,String receivedAT, String remarks, String status, String purchase_price,
       String dlr_vin_no, String man_discount, String emission)  throws InterruptedException
	{
		selectModel2(model);
		sub_model2(subModel);
		color2(color);
		chassis_no2(chassisNo);
		engine_no2(engineNo);
		key_no2(keyNo);
		Received_At2(receivedAT);
		setRemarks2(remarks);
		selectStatus2(status);
		purchasePrice2(purchase_price);
	    dlrVinNo2(dlr_vin_no);
	    manufacturerDiscount2(man_discount);
	    selectEmission2(emission);    			
	}
}
