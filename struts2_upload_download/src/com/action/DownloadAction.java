package com.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;

public class DownloadAction {
	private String fileName="";

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String execute() throws Exception{
		String downPath=ServletActionContext.getRequest().getServletContext().getRealPath("/");
		System.out.println(fileName);
		fileName=fileName.replace("%", "_");
		fileName=URLDecoder.decode(fileName,"utf-8");
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		
		String downfileName="";
		if(request.getHeader("USER-AGENT").toLowerCase().indexOf("msie")>0){
			fileName=URLEncoder.encode(fileName, "utf-8");
			downfileName=fileName.replace("+", "%20");
		}else{
			downfileName=new String(fileName.getBytes("utf-8"),"iso-8859-1");
		}
		
		System.out.println(downPath+fileName);
		
		File downloadFile=new File(downPath+fileName);
		response.setContentType("application/octet-stream");
		//文件名外的双引号处理Firefox的空格截断问题
		
		response.setHeader("Content-disposition", String.format("attachement;filename=\"%s\"", downfileName));
		response.setHeader("Content-Length", String.valueOf(downloadFile.length()));
		FileInputStream fis=new FileInputStream(downloadFile);
		
		ServletOutputStream out=response.getOutputStream();
		IOUtils.copy(fis, out);
		return null;
	}
	
}
