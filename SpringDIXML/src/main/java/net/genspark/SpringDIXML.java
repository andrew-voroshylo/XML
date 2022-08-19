package net.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDIXML {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		Student student = (Student) appContext.getBean("studenta");
		student.returnInfo();
	}

}
