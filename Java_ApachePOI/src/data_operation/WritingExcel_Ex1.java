package data_operation;

import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class WritingExcel_Ex1 {
 
    public static void main(String[] args) throws IOException {

        //This program will create the excel file by it's own

        String projectPath = System.getProperty("user.dir");
        String excelPath = projectPath + "\\data\\writetestdata1.xlsx";
        System.out.println(excelPath);


        FileOutputStream fos = new FileOutputStream(excelPath);

        XSSFWorkbook wb = new XSSFWorkbook();

        XSSFSheet sheet = wb.createSheet("Sheet1");

        Row row1 = sheet.createRow(0);
        Cell row1Cell1 = row1.createCell(0);
        row1Cell1.setCellValue("John");

        Row row2 = sheet.createRow(1);
        Cell row2Cell2 = row2.createCell(0);
        row2Cell2.setCellValue("David");
 
        wb.write(fos);
 
        fos.close();
        wb.close();

        System.out.println("File is written successfully");
    }
 
}
