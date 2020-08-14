package net.project.web;

public class User {
	private String email;
	private String userID;
	private String name;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public String getUserID() {
		return userID;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", userID=" + userID + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
