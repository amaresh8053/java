package io.mindtree.springcoreDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
	//	BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
	//	beanFactory.getBean("triangle");
		
		//ApplicationContext factroy= new ClassPathXmlApplicationContext("spring.xml"); 
		
		AbstractApplicationContext factroy= new ClassPathXmlApplicationContext("spring.xml"); 
		
		factroy.registerShutdownHook();
		
		Triangle triangle = (Triangle) factroy.getBean("triangle");
		triangle.draw();

	}

}
