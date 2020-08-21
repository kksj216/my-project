package net.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // data base와 mapping하는 것. 
public class User {
	@Id   // 각각의 data를 식별하기 위해 primary key
	@GeneratedValue  // database에서 자동으로  1씩 증가
	private Long id;
	
	@Column(nullable=false, length=20, unique=true)
	private String userID;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String password;
	
	public Long getId() {
		return id;
	}
	public boolean matchId(Long newId) { //getId()대신.
		if (newId == null) {
			return false;
		}
		
		return newId.equals(id); 
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
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
	public boolean matchPassword(String newPassword) {//getPassword()대신.
		if (newPassword == null) {
			return false;
		}
		
		return newPassword.equals(password); 
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
	
	public void update(User newUser) {
		this.password = newUser.password;
		this.name = newUser.name;
		this.email = newUser.email;
		this.userID = newUser.userID;
		
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", userID=" + userID + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
