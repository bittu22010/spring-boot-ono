package com.studentapp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Student {
	@Id
	@GeneratedValue(generator = "stu_seq",strategy= GenerationType.AUTO)
	@SequenceGenerator(name = "stud_gen",sequenceName ="stud_seq", initialValue =1 ,allocationSize =1)
private Integer studentId;
	@Column(name="studentname")
private String studentName;
private String department;

@OneToOne(cascade= CascadeType.ALL)
@JoinColumn(name="address_id")
Address address;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(String studentName, String department, Address address) {
	super();
	this.studentName = studentName;
	this.department = department;
	this.address = address;
}

public Integer getStudentId() {
	return studentId;
}

public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "student [studentId=" + studentId + ", studentName=" + studentName + ", department=" + department
			+ ", address=" + address + "]";
}

}
