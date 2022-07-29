package data_operation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel_Ex1 {

	public static void main(String[] args) throws IOException {
		//We need to create the excel file with data for this program
		
		String projectPath = System.getProperty("user.dir");
		String excelPath = projectPath + "\\data\\readtestdata.xlsx";
		System.out.println(excelPath);
		
		FileInputStream fis = new FileInputStream(excelPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//OR
		//XSSFSheet sheet = wb.getSheetAt(0);
		
		//int rows = sheet.getLastRowNum();
        //OR
        //int rows = sheet.getPhysicalNumberOfRows();
        //OR

        int rows = sheet.getLastRowNum() - sheet.getFirstRowNum();

        System.out.println("Row count = " + rows);

        //int columns = sheet.getRow(0).getLastCellNum();
        //OR
        //int columns = sheet.getRow(0).getPhysicalNumberOfCells();
        //OR

        int columns = sheet.getRow(0).getLastCellNum() - sheet.getRow(0).getFirstCellNum();

        System.out.println("Column count = " + columns);


    //    DataFormatter formatter = new DataFormatter();
        
        String cellValue1 = sheet.getRow(1).getCell(0).toString();
        System.out.println(cellValue1);


        String cellValue2 = sheet.getRow(1).getCell(1).toString();
        System.out.println(cellValue2);
		

        
        //OR
        /*
        XSSFCell cellValue2 = sheet.getRow(1).getCell(1);
        String value = formatter.formatCellValue(cellValue2);
        System.out.println(value);
        */

        String cellValue3 = sheet.getRow(1).getCell(2).toString();
        System.out.println(cellValue3);

        fis.close();
        wb.close();

	}

}
