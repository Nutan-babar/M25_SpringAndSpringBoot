package com.jexamole.demo.college;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	 	@Id
	    private Integer collegeid;
	    private String collegename;
	    private String location;
	    
	    //default constructor
	    public College() {
			super();
		}
	    
	    //parameterized constructor
		public College(Integer college_id, String college_name, String location) {
			super();
			this.collegeid = college_id;
			this.collegename = college_name;
			this.location = location;
		}
		//getters and setters method
		public Integer getCollege_id() {
			return collegeid;
		}
		public void setCollege_id(Integer college_id) {
			this.collegeid = college_id;
		}
		public String getCollege_name() {
			return collegename;
		}
		public void setCollege_name(String college_name) {
			this.collegename = college_name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
		
		@Override
		public String toString() {
			return "College [college_id=" + collegeid + ", college_name=" + collegename + ", location=" + location + "]";
		}
}
