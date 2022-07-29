package u_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir");
        String excelPath = projectPath + "\\data\\writetestdataUT.xlsx";
		FileInputStream readFile = new FileInputStream(excelPath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(readFile);
		XSSFSheet sheet = workbook.getSheet("SampleSheet");
		Row row;
		Cell cell;
		
		Iterator<Row> rowIterator = sheet.iterator();{
			while(rowIterator.hasNext()){
				row = rowIterator.next();
				
				Iterator<Cell> cellIterator = row.iterator();
				while(cellIterator.hasNext()){
					cell = cellIterator.next();
					
					DataFormatter formattor = new DataFormatter();	
					String text = formattor.formatCellValue(cell);
					
					System.out.println(text);
				}
			}
		}
		readFile.close();
		workbook.close();

	}

}
