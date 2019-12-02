package generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getData(String filename,String sheet_name,int row_num,int cell_num)
	{
		try
		{
			FileInputStream file = new FileInputStream(new File(filename));
			String data = WorkbookFactory.create(file).getSheet(sheet_name).getRow(row_num).getCell(cell_num).toString();
			return data;
		}
		catch(Exception e)
		{
			return "";
		}
	}
	public static int getRowCount(String filename,String sheet_name)
	{
		try 
		{
			FileInputStream file = new FileInputStream(new File(filename));
			int row_count = WorkbookFactory.create(file).getSheet(sheet_name).getLastRowNum();
			return row_count;
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	public static int getCellCount(String filename,String sheet_name,int row_num,int cell_num)
	{
		try
		{
			FileInputStream file = new FileInputStream(new File(filename));
			int cell_count = WorkbookFactory.create(file).getSheet(sheet_name).getRow(row_num).getLastCellNum();
			return cell_count;
		}
		catch(Exception e)
		{
			return 0;
		}
	}
}
