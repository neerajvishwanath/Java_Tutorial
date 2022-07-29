package data_operation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
 

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ReadingExcel_Ex3 {
 
    public static void main(String[] args) throws IOException {

        String projectPath = System.getProperty("user.dir");
        String excelPath = projectPath + "\\data\\readtestdata.xlsx";
        System.out.println(excelPath);

        FileInputStream fis = new FileInputStream(excelPath);

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet = wb.getSheet("Sheet1");

        Row row;
        Cell cell;

        Iterator<Row> rowIterator = sheet.iterator();

        while(rowIterator.hasNext()) {
            row = rowIterator.next();

            Iterator<Cell> cellIterator = row.cellIterator();
            while(cellIterator.hasNext()) {
                cell = cellIterator.next();

                DataFormatter formatter = new DataFormatter();
                String data = formatter.formatCellValue(cell);
                System.out.println(data);


            }
        }

        fis.close();
        wb.close();

    }
 
} 