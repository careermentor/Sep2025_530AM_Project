package anotherpkg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadingExcelFile 
{

	public static void readexcel() throws Exception
	{
		FileInputStream fis = new FileInputStream("./TestData/abc.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Sheet2");
		
		int nr = sh1.getPhysicalNumberOfRows();
		System.out.println(nr);  //nr = 3
		
		for(int i=0; i<nr; i++)  //i=0, 0<3, i=1, 1<3
		{
			XSSFRow row = sh1.getRow(i);  //i=0 (first row), i=1 second row
			
			int nc = row.getPhysicalNumberOfCells();  //2 , 3
			
			for(int j=0; j<nc; j++)  //j=0 , 0<2, j=1, 1<2, j=2, 2<2
			{
				XSSFCell col = row.getCell(j);  //j=0, first column , j=1 second column
				
				if(CellType.STRING==col.getCellType())
				{
					System.out.print(col.getStringCellValue() + "    ");
				}
				else if(CellType.NUMERIC==col.getCellType())
				{
					System.out.print(col.getNumericCellValue() + "    ");
				}
				
				else if(CellType.BOOLEAN==col.getCellType())
				{
					System.out.print(col.getBooleanCellValue() + "    ");
				}
				
				else
				{
					System.out.print(col.getDateCellValue() + "    ");
				}
				
			}
			
			System.out.println();
			
		}
		
		/*
		XSSFRow row1 = sh1.getRow(0);
		
		XSSFCell col1 = row1.getCell(0);
		System.out.println(col1.getStringCellValue());
		
		XSSFCell col2 = row1.getCell(1);
		System.out.println(col2.getStringCellValue());
		
		XSSFRow row2 = sh1.getRow(1);
		
		XSSFCell col21 = row2.getCell(0);
		System.out.println(col21.getStringCellValue());
		
		XSSFCell col22 = row2.getCell(1);
		System.out.println(col22.getStringCellValue());
		
		XSSFCell col23 = row2.getCell(2);
		System.out.println(col23.getStringCellValue());
		
		*/
		
	}
	
	public static void main(String[] args) throws Exception {
		
		readexcel();
		
	}

}
