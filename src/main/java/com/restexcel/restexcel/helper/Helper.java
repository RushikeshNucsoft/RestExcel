package com.restexcel.restexcel.helper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.restexcel.restexcel.entity.Client;

public class Helper {
	
	
	//check if file is excel type or not
	public static boolean checkExcelFormat(MultipartFile file)
	{
		String contentType = file.getContentType();
		
		if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	//convert excel to list of clients
	
	public List<Client> convertExcelToClientList()
	{
		
		List<Client> list = new ArrayList<>();
		
		try
		{
			XSSFWorkbook workbook =	new XSSFWorkbook();
			
			XSSFSheet clientData = workbook.getSheet("Client_Data");
			
			int rowNumber =0;
			
			Iterator<Row> iterator = clientData.iterator();
			
			while(iterator.hasNext())
			{
				Row row = iterator.next();
				
				if(rowNumber==0)
				{
					rowNumber++;
					continue;
				}
				
				Iterator<Cell> cells = row.iterator();
				
				int cid = 0;
				
				Client c = new Client();
				
				while(cells.hasNext())
				{
					Cell cell = cells.next();
					
					switch (cid) {
					
					case 0:
						c.setClientId((int)cell.getNumericCellValue());
						break;
					case 1:
						c.setClientName(cell.getStringCellValue());
						break;
					case 2:
						c.setClientEmailId(cell.getStringCellValue());
						break;
					case 3:
						c.setClientMobileNo(cell.getStringCellValue());
						break;
						
						default:
							break;
					}
					cid++;
					
				}
				list.add(c);
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		return list;
		
	}

}
