package com.restexcel.restexcel.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Client {
	
	@Id
	private Integer clientId;
	private String clientName;
	private String clientEmailId;
	private String clientMobileNo;
	
	
	public Client(int clientId, String clientName, String clientEmailId, String clientMobileNo) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientEmailId = clientEmailId;
		this.clientMobileNo = clientMobileNo;
	}


	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getClientId() {
		return clientId;
	}


	public void setClientId(int clientId) {
		this.clientId = clientId;
	}


	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public String getClientEmailId() {
		return clientEmailId;
	}


	public void setClientEmailId(String clientEmailId) {
		this.clientEmailId = clientEmailId;
	}


	public String getClientMobileNo() {
		return clientMobileNo;
	}


	public void setClientMobileNo(String clientMobileNo) {
		this.clientMobileNo = clientMobileNo;
	}
	
	
	
	
	
	

}
