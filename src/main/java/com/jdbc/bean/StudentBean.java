package com.jdbc.bean;

public class StudentBean {
	
	int rno;
	int marks;
	int std;
	String name;
	
	public StudentBean() {
		
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentBean(int rno, int marks, int std, String name) {
		super();
		this.rno = rno;
		this.marks = marks;
		this.std = std;
		this.name = name;
	}
	

}
