package data_operation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel_Ex2 {

	public static void main(String[] args) throws IOException {

        String projectPath = System.getProperty("user.dir");
        String excelPath = projectPath + "\\data\\readtestdata.xlsx";
        System.out.println(excelPath);

        FileInputStream fis = new FileInputStream(excelPath);
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet = wb.getSheet("Sheet1");
        //OR
        //XSSFSheet sheet = wb.getSheetAt(0);

        int rows=sheet.getLastRowNum()-sheet.getFirstRowNum();

        System.out.println("Row count = " + rows);

        DataFormatter formatter = new DataFormatter();

        for(int i=0; i<=rows; i++) {

        	int columns = sheet.getRow(i).getPhysicalNumberOfCells();

        	for(int j=0; j<=columns; j++) {

        		XSSFCell cell = sheet.getRow(i).getCell(j);
		        String value = formatter.formatCellValue(cell);
		        System.out.print(value + "\t");    
		
		    }
        	System.out.println();
        }

        fis.close();
        wb.close();
    }
}
