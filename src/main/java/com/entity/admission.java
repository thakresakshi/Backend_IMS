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
@Table(name="Admission")
public class admission {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 15)
	private long admissionId;
	@Column(length=30)
	private String fullName;
	@Column(length=40)
	private String email;
	@Column(length=12) 
	private String mobile;
	@Column(length=20) 
	private String className;
	@Column(length=40)
	private String courseName;
	@Column(length=60)
	private String address;
	@Column(length=18)
	private String paymentMethod;
	public admission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public admission(long admissionId, String fullName, String email, String mobile, String className,
			String courseName, String address, String paymentMethod) {
		super();
		this.admissionId = admissionId;
		this.fullName = fullName;
		this.email = email;
		this.mobile = mobile;
		this.className = className;
		this.courseName = courseName;
		this.address = address;
		this.paymentMethod = paymentMethod;
	}
	public long getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(long admissionId) {
		this.admissionId = admissionId;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	@Override
	public String toString() {
		return "admission [admissionId=" + admissionId + ", fullName=" + fullName + ", email=" + email + ", mobile="
				+ mobile + ", className=" + className + ", courseName=" + courseName + ", address=" + address
				+ ", paymentMethod=" + paymentMethod + ", getAdmissionId()=" + getAdmissionId() + ", getFullName()="
				+ getFullName() + ", getEmail()=" + getEmail() + ", getMobile()=" + getMobile() + ", getClassName()="
				+ getClassName() + ", getCourseName()=" + getCourseName() + ", getAddress()=" + getAddress()
				+ ", getPaymentMethod()=" + getPaymentMethod() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	 

}
