package com.action;

import java.io.IOException;

import com.entity.FileUploadTools;
import com.opensymphony.xwork2.ActionSupport;

public class Register3 extends ActionSupport {
	private FileUploadTools fileUploadTools=new FileUploadTools();

	public FileUploadTools getFileUploadTools() {
		return fileUploadTools;
	}

	public void setFileUploadTools(FileUploadTools fileUploadTools) {
		this.fileUploadTools = fileUploadTools;
	}
	
	public String execute() throws IOException{
		fileUploadTools.beginUload();
		return "register3";
	}
	
}
