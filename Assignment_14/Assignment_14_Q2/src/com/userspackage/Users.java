package com.userspackage;

import java.util.Date;

public class Users {
	int id;
	String first_name;
	String last_name;
	String email;
	String password;
	String dob;
	Boolean status;
	String role;
	
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String first_name, String last_name, String email, String pasword, String dob, Boolean status,
			String role) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = pasword;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasword() {
		return password;
	}
	public void setPasword(String pasword) {
		this.password = pasword;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", pasword=" + password + ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}
	
	

}
