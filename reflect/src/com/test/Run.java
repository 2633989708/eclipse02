package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.entity.Userinfo;

public class Run {
	//主函数的入口============
	public static void main(String[] args) {
		try {
			//用3种方式取得Userinfo类的Class对象
			Class<?> classRef1=Class.forName("com.entity.Userinfo");
			Class<?> classRef2=new Userinfo().getClass();
			Class<?> classRef3=Userinfo.class;
			
			System.out.println("证明获取的类名称一模一样："+classRef1.getName());
			System.out.println("classRef2  "+classRef2.getName());
			System.out.println("classRef3"+classRef3);
			
			//使用Class类的newInstance()方法实例化Userinfo对象
			Class<?> classRef=Userinfo.class.getClassLoader().loadClass("com.entity.Userinfo");
			Userinfo userinfoRef=(Userinfo) classRef.newInstance();
			System.out.println(userinfoRef);
			
			//使用Constructor类的newInstance()方法实例化Userinfo对象
			
			Constructor<?> constructor=classRef.getDeclaredConstructor(null);
			System.out.println("调用无参构造器实例化"+constructor);
			
			//使用Constructor类的newInstance()方法实例化Userinfo对象
			Constructor<?> constructor2=classRef.getDeclaredConstructor(int.class,String.class,String.class,int.class);
			
			Userinfo userinfo=(Userinfo) constructor2.newInstance(100,"小明","123456",20);
			
			System.out.println(userinfo);
			
			//对无参方法进行反射调用
			Method method=classRef.getDeclaredMethod("printDate");
			
			System.out.println(method.invoke(userinfo));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
