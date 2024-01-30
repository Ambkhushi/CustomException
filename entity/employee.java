package com.project.employee.entity;
import jakarta.persistence.*;

@Entity
public class employee {
	@Id
	 private Long ohr;
	 private String Name;
	 private String Designation;
	 private String Location;
	
	 public employee(Long ohr, String name, String designation, String location) {
		super();
		this.ohr = ohr;
		Name = name;
		Designation = designation;
		Location = location;
	}

	public Long getOhr() {
		return ohr;
	}

	public void setOhr(Long ohr) {
		this.ohr = ohr;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	@Override
	public String toString() {
		return "employee [ohr=" + ohr + ", Name=" + Name + ", Designation=" + Designation + ", Location=" + Location
				+ "]";
	}
	 
}
