package com.entity;

import java.util.Date;

public class UserInfo {
	
	private String username;
	private String password;
	private int age;
	private String createDate;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String string) {
		this.createDate = string;
	}
	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", password=" + password
				+ ", age=" + age + ", createDate=" + createDate + "]";
	}
	
	
}
