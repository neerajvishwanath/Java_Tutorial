package u_Practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {
	public static void main(String[] args) throws IOException{
		// Blank WorkBook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// Create Sheet
		XSSFSheet samplesheet = workbook.createSheet("SampleSheet");
		
		// Creating the Data 
		Map<String, Object[]> dataSet = new TreeMap<String, Object[]>();
		dataSet.put("1", new Object[] {"ID", "Name", "Company"});
		dataSet.put("2", new Object[] {"1", "James", "PertLine Inc"});
		dataSet.put("3", new Object[] {"2", "Maria", "SumoLogic Inc"});
		dataSet.put("4", new Object[] {"3", "Peter", "Siemens Corp"});
		dataSet.put("5", new Object[] {"4", "Julia", "Google Inc"});
		dataSet.put("6", new Object[] {"5", "Ajay", "FaceBook Inc"});
		
		//Iterate over the Data
		Set<String> set = dataSet.keySet();
		int rownum = 0;
		for (String key : set) {
			Row row = samplesheet.createRow(rownum++);
			Object[] data = dataSet.get(key);
			
			int cellNum=0;
			for (Object value : data) {
				Cell cell = row.createCell(cellNum++);
				
				if (value instanceof String)
					cell.setCellValue((String)value);
				else if(value instanceof Integer)
					cell.setCellValue((Integer)value);
			}
		}
		//This program will create the excel file by it's own

        String projectPath = System.getProperty("user.dir");
        String excelPath = projectPath + "\\data\\writetestdataUT.xlsx";
        System.out.println(excelPath);


        FileOutputStream fos = new FileOutputStream(excelPath);
        workbook.write(fos);
        fos.close();
        workbook.close();
	}
	
}
