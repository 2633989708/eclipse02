package com.action;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONArray;

import com.entity.UserInfo;
import com.opensymphony.xwork2.ActionSupport;

public class MapBean extends ActionSupport {
	public String execute() throws IOException{
		LinkedHashMap mapString=new LinkedHashMap<>();
		UserInfo info=new UserInfo();
		info.setUsername("map1");
		info.setPassword("1122");
		info.setAge(12);
		info.setCreateDate(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()));
		
		UserInfo info1=new UserInfo();
		info1.setUsername("map1");
		info1.setPassword("1122");
		info1.setAge(12);
		info1.setCreateDate(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()));
		
		mapString.put("mapBean1", info);
		mapString.put("mapBean2", info1);
		JSONArray json=JSONArray.fromObject(mapString);
		System.out.println(json);
		
		ServletActionContext.getResponse().setContentType("text/html");
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().getWriter().print(json.toString());
		ServletActionContext.getResponse().getWriter().flush();
		ServletActionContext.getResponse().getWriter().close();
		return null;
	}
}
