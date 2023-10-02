package excel.practice.programs;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashMapToExcel {

	public static void main(String[] args) throws Exception {
		String projectPath = System.getProperty("user.dir");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("HashToExcel");
		
		HashMap<String, String> hp = new HashMap<String, String>();
		hp.put("Name", "Company");
		hp.put("Santosh", "NC");
		hp.put("Kumar", "DOX");
		hp.put("Divya", "SticSoft");
		hp.put("Raju", "TCS");
		
		int r=0;
		for(Entry<String, String> kv:hp.entrySet())
		{
			XSSFRow row = sheet.createRow(r);
			
			row.createCell(0).setCellValue(kv.getKey());
			row.createCell(1).setCellValue(kv.getValue());

			r++;
		}
		
		FileOutputStream fos = new FileOutputStream(projectPath + "\\TestDataExcel\\HashToExcel.xlsx");
		wb.write(fos);
		fos.close();
		wb.close();
		
		
		
	}

}
