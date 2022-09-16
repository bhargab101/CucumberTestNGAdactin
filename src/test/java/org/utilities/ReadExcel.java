package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ReadExcel {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ReadExcel( String sheetName) {
		try {

			// String projectPath = System.getProperty("user.dir"); can be used
			XSSFWorkbook workbook = new XSSFWorkbook(FilePath.excelPath);
			XSSFSheet sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public static void getRowCount() {

		try {

			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowCount);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.getCause();
			e.printStackTrace();
		}

	}

	public static String getCellStringData(int rowNo, int cellNo) {

		String stringCellvalue = sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();

		return stringCellvalue;

	}

	public static double getCellNumericData(int rowNo, int cellNo) {

		double stringCellvalue = sheet.getRow(rowNo).getCell(cellNo).getNumericCellValue();
		System.out.println(stringCellvalue);

		return stringCellvalue;

	}

	public static String getCellDateData(int rowNo, int cellNo) {

		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		Date d = cell.getDateCellValue();
		SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyy");
		String value = sim.format(d);
		return value;
	}

}
