package excel.practice.programs;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHashMap {

	public static void main(String[] args) throws Exception {
		
		
		String projectPath = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(projectPath+"\\TestDataExcel\\Test_Data_Excel_1.xlsx");
		
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet sheet = wb.getSheet("Info");
		 
		 HashMap<String, String> hp = new HashMap<String,String>();
		 
		 //System.out.println(sheet.getRow(0).getCell(0));
		 

		 int rownum = sheet.getLastRowNum();
		 System.out.println(rownum);
		 for(int r=0;r<=rownum;r++)
		 {
			 String key = sheet.getRow(r).getCell(0).getStringCellValue();
			 String value = sheet.getRow(r).getCell(1).getStringCellValue();
			 
			 hp.put(key, value);
		 }
		  
		 
		for(Entry<String, String> k:hp.entrySet())
		 {
			 System.out.println(k.getKey()+"  "+k.getValue());
		 }
		
		wb.close();

	}

}
