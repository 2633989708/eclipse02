package com.action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import com.entity.UserInfo;
import com.opensymphony.xwork2.ActionSupport;

public class ListBean extends ActionSupport {
	public String execute() throws IOException{
		List listBean=new ArrayList<>();
		UserInfo userInfo=new UserInfo();
		userInfo.setUsername("xiaoming1");
		userInfo.setPassword("123456");
		userInfo.setAge(11);
		userInfo.setCreateDate(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()));
		UserInfo userInfo1=new UserInfo();
		userInfo1.setUsername("xiaoming2");
		userInfo1.setPassword("654321");
		userInfo1.setAge(11);
		userInfo1.setCreateDate(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()));
		
		listBean.add(userInfo);
		listBean.add(userInfo1);
		
		JSONArray json=JSONArray.fromObject(listBean);
		System.out.println(json);
		ServletActionContext.getResponse().setContentType("text/html");
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().getWriter().print(json.toString());
		ServletActionContext.getResponse().getWriter().flush();
		ServletActionContext.getResponse().getWriter().close();
		return null;
	}
}
