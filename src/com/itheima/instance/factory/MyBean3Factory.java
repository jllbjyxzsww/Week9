package com.itheima.instance.factory;

public class MyBean3Factory {
	public MyBean3Factory(){
		System.out.println("bean3����ʵ������");
	}
	public Bean3 createBean(){
		return new Bean3();
	}

}
