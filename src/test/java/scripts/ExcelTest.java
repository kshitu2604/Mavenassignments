package scripts;

import java.util.List;
import java.util.Map;

import utilities.ExcelUtil;

public class ExcelTest {

	public static void main(String[] args) {
		/*
		 * String[][] data = ExcelUtil.readData("Assignment_19.xlsx", "ProductDetails");
		 * for (int r = 0; r < data.length; r++) { for (int c = 0; c < data[r].length;
		 * c++) { System.out.println(data[r][c]); } }
		 */
		
		List<Map<String,String>> excelData = ExcelUtil.readExcelData("Assignment_19.xlsx", "ProductDetails");
		System.out.println(excelData.get(1).get("Supplier"));
		

	}

}
