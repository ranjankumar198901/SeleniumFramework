package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel 
{
	public static int getRowCount(String Path,String Sheet)
	{
		int rc = 0 ;
		try
		{
			FileInputStream Fis= new FileInputStream(Path);
			Workbook wb = WorkbookFactory.create(Fis);
			 rc = wb.getSheet(Sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			
		}
		return rc;
	}
	public static String GetCellValue(String Path,String Sheet,int r,int c)
		{
			String v = " ";
			
		try
		{
			FileInputStream fis = new FileInputStream(Path);
			Workbook wb = WorkbookFactory.create(fis);
			v = wb.getSheet(Sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			
		}
			return v;
		
	}
	
}
	

