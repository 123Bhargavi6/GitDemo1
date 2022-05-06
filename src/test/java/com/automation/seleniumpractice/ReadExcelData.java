package com.automation.seleniumpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

public static  void main(String args[]) throws IOException  {
	
	//System.setProperty("webdriver.chrome.driver",
			//"C:\\Users\\I4942\\eclipse-workspace\\seleniumpractic e\\drivers\\chromedriver.exe");

	//WebDriver driver = new ChromeDriver();
        
        //Create an object of File class to open xlsx file
        File file = new File("C:\\\\Users\\\\I4942\\\\Desktop/Bhargavi.xlsx");
      
       
            //Create an object of FileInputStream class to read excel file
            FileInputStream inputStream = new FileInputStream(file);

            //creating workbook instance that refers to .xlsx file
            XSSFWorkbook wb=new XSSFWorkbook(inputStream);

            //creating a Sheet object
            XSSFSheet sheet=wb.getSheet("Sheet1");
            
            //get all rows in the sheet
            int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
            
            //iterate over all the row to print the data present in each cell.
            for(int i=0;i<=rowCount;i++){
                
                //get cell count in a row
                int cellcount=sheet.getRow(i).getLastCellNum();
                
                //iterate over each cell to print its value
                System.out.println("Row"+ i+" data is :");
                
                for(int j=0;j<cellcount;j++){
                    System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
                }
                System.out.println();
            }
        }

}
