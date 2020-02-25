package com.aiub.labexam;

public class User {
	
	public int id;
	public String username, password;
	public User() {
		
	}
	public User(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}




