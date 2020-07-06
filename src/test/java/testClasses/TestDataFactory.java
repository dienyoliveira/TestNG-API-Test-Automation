package testClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestDataFactory {
	
	@DataProvider(name = "input")
	public Object[][] getData()
	{
		return new Object[][] {
			{"p1","p2"},
			{"m1", "m2"},
			{"r1", "r2"}
			
		};
	}
	
	@DataProvider(name = "lGitHub")
	public void readExcel() throws IOException{
		
		DataFormatter formatter =new DataFormatter();
		
		FileInputStream arquivoExcel = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\MassaDeDados.xlsx");
	
		XSSFWorkbook workbook = new XSSFWorkbook(arquivoExcel);
		XSSFSheet worksheet = workbook.getSheet("Sheet1");
		XSSFRow header = worksheet.getRow(0);
		
		int rowNum = worksheet.getPhysicalNumberOfRows(); //pegar a ultima linha
		int colNum = header.getLastCellNum(); //pegar ultima coluna
		
		Object data[][] = new Object[rowNum - 1][colNum];
		
		for(int i = 0; i< rowNum - 1; i++)
		{
			XSSFRow currentRow = worksheet.getRow(i + 1);
			
			for(int j = 0; j < colNum; j++){
				if(currentRow == null) {
					data[i][j] = "";	
				} else {
					XSSFCell cell = currentRow.getCell(j);
					
					if (cell ==  null) {
						data[i][j] = "";	
					} else {
						String value = formatter.formatCellValue(cell);
						data[i][j] = value;
					}
				}
			}
		}
	}
}
