package eDMS_PurchaseEntry;

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

public class Purchase_Entry_Page_Final {
	private static final String WebElement = null;

	WebDriver driver;
	
	By purchaseEntryField = By.xpath("//a[@id=\"TV1t1\"]");
	By locField = By.name("ctl00$cpForm$ddlOutletOL");
	By purchaseTypeField = By.id("ctl00_cpForm_ddlPurchaseType");
	By supplierField = By.id("ctl00_cpForm_ddlPurchasedFrom");
	By rec_DateField = By.id("ctl00_cpForm_txtReceiptDt");
	By InvoiceTextField=By.id("ctl00_cpForm_txtMfgInvNo");
	By GatePassField = By.id("ctl00_cpForm_txtGPNo");
	By invoiceDateField = By.id("ctl00_cpForm_txtMfrInvDt");
	By plantField=By.id("ctl00_cpForm_ddlPlantNo");
	By SelectFinancier=By.id("ctl00_cpForm_ddlFinancier");
	By mode =By.id("ctl00_cpForm_txtMode");
	By transporterField = By.id("ctl00_cpForm_txtTransName");
	By transporterRegistrationField=By.id("ctl00_cpForm_txtTransRegNo");
	By chassisPrefixField=By.id("ctl00_cpForm_txtChprefix");
	By eWayBillNoField=By.id("ctl00_cpForm_txtEWayBillNo");
	By eWayBillDateField=By.id("ctl00_cpForm_txtEWayBillDate");
	By placeOfSupplyField=By.id("ctl00_cpForm_ddlPOS");
	
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
	
	By saveButton=By.id("ctl00_cpForm_btnSubmit");
	
	
	public Purchase_Entry_Page_Final(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickOnPurchaseEntry() throws InterruptedException
	{
		driver.findElement(purchaseEntryField).click();
		Thread.sleep(2000);
	}
	
	public void selectLoc()
	{
		try {
		WebElement location = driver.findElement(locField);
		Select selectLoc = new Select(location);
	    selectLoc.selectByVisibleText("Greater Noida Showroom");
		}
		catch(StaleElementReferenceException e)
		{
			WebElement location = driver.findElement(locField);
			Select selectLoc = new Select(location);
		    selectLoc.selectByVisibleText("Greater Noida Showroom");
		}
	}
	
	public void selectPurchaseType(String purchaseType)
	{	
		try {
			WebElement type = driver.findElement(purchaseTypeField);
			Select sel = new Select(type);
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        sel.selectByVisibleText(purchaseType);
	    	}
	    catch (StaleElementReferenceException e) 
			{ 
	    	WebElement type = driver.findElement(purchaseTypeField);
	    	Select sel = new Select(type);
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        sel.selectByVisibleText(purchaseType);
			}
	}
	
	public void Selectsupplier(String supplier)
	{
		try {
		WebElement Selectsupplier = driver.findElement(supplierField);
		Select sup = new Select(Selectsupplier);
		sup.selectByVisibleText(supplier);
		}
	    catch (StaleElementReferenceException e) 
			{ 
	    	WebElement Selectsupplier = driver.findElement(supplierField);
			Select sup = new Select(Selectsupplier);
			sup.selectByVisibleText(supplier);	
			}
	}
	
	public void receiptDate(String date) throws InterruptedException
	{
		try {
		WebElement receipt_date = driver.findElement(rec_DateField);
		receipt_date.clear();
		receipt_date.sendKeys(date); 	
		Thread.sleep(2000);
		}
		catch(StaleElementReferenceException e)
		{
			WebElement receipt_date = driver.findElement(rec_DateField);
			receipt_date.clear();
			receipt_date.sendKeys(date); 	
			Thread.sleep(2000);
		}
	}
	
	public void invoiceFinNo(String invoice)
	{
		try {
		WebElement invoice_fin=driver.findElement(InvoiceTextField);
		invoice_fin.sendKeys(invoice);
		}
		catch(StaleElementReferenceException e)
		{
			WebElement invoice_fin=driver.findElement(InvoiceTextField);
			invoice_fin.sendKeys(invoice);
		}
	}

	public void gatePassNo(String gatepass) throws InterruptedException
	{
		try {
		WebElement gatepassno=driver.findElement(GatePassField);
		gatepassno.sendKeys(gatepass);
		}
		catch (StaleElementReferenceException e)
		{
			WebElement gatepassno=driver.findElement(GatePassField);
			gatepassno.sendKeys(gatepass);
		}
	}
	
	
	public void EnterinvoiceDate(String invoicedate) throws InterruptedException {
	    try {
	        WebElement invoice_date = driver.findElement(invoiceDateField);
	        invoice_date.clear();
	        invoice_date.sendKeys(invoicedate);
	        Thread.sleep(1000);
	    } catch (StaleElementReferenceException e) {
	    	WebElement invoice_date = driver.findElement(invoiceDateField);
	        invoice_date.clear();
	        invoice_date.sendKeys(invoicedate);
	        Thread.sleep(1000);
	    }
	}
	
	public void selectPlantNo(String plantno) throws InterruptedException
	{
		try {
		WebElement plant=driver.findElement(plantField);
		Select sc = new Select(plant);
	     sc.selectByVisibleText(plantno);
		//Thread.sleep(2000);
		}
		catch(StaleElementReferenceException e)
		{
			WebElement plant=driver.findElement(plantField);
			Select sc = new Select(plant);
		     sc.selectByVisibleText(plantno);
		//	Thread.sleep(2000);
		}

	       
	}
	
	 public void selectFinancier(String financier) throws InterruptedException {
	        try {
	            WebElement financierElement = driver.findElement(SelectFinancier);
	            Select fc = new Select(financierElement);
	            Thread.sleep(2000);
	            fc.selectByVisibleText(financier);
	        } catch (StaleElementReferenceException e) {
	            // If the element is stale, re-locate it and retry the action
	            WebElement financierElement = driver.findElement(SelectFinancier);
	            Select fc = new Select(financierElement);
	            Thread.sleep(2000);

	            fc.selectByVisibleText(financier);
	        }
	 }
	
	 public void mode_send_by(String sendBY) throws InterruptedException
	 {
		 try {
		 WebElement modeSend = driver.findElement(mode);
		 modeSend.sendKeys(sendBY);
		 }
		 catch(StaleElementReferenceException e)
		 {
			 WebElement modeSend = driver.findElement(mode);
			 modeSend.sendKeys(sendBY);
		 }
	 }
	 
	 public void transporter(String transporterName) throws InterruptedException
	 {
		 try {
			 WebElement transporter=driver.findElement(transporterField);
			 transporter.sendKeys(transporterName);
		 }
		 catch(StaleElementReferenceException e)
		 {
			 WebElement transporter=driver.findElement(transporterField);
			 transporter.sendKeys(transporterName);
		 }
	 }
	 public void transporterRegistrationNo(String transporterReg) throws InterruptedException
	 {
		 try {
			 WebElement  transporterRegistration=driver.findElement(transporterRegistrationField);
			 transporterRegistration.sendKeys(transporterReg);
		 }
		 catch(StaleElementReferenceException e)
		 {
			 WebElement  transporterRegistration=driver.findElement(transporterRegistrationField);
			 transporterRegistration.sendKeys(transporterReg);
		 }
	 }
	 
	 public void chassisPrefix(String chassis_prefix)
	 {
		 try {
			 WebElement chassisprefix=driver.findElement(chassisPrefixField);
			 chassisprefix.clear();
			 chassisprefix.sendKeys(chassis_prefix);
		 }
		 catch(StaleElementReferenceException e)
		 {
			 WebElement chassisprefix=driver.findElement(chassisPrefixField);
			 chassisprefix.clear();
			 chassisprefix.sendKeys(chassis_prefix);
		 }
	 }
	 
	 public void eWayBillNo(String eWay_bill_no)
	 {
		 try {
		 WebElement ewayBill=driver.findElement(eWayBillNoField);
		 ewayBill.sendKeys(eWay_bill_no);
		 }
		 catch(StaleElementReferenceException e)
		 {
			 WebElement ewayBill=driver.findElement(eWayBillNoField);
			 ewayBill.sendKeys(eWay_bill_no);

		 }
	 }
	 
	 public void eWayBillDate(String eWay_bill_date)
	 {
		 try {
			 WebElement eway_billDate=driver.findElement(eWayBillDateField);
			 eway_billDate.sendKeys(eWay_bill_date);
		 }
		 catch(StaleElementReferenceException e)
		 {
			 WebElement eway_billDate=driver.findElement(eWayBillDateField);
			 eway_billDate.sendKeys(eWay_bill_date);
		 }
	 }
	 
	 public void placeOfSupply(String placeofsupply) throws InterruptedException {
		 try {
			 WebElement place_of_supply=driver.findElement(placeOfSupplyField);
			 Select sp = new Select(place_of_supply);
			 sp.selectByVisibleText(placeofsupply);
			 Thread.sleep(2000);
		 }
		 catch(StaleElementReferenceException e)
		 {
			 WebElement place_of_supply=driver.findElement(placeOfSupplyField);
			 Select sp = new Select(place_of_supply);
			 sp.selectByVisibleText(placeofsupply);
			 Thread.sleep(2000);
		 }
	 }
	 
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
	            Thread.sleep(4000);
	            submodel.sendKeys(subModel);
	            Thread.sleep(2000);
	            
	      } catch (StaleElementReferenceException e) {
	    	  WebElement submodel = driver.findElement(subModelField);
	            submodel.click();
	            Thread.sleep(4000);
	            submodel.sendKeys(subModel);
	            Thread.sleep(2000);

	       }
	    }
	    public void color(String color) throws InterruptedException {
		       
		    try {
		    	WebElement colorElement = driver.findElement(colorField);
		        colorElement.click();
		        Thread.sleep(2000);
		       
		        colorElement.sendKeys(color);
		    } catch (StaleElementReferenceException e) {
		    	WebElement colorElement = driver.findElement(colorField);
		        colorElement.click(); 
		        Thread.sleep(2000);
		        colorElement.sendKeys(color);
		       }
		    }

	    public void chassis_no(String chassisNo) throws InterruptedException {
	        WebElement chassis = driver.findElement(chassisNoField);
	        chassis.sendKeys(chassisNo);
	     
	    }
	   
	    
	    public void engine_no(String engineNo) throws InterruptedException {
	        try {
	        	
	            WebElement engineNoElement = driver.findElement(EngineNoField);
	            engineNoElement.click();
	            engineNoElement.sendKeys(engineNo);
	            // Further actions after entering engine number
	       }  catch (StaleElementReferenceException e)
	        {    
	        	WebElement engineNoElement = driver.findElement(EngineNoField);
	            engineNoElement.click();
	            engineNoElement.sendKeys(engineNo);	       
	    	}
	    }
	    
	   	    
	    public void key_no(String keyNo) throws InterruptedException {
	        WebElement keyNum = driver.findElement(keyNoField);
	     //   Thread.sleep(3000);
	        keyNum.sendKeys(keyNo);
	        // Further actions after entering key number
	    }
		 public void Received_At(String receivedAT) throws InterruptedException
	 {
		 WebElement received__at=driver.findElement(ReceivedAtField);
		 Select ra = new Select(received__at);
		 ra.selectByVisibleText(receivedAT);
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
	 
	    } catch (StaleElementReferenceException e) {	    	
	    	 WebElement dlr = driver.findElement(DlrVinNoField);
			 dlr.click();
			 Thread.sleep(1000);
			 dlr.sendKeys(dlr_vin_no);
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
	 
	 
			
	 public void purchaseEntry(String purchaseType,String supplier,String date,String invoice,String gatepass,String invoicedate,String plantno,String financier,String sendBY,String transporterName,String transporterReg,String chassis_prefix,String eWay_bill_no,String eWay_bill_date,String placeofsupply)  throws InterruptedException

	 {
		selectPurchaseType(purchaseType);	
		Selectsupplier(supplier);
		receiptDate(date);
		invoiceFinNo(invoice);
		gatePassNo(gatepass);
		EnterinvoiceDate(invoicedate);
		selectPlantNo(plantno);
		selectFinancier(financier);
		mode_send_by(sendBY);
		transporter(transporterName);
		transporterRegistrationNo(transporterReg);
		chassisPrefix(chassis_prefix);
		eWayBillNo(eWay_bill_no);
		eWayBillDate(eWay_bill_date);
		placeOfSupply(placeofsupply);	
	    	
	}
	 
	public void ChassisEntry1(String model,String subModel,String color,String chassisNo, String engineNo,String keyNo,String receivedAT, String remarks, String status, String purchase_price,
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
	
	public void selectModel2(String model2) throws InterruptedException {
		 try {
	        WebElement selectModel2 = driver.findElement(modelField2);
	        selectModel2.sendKeys(model2);
	      
		 }
		 catch(StaleElementReferenceException e)
		 {
			  WebElement selectModel2 = driver.findElement(modelField2);
		        selectModel2.sendKeys(model2);
		 }
	    }
	        
	    public void sub_model2(String subModel2) throws InterruptedException {
	      try {
	    	  	
	            WebElement submodel2 = driver.findElement(subModelField2);
	            submodel2.click();
	            Thread.sleep(2000);
	            submodel2.sendKeys(subModel2);
	            
	      } catch (StaleElementReferenceException e) {
	    	  WebElement submodel2 = driver.findElement(subModelField2);
	            submodel2.click();
	            Thread.sleep(2000);
	            submodel2.sendKeys(subModel2);
	       }
	    }
	    public void color2(String color2) throws InterruptedException {
		       
		    try {
		    	WebElement colorElement2 = driver.findElement(colorField2);
		        colorElement2.click();
		        Thread.sleep(4000);
		        colorElement2.click();

		        colorElement2.sendKeys(color2);
		    } catch (StaleElementReferenceException e) {
		    	WebElement colorElement2 = driver.findElement(colorField2);
		        colorElement2.click(); 
		        Thread.sleep(4000);
		        colorElement2.sendKeys(color2);
		       }
		    }

	    public void chassis_no2(String chassisNo2) throws InterruptedException {
	        WebElement chassis2 = driver.findElement(chassisNoField2);
	        chassis2.sendKeys(chassisNo2);
	     
	    }
	   
	    
	    public void engine_no2(String engineNo2) throws InterruptedException {
	        try {
	        	
	            WebElement engineNoElement2 = driver.findElement(EngineNoField2);
	         
	            engineNoElement2.sendKeys(engineNo2);
	       }  catch (StaleElementReferenceException e)
	        {    
	        	WebElement engineNoElement2 = driver.findElement(EngineNoField2);
	            engineNoElement2.sendKeys(engineNo2);	       
	    	}
	    }
	    
	   	    
	    public void key_no2(String keyNo2) throws InterruptedException {
	        WebElement keyNum2 = driver.findElement(keyNoField2);
	     //   Thread.sleep(3000);
	        keyNum2.sendKeys(keyNo2);
	        Thread.sleep(2000);
	        // Further actions after entering key number
	    }
		 public void Received_At2(String receivedAT2) throws InterruptedException
	 {
		 WebElement received__at=driver.findElement(ReceivedAtField2);
		 Select ra2 = new Select(received__at);
		 ra2.selectByVisibleText(receivedAT2);
		 Thread.sleep(2000);
	 }
	 
	 public void setRemarks2(String remarks2)
	 {
		 WebElement remarks1=driver.findElement(remarksField2);
		 remarks1.sendKeys(remarks2);
	 }
	 
	 public void selectStatus2(String status2) throws InterruptedException {
		 WebElement select_status2=driver.findElement(statusField2);
		 Select status1 = new Select(select_status2);
		 status1.selectByVisibleText(status2); 
		 Thread.sleep(2000);
	 }
	 
	 public void purchasePrice2(String purchase_price2) {
		 WebElement pur2 = driver.findElement(purchasePriceField2);
		 pur2.sendKeys(purchase_price2);
	 }	 
	 
	 public void dlrVinNo2(String dlr_vin_no2) throws InterruptedException
	 {
	       try {
		 
		 WebElement dlr2 = driver.findElement(DlrVinNoField2);
		 dlr2.click();
		 Thread.sleep(1000);
		 dlr2.sendKeys(dlr_vin_no2);
		 Thread.sleep(1000);
	 
	    } catch (StaleElementReferenceException e) {	    	
	    	 WebElement dlr2 = driver.findElement(DlrVinNoField2);
			 dlr2.click();
			 Thread.sleep(1000);
			 dlr2.sendKeys(dlr_vin_no2);
			 Thread.sleep(1000);
	       } 
	       }
	    
	 public void manufacturerDiscount2(String man_discount2) throws InterruptedException {
		 WebElement md2 = driver.findElement(discountField2);
		 md2.click();
		 Thread.sleep(2000);
		 md2.sendKeys(man_discount2);
		// Thread.sleep(2000);

	 }
	 
	 public void selectEmission2(String emission2) throws InterruptedException {
		 WebElement emis2 = driver.findElement(emissionField2);
		Select se2 = new Select(emis2);
		Thread.sleep(2000);
		se2.selectByVisibleText(emission2);
	 }
	 
	 	

	public void ChassisEntry2(String model2,String subModel2,String color2,String chassisNo2, String engineNo2,String keyNo2,String receivedAT2, String remarks2, String status2, String purchase_price2,
       String dlr_vin_no2, String man_discount2, String emission2)  throws InterruptedException
	{
		selectModel2(model2);
		sub_model2(subModel2);
		color2(color2);
		chassis_no2(chassisNo2);
		engine_no2(engineNo2);
		key_no2(keyNo2);
		Received_At2(receivedAT2);
		setRemarks2(remarks2);
		selectStatus2(status2);
		purchasePrice2(purchase_price2);
	    dlrVinNo2(dlr_vin_no2);
	    manufacturerDiscount2(man_discount2);
	    selectEmission2(emission2);    			
	}
	    
}
