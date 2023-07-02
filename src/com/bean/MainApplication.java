package com.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
		ApplicationContext a = new ClassPathXmlApplicationContext("SpringDemo.xml");
		
		//Pojo Object
		Triangle t = (Triangle) a.getBean("tri");
		t.display();
		
		
		

	}

}
