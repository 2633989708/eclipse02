package com.action;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class Register2 extends ActionSupport{
	private String username;
	private File uploadFile[];
	
	private String uploadFileFileName[];
	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public File[] getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File[] uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String[] getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String[] uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}
	
	public String execute() throws IOException{
		System.out.println("username的值为:"+username);
		String targetDirectory=ServletActionContext.getRequest().getRealPath("/upload");
		for (int j = 0; j < uploadFile.length; j++) {
			File target=new File(targetDirectory,new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date()).toString()+System.nanoTime()+uploadFileFileName[j]);
			System.out.println(target);
			FileUtils.copyFile(uploadFile[j],target);
		}
		return "register2";
	}
	
}
