package com.itheima.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssembleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlPath = "com/itheima/annotation/beans6.xml";
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext(xmlPath);
		UserController userController =
				(UserController) applicationContext.getBean("userController");
		userController.save();

	}

}
