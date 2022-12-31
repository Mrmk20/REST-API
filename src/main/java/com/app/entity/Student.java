package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stutab")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private Integer studentId;
	
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

	public String getStudentAddresss() {
		return studentAddresss;
	}

	public void setStudentAddresss(String studentAddresss) {
		this.studentAddresss = studentAddresss;
	}

	public Double getStudentAvg() {
		return studentAvg;
	}

	public void setStudentAvg(Double studentAvg) {
		this.studentAvg = studentAvg;
	}

	@Column(name = "sname")
	private String studentName;
	
	@Column(name = "sadd")
	private String studentAddresss;
	
	@Column(name = "avg")
	private Double studentAvg;

	
	}

		
	

