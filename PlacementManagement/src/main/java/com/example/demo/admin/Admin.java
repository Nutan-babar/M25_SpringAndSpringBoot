package com.example.demo.admin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin 
{
	@Id
	private Integer id;
	private String name;
	private Integer password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(Integer id, String name, Integer password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	//default constructor
	
	
	
	


}