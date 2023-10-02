package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFirst {

	public static void main(String[] args) throws IOException {
		
		 String projectPath = System.getProperty("user.dir");
		File file=new File(projectPath+"\\src\\test\\resources\\data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheet("Login_user");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println("Cell Value:     "+cell);
		
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = row.getLastCellNum();
		
		//System.out.println("lastRowNum   " + lastRowNum+"\n"+"lastCellNum  "+lastCellNum);
		
		for(int i=0;i<lastRowNum;i++)
		{
			for(int j=0;j<lastCellNum-1;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j)+"  ");
			}
			System.out.println("");
		}
		
		
		workBook.close();
		fis.close();
	}

}
