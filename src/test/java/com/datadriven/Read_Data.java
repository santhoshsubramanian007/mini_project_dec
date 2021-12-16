package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static Workbook wb;

	public Read_Data() throws IOException {

		File f = new File("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\datadriver.xlsx");

		FileInputStream fis = new FileInputStream(f);

		wb = new XSSFWorkbook(fis);

	}

	public static void read_Particular_Data() throws IOException {



		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(2);

		Cell cell = row.getCell(0);

		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {

			String value = cell.getStringCellValue();

			System.out.println(value);

		}

		else if (cellType.equals(cellType.NUMERIC)) {

			double cellValue = cell.getNumericCellValue();

			int value = (int) cellValue;

			System.out.println(value);
		}

	}



	public static void all_Data() throws IOException {

		File f = new File("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\datadriver.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheetAt(0);

		int numberOfRows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < numberOfRows; i++) {

			Row row = sheet.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();


			for (int j = 0; j < numberOfCells; j++) {

				Cell cell = row.getCell(j);


				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {

					String value = cell.getStringCellValue();

					System.out.println(value);

				}

				else if (cellType.equals(cellType.NUMERIC)) {

					double cellValue = cell.getNumericCellValue();

					int value = (int) cellValue;

					System.out.println(value);
				}



			}

		}
	}


	public static void main(String[] args) throws Throwable {

		Read_Data data = new Read_Data();

		read_Particular_Data();

		all_Data();

	}

}
