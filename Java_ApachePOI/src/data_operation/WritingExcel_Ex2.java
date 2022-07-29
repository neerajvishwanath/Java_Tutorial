package data_operation;

import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class WritingExcel_Ex2 {
 
    public static void main(String[] args) throws IOException {

        String projectPath = System.getProperty("user.dir");
        String excelPath = projectPath + "\\data\\writetestdata2.xlsx";
        System.out.println(excelPath);

        FileOutputStream fos = new FileOutputStream(excelPath);

        XSSFWorkbook wb = new XSSFWorkbook();

        XSSFSheet sheet = wb.createSheet("Sheet1");



        Row row1 = sheet.createRow(0);

        row1.createCell(0).setCellValue("John");
        row1.createCell(1).setCellValue("Cena");
        row1.createCell(2).setCellValue("25");

        Row row2 = sheet.createRow(1);

        row2.createCell(0).setCellValue("David");
        row2.createCell(1).setCellValue("Boon");
        row2.createCell(2).setCellValue("35");

        wb.write(fos);
 
        fos.close();
        wb.close();

        System.out.println("File is written successfully");
    }
 
}
