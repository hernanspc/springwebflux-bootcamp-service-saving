package com.springwebflux.bootcamp.service.saving.app.model;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Saving {
@Document(collection = "saving")
public class Personal {
@Id
	private String id;
	private String account_number;
	private String nrodoc;
	private String name;
	private String mail;
	private String phone;
	private boolean status;
	private String client_type;
	private Double money;
	private List<String> headlines_saving;
	private List<String> signatories_saving;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getNrodoc() {
		return nrodoc;
	}
	public void setNrodoc(String nrodoc) {
		this.nrodoc = nrodoc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getClient_type() {
		return client_type;
	}
	public void setClient_type(String client_type) {
		this.client_type = client_type;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public List<String> getHeadlines_saving() {
		return headlines_saving;
	}
	public void setHeadlines_saving(List<String> headlines_saving) {
		this.headlines_saving = headlines_saving;
	}
	public List<String> getSignatories_saving() {
		return signatories_saving;
	}
	public void setSignatories_saving(List<String> signatories_saving) {
		this.signatories_saving = signatories_saving;
	}
	
	
  
	
	
}
}