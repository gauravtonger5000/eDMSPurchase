package eDMS_PurchaseEntry;

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

public class Main_DifferentMethodCallUsingSwitchStatement {
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
        Login_Page login_page = new Login_Page(driver); // making an object of LoginPage class

        login_page.login("admin@tmpl", "ADMIN@#"); // calling the method

        Transaction_Page transaction = new Transaction_Page(driver);
        transaction.clickTransaction();

        Purchase_Entry_Page_Final purchase = new Purchase_Entry_Page_Final(driver);
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

       // int numberOfIterations = 2; // Change this according to your requirement
        for (int i = 1; i <= chassisSheet3.getLastRowNum(); i++) {
            switch (i) {
                case 1:
                {
                    Row chassisrow1 = chassisSheet3.getRow(i);
                	String model = getCellValueAsString(chassisrow1.getCell(0));
                    String subModel = getCellValueAsString(chassisrow1.getCell(1));
                    String color = getCellValueAsString(chassisrow1.getCell(2));
                    String chassisNo = getCellValueAsString(chassisrow1.getCell(3));
                    String engineNo = getCellValueAsString(chassisrow1.getCell(4));
                    String keyNo = getCellValueAsString(chassisrow1.getCell(5));
                    String receivedAT = getCellValueAsString(chassisrow1.getCell(6));
                    String remarks = getCellValueAsString(chassisrow1.getCell(7));
                    String status = getCellValueAsString(chassisrow1.getCell(8));
                    String purchase_price = getCellValueAsString(chassisrow1.getCell(9));
                    String dlr_vin_no = getCellValueAsString(chassisrow1.getCell(10));
                    String man_discount = getCellValueAsString(chassisrow1.getCell(11));
                    String emission = getCellValueAsString(chassisrow1.getCell(12));


                	 purchase.ChassisEntry1(model, subModel, color, chassisNo, engineNo, keyNo, receivedAT, remarks,
                             status, purchase_price, dlr_vin_no, man_discount, emission);
                     System.out.println("A record is created with the chassis No :"+chassisNo);

                	 
                } break;
                case 2:
                		Thread.sleep(2000);
                		
                		WebElement addNewButton = driver.findElement(By.id("ctl00_cpForm_btnAdd"));
                		addNewButton.click();
                		Thread.sleep(2000);
                		
                	  Row chassisrow2 = chassisSheet3.getRow(i);
                      String model2 = getCellValueAsString(chassisrow2.getCell(0));
                      String subModel2 = getCellValueAsString(chassisrow2.getCell(1));
                      String color2 = getCellValueAsString(chassisrow2.getCell(2));
                      String chassisNo2 = getCellValueAsString(chassisrow2.getCell(3));
                      String engineNo2 = getCellValueAsString(chassisrow2.getCell(4));
                      String keyNo2 = getCellValueAsString(chassisrow2.getCell(5));
                      String receivedAT2 = getCellValueAsString(chassisrow2.getCell(6));
                      String remarks2 = getCellValueAsString(chassisrow2.getCell(7));
                      String status2 = getCellValueAsString(chassisrow2.getCell(8));
                      String purchase_price2 = getCellValueAsString(chassisrow2.getCell(9));
                      String dlr_vin_no2 = getCellValueAsString(chassisrow2.getCell(10));
                      String man_discount2 = getCellValueAsString(chassisrow2.getCell(11));
                      String emission2 = getCellValueAsString(chassisrow2.getCell(12));
                    purchase.ChassisEntry2(model2, subModel2, color2, chassisNo2, engineNo2, keyNo2, receivedAT2,
                            remarks2, status2, purchase_price2, dlr_vin_no2, man_discount2, emission2);
                    System.out.println("A record is created with the chassis No :"+chassisNo2);

                    break;
                default:
                    System.out.println("Invalid entry number: " + i);
                    break;
            }
        }

        Thread.sleep(2000);

        WebElement saveButton = driver.findElement(By.xpath("//input[@id=\"ctl00_cpForm_btnSubmit\"]"));
        saveButton.click();

        Thread.sleep(8000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        driver.switchTo().parentFrame();
        Logout_Page logout = new Logout_Page(driver);
        logout.clicklogoutButton();
        Thread.sleep(2000);
        driver.close();
    }
}
