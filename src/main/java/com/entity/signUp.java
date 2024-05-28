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
@Table(name="signUp")
public class signUp {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 15)
	private long signupId;
	@Column(length=25)
	private String fullName;
	@Column(length=25)
	private String email;
	@Column(length=25)
	private String username;
	@Column(length=15)
	private String password;
	@Column(length=12) 
	private String mobileNumber;
	public signUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public signUp(long signupId, String fullName, String email, String username, String password, String mobileNumber) {
		super();
		this.signupId = signupId;
		this.fullName = fullName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}
	public long getSignupId() {
		return signupId;
	}
	public void setSignupId(long signupId) {
		this.signupId = signupId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "signUp [signupId=" + signupId + ", fullName=" + fullName + ", email=" + email + ", username=" + username
				+ ", password=" + password + ", mobileNumber=" + mobileNumber + ", getSignupId()=" + getSignupId()
				+ ", getFullName()=" + getFullName() + ", getEmail()=" + getEmail() + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + ", getMobileNumber()=" + getMobileNumber() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
