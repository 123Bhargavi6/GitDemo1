package com.automation.seleniumpractice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\I4942\\Desktop\\Sample.xlsx");
		FileInputStream fis = new FileInputStream(src);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		System.out.println(sh);
		Row r = sh.getRow(0);
		String data = r.getCell(0).getStringCellValue();
		Cell c = r.getCell(1);
		System.out.println(c);
		System.out.println(data);
		


	}
}
