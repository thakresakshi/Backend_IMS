package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="ContactUs")
public class contactUs {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 15)
	private long contactusId;
	@Column(length=25)
	private String name;
	@Column(length=30)
	private String email;
	@Column(length=50)
	private String message;
	@Column(length=12) 
	private String phoneNumber;
	
	
	public contactUs() {
		super();
		// TODO Auto-generated constructor stub
	}


	public contactUs(long contactusId, String name, String email, String message, String phoneNumber) {
		super();
		this.contactusId = contactusId;
		this.name = name;
		this.email = email;
		this.message = message;
		this.phoneNumber = phoneNumber;
	}


	public long getContactusId() {
		return contactusId;
	}


	public void setContactusId(long contactusId) {
		this.contactusId = contactusId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "contactUs [contactusId=" + contactusId + ", name=" + name + ", email=" + email + ", message=" + message
				+ ", phoneNumber=" + phoneNumber + ", getContactusId()=" + getContactusId() + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getMessage()=" + getMessage() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
