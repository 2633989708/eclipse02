package com.entity;

import java.util.Date;

public class Userinfo {
	private int idp;
	private String usename;
	private String password;
	private int age ;
	private Date insertDate;
	public int getIdp() {
		return idp;
	}
	public void setIdp(int idp) {
		this.idp = idp;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
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
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Userinfo(int idp, String usename, String password, int age,
			Date insertDate) {
		super();
		this.idp = idp;
		this.usename = usename;
		this.password = password;
		this.age = age;
		this.insertDate = insertDate;
	}
	public Userinfo(int idp, String usename, String password, int age) {
		super();
		this.idp = idp;
		this.usename = usename;
		this.password = password;
		this.age = age;
	}
	public Userinfo() {
		super();
		idp=100;
		usename="中国";
		password="中国人";
		age=200;
		insertDate=new Date();
	}
	
	public String printDate(){
		System.out.println("调用了printDate()无参方法");
		return "反射处理";
	}
	@Override
	public String toString() {
		return "Userinfo [idp=" + idp + ", usename=" + usename + ", password="
				+ password + ", age=" + age + ", insertDate=" + insertDate
				+ "]";
	}
	
	
}
