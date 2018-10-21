package com.lms.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * @author fahad
 * This class holds the information of a Person 
 * who is potentially a member of Library
 */
@Entity
public class Member {

	@Id
	private int id;
	private String name;
	private String phoneNumber;
	private String emailAddress;

	public Member() {
	}

	public Member(int memberId, String name, String phoneNumber, String emailAddress) {
		super();
		this.id=memberId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int personId) {
		this.id = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", emailAddress="
				+ emailAddress + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id,this.name,this.phoneNumber,this.emailAddress);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(this.getId(), other.getId()) &&
			   Objects.equals(this.getName(), other.getName()) &&
			   Objects.equals(this.getPhoneNumber(), other.getPhoneNumber()) &&
			   Objects.equals(this.getEmailAddress(), other.getEmailAddress()); 
	}
	
}
