package com.restexcel.restexcel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.restexcel.restexcel.entity.Client;
import com.restexcel.restexcel.repo.ClientRepo;

@Service
public class ClientService {
	
	public void save(MultipartFile file)
	{
		
		ClientRepo clientRepo ;
	}
	
	public List<Client> getAllProducts() {
		
		
		return null;
		
	}

}
