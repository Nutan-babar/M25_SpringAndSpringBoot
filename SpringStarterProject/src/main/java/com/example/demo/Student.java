package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int rollno;
	private String name;
	
	//setters and getters method to access private data members
	/*public int getRollno() {
		return rollno;
	}*/
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/*public String getName() {
		return name;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	 //user defined method
         public void print() {
        	 System.out.println("welcome to M25 batch");
    }
         //defult constructor
		public Student() {
			super();
			System.out.println("welcome to TNS India Foundation");
		}
}
