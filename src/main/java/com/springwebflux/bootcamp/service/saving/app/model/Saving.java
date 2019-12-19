package com.springwebflux.bootcamp.service.saving.app.model;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Saving {

@Document(collection = "saving")
public class Personal {

@Id
	private String id;
	private String dni;
	private String nombres;
	private String number_account;
	private Double money;
	private List<Saving> headlines = new ArrayList<Saving>();
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
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getNumber_account() {
		return number_account;
	}
	public void setNumber_account(String number_account) {
		this.number_account = number_account;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public List<Saving> getHeadlines() {
		return headlines;
	}
	public void setHeadlines(List<Saving> headlines) {
		this.headlines = headlines;
	}

	
 
	 
	
 
	
	
}
}