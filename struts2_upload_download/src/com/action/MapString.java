package com.action;

import java.io.IOException;

import net.sf.json.JSONArray;

import org.apache.commons.collections.map.LinkedMap;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class MapString extends ActionSupport{
	public String execute() throws IOException{
		LinkedMap mapString=new LinkedMap();
		mapString.put("1", "xiaoming1");
		mapString.put("2", "xiaoming2");
		mapString.put("3", "xiaoming3");
		mapString.put("4", "xiaoming4");
		mapString.put("5", "xiaoming5");
		
		JSONArray json=JSONArray.fromObject(mapString);
		System.out.println(json.toString());
		
		ServletActionContext.getResponse().setContentType("text/html");
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().getWriter().write(json.toString());
		ServletActionContext.getResponse().getWriter().flush();
		ServletActionContext.getResponse().getWriter().close();
		return null;
	}
}
