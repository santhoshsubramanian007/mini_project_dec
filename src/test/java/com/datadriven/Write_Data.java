package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void Write_Data() throws IOException {

		File f = new File("C:\\Users\\santhosh\\Desktop\\New folder\\codings\\Writedata.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		//	Sheet createSheet = wb.createSheet("Data");

		//	Row createRow = createSheet.createRow(0);

		//	Cell createCell = createRow.createCell(0);

		//	createCell.setCellValue("Username");

		wb.createSheet("Data1").createRow(0).createCell(0).setCellValue("Username");

		wb.getSheet("Data1").getRow(0).createCell(1).setCellValue("Password");

		wb.getSheet("data1").createRow(1).createCell(0).setCellValue("virat");

		wb.getSheet("Data1").getRow(1).createCell(1).setCellValue(56);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		wb.close();

		System.out.println("write succesfully");	

	}
	public static void main(String[] args) throws Throwable {
		
		Write_Data();

	}
}

