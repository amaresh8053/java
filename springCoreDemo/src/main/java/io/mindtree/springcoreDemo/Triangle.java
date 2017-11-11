package io.mindtree.springcoreDemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean{
	
	private String type;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle(String type) {
		this.type=type;
	}
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void draw() {
		System.out.println(type+" is drawn by 3 points"+ getPointA() + getPointB() + getPointC());
	}
	public void destroy() throws Exception {
		System.out.println("destro method called");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method called");
		
	}

}
