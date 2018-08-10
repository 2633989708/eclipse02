package com.action;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

public class AjaxAction extends ActionSupport{
	private String jsonString;

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
	
	public String execute(){
		System.out.println(jsonString);
		return null;
	}
	
}
