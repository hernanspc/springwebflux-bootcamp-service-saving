package com.springwebflux.bootcamp.service.saving.app.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Saving {

@Document(collection = "saving")
public class Personal {

@Id
	private String id;
	private String dni;
	private String number_account;
	private String cash;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNumber_account() {
		return number_account;
	}
	public void setNumber_account(String number_account) {
		this.number_account = number_account;
	}
	public String getCash() {
		return cash;
	}
	public void setCash(String cash) {
		this.cash = cash;
	}
	
	
}
}