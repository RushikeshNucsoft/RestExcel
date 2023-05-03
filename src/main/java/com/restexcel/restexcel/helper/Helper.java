package com.restexcel.restexcel.helper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		return null;
		
	}

}
