package com.entity;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class FileUploadTools {
	private String username;
	private File uploadFile [];
	private String uploadFileFileName [];
	private String uploadFileContentType[];
	
	
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


	//上传的ContentType文件类型也是数组类型
	//必须加上ContentType的声明，不然会报异常
	public String[] getUploadFileFileName() {
		return uploadFileFileName;
	}


	public void setUploadFileFileName(String[] uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}


	public String[] getUploadFileContentType() {
		return uploadFileContentType;
	}


	public void setUploadFileContentType(String[] uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}


	public void beginUload() throws IOException {
	System.out.println("username的值 是:"+username);	
	String targetDirectory=ServletActionContext.getRequest().getRealPath("/upload");
	System.out.println();
	for (int i = 0; i < uploadFile.length; i++) {
		File target=new File(targetDirectory,uploadFileFileName[i]);
		FileUtils.copyFile(uploadFile[i],target);
	}
	}

	
	
}
