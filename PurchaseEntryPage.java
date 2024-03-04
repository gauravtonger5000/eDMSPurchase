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

public class PurchaseEntryPage {
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
	
	By saveButton=By.id("ctl00_cpForm_btnSubmit");
	
	
	public PurchaseEntryPage(WebDriver driver)
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
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        sel.selectByVisibleText(purchaseType);
	    	}
	    catch (StaleElementReferenceException e) 
			{ 
	    	WebElement type = driver.findElement(purchaseTypeField);
	    	Select sel = new Select(type);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
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
		WebElement receipt_date = driver.findElement(rec_DateField);
		receipt_date.clear();
		receipt_date.sendKeys(date); 	
		Thread.sleep(2000);

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
		Thread.sleep(2000);
		}
		catch (StaleElementReferenceException e)
		{
			WebElement gatepassno=driver.findElement(GatePassField);
			gatepassno.sendKeys(gatepass);
			Thread.sleep(2000);
		}
	}
	
	
	public void EnterinvoiceDate(String invoicedate) throws InterruptedException {
	    try {
	        WebElement invoice_date = driver.findElement(invoiceDateField);
	        invoice_date.clear();
	        invoice_date.sendKeys(invoicedate);
	        Thread.sleep(2000);
	    } catch (StaleElementReferenceException e) {
	        // Handle the StaleElementReferenceException here
	        // For example, you can reattempt to find the element or log the exception
	        System.out.println("StaleElementReferenceException occurred: " + e.getMessage());
	        // You can retry finding the element or take any other appropriate action
	    }
	}
	
	public void selectPlantNo(String plantno) throws InterruptedException
	{
		try {
		WebElement plant=driver.findElement(plantField);
		Select sc = new Select(plant);
	     sc.selectByVisibleText(plantno);
		Thread.sleep(2000);
		}
		catch(StaleElementReferenceException e)
		{
			WebElement plant=driver.findElement(plantField);
			Select sc = new Select(plant);
		     sc.selectByVisibleText(plantno);
			Thread.sleep(2000);
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
	    
}
