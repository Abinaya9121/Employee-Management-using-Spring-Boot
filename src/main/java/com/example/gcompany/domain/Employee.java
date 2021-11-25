package com.example.gcompany.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String ename;
    private String mobile;
    private float salary;
    
    private int age;
    private String address;
    private String email;
    private String department;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee() {

	}
	
	
	public Employee(Long id, String ename, String mobile, float salary, int age, String address, String email,
			String department) {
		super();
		this.id = id;
		this.ename = ename;
		this.mobile = mobile;
		this.salary = salary;
		this.age = age;
		this.address = address;
		this.email = email;
		this.department = department;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
 
    
}
