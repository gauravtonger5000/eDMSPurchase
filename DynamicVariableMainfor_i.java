package eDMS_PurchaseEntry;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

public class DynamicVariableMainfor_i {
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
	    public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://edmstest.infoman-edms.com/General/pgGLogin.aspx?LogOut=True");
	        driver.manage().window().maximize();
	        Login_Page login_page = new Login_Page(driver); // making an object of LoginPage class

	        login_page.login("admin@tmpl", "ADMIN@#"); // calling the method

	        Transaction_Page transaction = new Transaction_Page(driver);
	        transaction.clickTransaction();

	        PurchaseEntryUsingforloop_i purchase = new PurchaseEntryUsingforloop_i(driver);
	        purchase.clickOnPurchaseEntry();
	        driver.switchTo().frame("frmContent");
	        purchase.selectLoc();
	        Thread.sleep(2000);

	        File excelFile = new File("./Data/PurchaseEntry.xlsx");
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

	        File chassisFile3 = new File("./Data/ChassisEntries.xlsx");
	        FileInputStream chassisFis3 = new FileInputStream(chassisFile3);
	        Workbook chassisWorkbook3 = WorkbookFactory.create(chassisFis3);
	        Sheet chassisSheet3 = chassisWorkbook3.getSheet("Sheet1");

	        Integer[] index=new Integer[chassisSheet3.getLastRowNum()];
	        String model[] = new String[chassisSheet3.getLastRowNum()];
	        String subModel[] = new String[chassisSheet3.getLastRowNum()];
	        String color[] = new String[chassisSheet3.getLastRowNum()];
	        String chassisNo[] = new String[chassisSheet3.getLastRowNum()];
	        String engineNo[] = new String[chassisSheet3.getLastRowNum()];
	        String keyNo[] = new String[chassisSheet3.getLastRowNum()];
	        String receivedAT[] = new String[chassisSheet3.getLastRowNum()];
	        String remarks[] = new String[chassisSheet3.getLastRowNum()];
	        String status[] = new String[chassisSheet3.getLastRowNum()];
	        String purchase_price[] = new String[chassisSheet3.getLastRowNum()];
	        String dlr_vin_no[] = new String[chassisSheet3.getLastRowNum()];
	        String man_discount[] = new String[chassisSheet3.getLastRowNum()];
	        String emission[] = new String[chassisSheet3.getLastRowNum()];

	        for (int i = 0; i < chassisSheet3.getLastRowNum(); i++) {
	            Row chassisRow = chassisSheet3.getRow(i + 1); // Add 1 to start from the second row
	            
	            model[i] = getCellValueAsString(chassisRow.getCell(0));
	            subModel[i] = getCellValueAsString(chassisRow.getCell(1));
	            color[i] = getCellValueAsString(chassisRow.getCell(2));
	            chassisNo[i] = getCellValueAsString(chassisRow.getCell(3));
	            engineNo[i] = getCellValueAsString(chassisRow.getCell(4));
	            keyNo[i] = getCellValueAsString(chassisRow.getCell(5));
	            receivedAT[i] = getCellValueAsString(chassisRow.getCell(6));
	            remarks[i] = getCellValueAsString(chassisRow.getCell(7));
	            status[i] = getCellValueAsString(chassisRow.getCell(8));
	            purchase_price[i] = getCellValueAsString(chassisRow.getCell(9));
	            dlr_vin_no[i] = getCellValueAsString(chassisRow.getCell(10));
	            man_discount[i] = getCellValueAsString(chassisRow.getCell(11));
	            emission[i] = getCellValueAsString(chassisRow.getCell(12));
	            
	            switch (i) {
	            case 0:
	                purchase.ChassisEntry1(model[i], subModel[i], color[i], chassisNo[i], engineNo[i], keyNo[i], receivedAT[i], remarks[i], status[i], purchase_price[i], dlr_vin_no[i], man_discount[i], emission[i]);
	                System.out.println("A record is created with the chassis No: " + chassisNo[i]);
	                break;
	            case 1:
	                WebElement addNewButton = driver.findElement(By.id("ctl00_cpForm_btnAdd"));
	                addNewButton.click();
	                Thread.sleep(2000);
	                           
	            }
	            
	         }
	        
	        Thread.sleep(2000);

	        WebElement saveButton = driver.findElement(By.xpath("//input[@id=\"ctl00_cpForm_btnSubmit\"]"));
	        saveButton.click();
	        System.out.println("Clicked on Save button");

	        Thread.sleep(6000);
	        driver.switchTo().alert().accept();
	        Thread.sleep(3000);

	        driver.switchTo().parentFrame();
	        Logout_Page logout = new Logout_Page(driver);
	        logout.clicklogoutButton();
	        Thread.sleep(2000);
	        driver.close();
	        
	        }	        
}