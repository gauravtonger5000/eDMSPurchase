package Page_Object_Model_Purchase_Entry_Page;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainForLoopExcel {
	public static String getCellValueAsString(Cell cell) {
        String cellValue = "";
        if (cell != null) {
            switch (cell.getCellType()) {
                case STRING:
                    cellValue = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    // Check if the numeric value is an integer
                    if (cell.getNumericCellValue() == (int) cell.getNumericCellValue()) {
                        cellValue = String.valueOf((int) cell.getNumericCellValue());
                    } else {
                        // If it's not an integer, treat it as a string
                        cellValue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
            }
        }
        return cellValue;
    }
	
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://edmstest.infoman-edms.com/General/pgGLogin.aspx?LogOut=True");
	driver.manage().window().maximize();
	LoginPage login_page = new LoginPage(driver); // making an object of LoginPage class
	
	login_page.login("admin@tmpl", "ADMIN@#"); //calling the method
	
	TransactionPage transaction = new TransactionPage(driver);
	transaction.clickTransaction();
	
	PurchaseEntryPage purchase = new PurchaseEntryPage(driver);
	
	purchase.clickOnPurchaseEntry();
    driver.switchTo().frame("frmContent");
	purchase.selectLoc();
	Thread.sleep(2000);
	
	
	File excelFile = new File("./Data/PurchaseDetails.xlsx");
	FileInputStream fis = new FileInputStream(excelFile);	
	Workbook workbook = WorkbookFactory.create(fis);	
	Sheet sheet = workbook.getSheet("Sheet1");	
		Row row = sheet.getRow(1);
        String purchaseType = getCellValueAsString(row.getCell(0));
        String supplier = getCellValueAsString(row.getCell(1));
        String date = getCellValueAsString(row.getCell(2));
        String invoice = getCellValueAsString(row.getCell(3));
        String gatepass = getCellValueAsString(row.getCell(4));
        String invoiceDate = getCellValueAsString(row.getCell(5));
        String plantNo = getCellValueAsString(row.getCell(6));
        String financier = getCellValueAsString(row.getCell(7));
        String sendBY = getCellValueAsString(row.getCell(8));
        String transporterName = getCellValueAsString(row.getCell(9));
        String transporterReg = getCellValueAsString(row.getCell(10));
        String chassis_prefix = getCellValueAsString(row.getCell(11));
        String eWay_bill_no = getCellValueAsString(row.getCell(12));
        String eWay_bill_date = getCellValueAsString(row.getCell(13));
        String placeofsupply = getCellValueAsString(row.getCell(14));
        

        
        purchase.purchaseEntry(purchaseType, supplier, date, invoice, gatepass, invoiceDate, plantNo, financier,
    	                    sendBY, transporterName, transporterReg, chassis_prefix, eWay_bill_no, eWay_bill_date,
    	                    placeofsupply); 
	

        ChassisEntry1 ce1 = new ChassisEntry1(driver);
        File excelFile2 = new File("./Data/ChassisDetails.xlsx");
        FileInputStream fis2 = new FileInputStream(excelFile2);	
        Workbook workbook2 = WorkbookFactory.create(fis2);	
        Sheet sheet2 = workbook2.getSheet("Sheet1");
        for(int i=1 ; i<=sheet2.getLastRowNum() ; i++)
        {
        	Row row2 = sheet2.getRow(i);
        	String model = getCellValueAsString(row2.getCell(0));
        	String subModel = getCellValueAsString(row2.getCell(1));
        	String color = getCellValueAsString(row2.getCell(2));
        	String chassisNo = getCellValueAsString(row2.getCell(3));
        	String engineNo = getCellValueAsString(row2.getCell(4));
        	String keyNo = getCellValueAsString(row2.getCell(5));
        	String receivedAT = getCellValueAsString(row2.getCell(6));
        	String remarks = getCellValueAsString(row2.getCell(7));
        	String status = getCellValueAsString(row2.getCell(8));
        	String purchase_price = getCellValueAsString(row2.getCell(9));
        	String dlr_vin_no = getCellValueAsString(row2.getCell(10));
        	String man_discount = getCellValueAsString(row2.getCell(11));
        	String emission = getCellValueAsString(row2.getCell(12));
        	 
        	ce1.ChassisEntry(model, subModel, color, chassisNo, engineNo, keyNo, receivedAT, remarks, status, purchase_price, dlr_vin_no, man_discount, emission);

        	WebElement addNew = driver.findElement(By.xpath("//input[@id=\"ctl00_cpForm_btnAdd\"]"));
        	addNew.click();
        	           
        	System.out.println("A record is created with the chassis No :" +chassisNo);
	}
    		WebElement saveButton = driver.findElement(By.xpath("//input[@id=\"ctl00_cpForm_btnSubmit\"]"));
    	    saveButton.click();

    	    Thread.sleep(6000);
    	    driver.switchTo().alert().accept();
    	    Thread.sleep(3000);
    	    	  
    	driver.switchTo().parentFrame();
		LogoutPage logout = new LogoutPage(driver);
		logout.clicklogoutButton();
		Thread.sleep(2000);
		driver.close();
}
}
