package excel.practice.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelClassAssignment {

	public static void main(String[] args) throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(projectPath+"\\TestDataExcel\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("people");
		int age = 0;
		int statusValue = 0;

		int rownum = sheet.getLastRowNum();


		//getting Cell Number of Age and Status
		for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
		{
			if(sheet.getRow(0).getCell(j).getStringCellValue().equals("Age"))
			{
				age = j;
			}
			else if(sheet.getRow(0).getCell(j).getStringCellValue().equals("Status"))
			{
				statusValue=j;
			}
		}
		
		
		// Updating Major or Minor in Status Cell
		for(int i=1;i<=rownum;i++)
		{
			 XSSFCell cellval = sheet.getRow(i).getCell(age);
			int ageValue = (int)cellval.getNumericCellValue();
			if(ageValue>18)
			{
				System.out.println(ageValue+"-->Major");
				sheet.getRow(i).getCell(statusValue).setCellValue("Major");
			}
			else
			{
				System.out.println(ageValue+"-->Minor");
				sheet.getRow(i).getCell(statusValue).setCellValue("Minor");
			}
		}
		
		FileOutputStream fos = new FileOutputStream(projectPath+"\\TestDataExcel\\data.xlsx");
		wb.write(fos);
		
		fos.close();
		wb.close();
		

	}

}
