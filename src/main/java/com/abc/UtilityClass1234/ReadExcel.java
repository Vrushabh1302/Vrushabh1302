package com.abc.UtilityClass1234;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static FileInputStream excelfile;
	public static XSSFWorkbook workbook;
	public static void main(String[] args) {
try {
	 excelfile=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Eclipse\\Eclipse_Workspace\\ReadExcel.xlsx");
      workbook=new XSSFWorkbook(excelfile);

} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block   
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    XSSFSheet worksheet=workbook.getSheet("Sheet1");
/*  String z=  worksheet.getRow(5).getCell(2).getStringCellValue();
  Date a=worksheet.getRow(5).getCell(1).getDateCellValue();
  double b=worksheet.getRow(5).getCell(3).getNumericCellValue();*/
		
	Iterator<Row>rows=worksheet.rowIterator();
		while(rows.hasNext()) {
			Row row=rows.next();
			//System.out.println(row.getCell(0));
		Iterator<Cell> cells=row.cellIterator();
		while(cells.hasNext()) {
			Cell cell=cells.next();
			System.out.print(cell);
		}
		}
		
		
}
}