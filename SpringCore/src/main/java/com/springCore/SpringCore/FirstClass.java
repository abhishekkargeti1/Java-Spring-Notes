package com.springCore.SpringCore;

public class FirstClass {
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	
	public FirstClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FirstClass(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	
	@Override
	public String toString() {
		return "FirstClass [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
	
}
