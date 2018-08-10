package com.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class ListString extends ActionSupport {
	
	public String execute() throws IOException{
	List listString=new ArrayList<>();	
	listString.add("xiaoming1");
	listString.add("xiaoming1");
	listString.add("xiaoming2");
	listString.add("xiaoming3");
	JSONArray json=JSONArray.fromObject(listString);
	System.out.println(json.toString());
	
	ServletActionContext.getResponse().setContentType("text/html");
	ServletActionContext.getResponse().setCharacterEncoding("utf-8");
	ServletActionContext.getResponse().getWriter().print(json.toString());
	ServletActionContext.getResponse().getWriter().close();return null;
	}
}
