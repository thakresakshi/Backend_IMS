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
@Table(name="feedback")
public class feedback {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 15)
	private long feedbackId;
	@Column(length=25)
	private String name;
	@Column(length=50)
	private String message;
	@Column(length=12) 
	private String phoneNumber;
	@Column(length=20)
	private String city;
	public feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public feedback(long feedbackId, String name, String message, String phoneNumber, String city) {
		super();
		this.feedbackId = feedbackId;
		this.name = name;
		this.message = message;
		this.phoneNumber = phoneNumber;
		this.city = city;
	}
	public long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "feedback [feedbackId=" + feedbackId + ", name=" + name + ", message=" + message + ", phoneNumber="
				+ phoneNumber + ", city=" + city + ", getFeedbackId()=" + getFeedbackId() + ", getName()=" + getName()
				+ ", getMessage()=" + getMessage() + ", getPhoneNumber()=" + getPhoneNumber() + ", getCity()="
				+ getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
