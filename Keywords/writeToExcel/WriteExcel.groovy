package writeToExcel;
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell

import org.apache.poi.ss.usermodel.Row

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcel {

	@Keyword

	def void writeToExcel(int iRow, int iCell, String iText ){

		FileInputStream file = new FileInputStream (new File("C:\\Katalon\\Excel Files\\Stored Variable.xlsx"))

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1")

		//Write data to excel’

		Row oRow;

		oRow = sheet.getRow(iRow);

		if(oRow == null){

			sheet.createRow(iRow);

			oRow = sheet.getRow(iRow);

		}

		Cell oCell;

		oCell = oRow.getCell(iCell - 1);

		if(oCell == null ){

			oRow.createCell(iCell - 1);

			oCell = oRow.getCell(iCell - 1);

		}

		oCell.setCellValue(iText);

		FileOutputStream outFile =new FileOutputStream(new File("C:\\Katalon\\Excel Files\\Stored Variable.xlsx"));

		workbook.write(outFile);

		outFile.close();

	}

}

public class welcomeMail {

	@Keyword

	def void getwelcomeMail(int iRow, int iCell, String iText ){

		FileInputStream file = new FileInputStream (new File("C:\\Katalon\\Excel Files\\EDMs\\welcomemail.xlsx"))

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1")

		//Write data to excel’

		Row oRow;

		oRow = sheet.getRow(iRow);

		if(oRow == null){

			sheet.createRow(iRow);

			oRow = sheet.getRow(iRow);

		}

		Cell oCell;

		oCell = oRow.getCell(iCell - 1);

		if(oCell == null ){

			oRow.createCell(iCell - 1);

			oCell = oRow.getCell(iCell - 1);

		}

		oCell.setCellValue(iText);

		FileOutputStream outFile =new FileOutputStream(new File("C:\\Katalon\\Excel Files\\EDMs\\welcomemail.xlsx"));

		workbook.write(outFile);

		outFile.close();

	}

}

public class startselling {

	@Keyword

	def void getstartSelling(int iRow, int iCell, String iText ){

		FileInputStream file = new FileInputStream (new File("C:\\Katalon\\Excel Files\\EDMs\\startselling.xlsx"))

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1")

		//Write data to excel’

		Row oRow;

		oRow = sheet.getRow(iRow);

		if(oRow == null){

			sheet.createRow(iRow);

			oRow = sheet.getRow(iRow);

		}

		Cell oCell;

		oCell = oRow.getCell(iCell - 1);

		if(oCell == null ){

			oRow.createCell(iCell - 1);

			oCell = oRow.getCell(iCell - 1);

		}

		oCell.setCellValue(iText);

		FileOutputStream outFile =new FileOutputStream(new File("C:\\Katalon\\Excel Files\\EDMs\\startselling.xlsx"));

		workbook.write(outFile);

		outFile.close();

	}

}

public class accountsuspended {

	@Keyword

	def void getaccountSuspended(int iRow, int iCell, String iText ){

		FileInputStream file = new FileInputStream (new File("C:\\Katalon\\Excel Files\\EDMs\\accountsuspended.xlsx"))

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1")

		//Write data to excel’

		Row oRow;

		oRow = sheet.getRow(iRow);

		if(oRow == null){

			sheet.createRow(iRow);

			oRow = sheet.getRow(iRow);

		}

		Cell oCell;

		oCell = oRow.getCell(iCell - 1);

		if(oCell == null ){

			oRow.createCell(iCell - 1);

			oCell = oRow.getCell(iCell - 1);

		}

		oCell.setCellValue(iText);

		FileOutputStream outFile =new FileOutputStream(new File("C:\\Katalon\\Excel Files\\EDMs\\accountsuspended.xlsx"));

		workbook.write(outFile);

		outFile.close();

	}

}

public class resetpassword {

	@Keyword

	def void getresetPassword(int iRow, int iCell, String iText ){

		FileInputStream file = new FileInputStream (new File("C:\\Katalon\\Excel Files\\EDMs\\resetpassword.xlsx"))

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1")

		//Write data to excel’

		Row oRow;

		oRow = sheet.getRow(iRow);

		if(oRow == null){

			sheet.createRow(iRow);

			oRow = sheet.getRow(iRow);

		}

		Cell oCell;

		oCell = oRow.getCell(iCell - 1);

		if(oCell == null ){

			oRow.createCell(iCell - 1);

			oCell = oRow.getCell(iCell - 1);

		}

		oCell.setCellValue(iText);

		FileOutputStream outFile =new FileOutputStream(new File("C:\\Katalon\\Excel Files\\EDMs\\resetpassword.xlsx"));

		workbook.write(outFile);

		outFile.close();

	}

}

public class neworder {

	@Keyword

	def void getnewOrder(int iRow, int iCell, String iText ){

		FileInputStream file = new FileInputStream (new File("C:\\Katalon\\Excel Files\\EDMs\\neworder.xlsx"))

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1")

		//Write data to excel’

		Row oRow;

		oRow = sheet.getRow(iRow);

		if(oRow == null){

			sheet.createRow(iRow);

			oRow = sheet.getRow(iRow);

		}

		Cell oCell;

		oCell = oRow.getCell(iCell - 1);

		if(oCell == null ){

			oRow.createCell(iCell - 1);

			oCell = oRow.getCell(iCell - 1);

		}

		oCell.setCellValue(iText);

		FileOutputStream outFile =new FileOutputStream(new File("C:\\Katalon\\Excel Files\\EDMs\\neworder.xlsx"));

		workbook.write(outFile);

		outFile.close();

	}

}

public class receivedorder {

	@Keyword

	def void getreceivedOrder(int iRow, int iCell, String iText ){

		FileInputStream file = new FileInputStream (new File("C:\\Katalon\\Excel Files\\EDMs\\neworder.xlsx"))

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1")

		//Write data to excel’

		Row oRow;

		oRow = sheet.getRow(iRow);

		if(oRow == null){

			sheet.createRow(iRow);

			oRow = sheet.getRow(iRow);

		}

		Cell oCell;

		oCell = oRow.getCell(iCell - 1);

		if(oCell == null ){

			oRow.createCell(iCell - 1);

			oCell = oRow.getCell(iCell - 1);

		}
		oCell.setCellValue(iText);

		FileOutputStream outFile =new FileOutputStream(new File("C:\\Katalon\\Excel Files\\EDMs\\neworder.xlsx"));

		workbook.write(outFile);

		outFile.close();

	}

}