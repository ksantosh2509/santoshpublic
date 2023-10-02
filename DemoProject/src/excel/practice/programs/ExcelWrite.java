package excel.practice.programs;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws Exception {

		String projectPath = System.getProperty("user.dir");

		String path = projectPath + "\\TestDataExcel\\Test_Data_Excel_1.xlsx";

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Info");

		Object[][] excelArr = { { "Name", "Exp", "Company" }, { "San", 9, "NC" }, { "Div", 8, "SS" },
				{ "sid", "4", "Dox" } };
		int rownum = 0;
		for (Object r[] : excelArr) {
			XSSFRow row = sheet.createRow(rownum++);
			int value = 0;
			for (Object c : r) {
				XSSFCell cell = row.createCell(value++);

				if (c instanceof String) {
					cell.setCellValue((String) c);
				} else if (c instanceof Integer) {
					cell.setCellValue((int) c);
				} else if (c instanceof Boolean) {
					cell.setCellValue((Boolean) c);
				}

			}
		}

		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();
		wb.close();

	}

}
