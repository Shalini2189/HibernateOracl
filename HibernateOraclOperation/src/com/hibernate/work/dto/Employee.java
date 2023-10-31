package com.hibernate.work.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "E_empid")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int empid;
    
    @Column(name = "E_empname")
    private String empname;
    
    @Column(name = "E_email")
    private String email;
    
    @Column(name = "E_mobile")
    private int mobile;
    
    @Column(name = "E_age")
    private int age;
    
    @Column(name = "E_salary")
    private double salary;
    
    @Column(name = "E_state")
    private String state;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int i) {
		this.mobile = i;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}	
    
}
