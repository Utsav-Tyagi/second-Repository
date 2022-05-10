package com.cg.MapEx2;

import java.util.Objects;

public class Student {
	int rollNo;
	String studName;
	String Course;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", Course=" + Course + "]";
	}
	public Student(int rollNo, String studName, String course) {
		super();
		this.rollNo = rollNo;
		this.studName = studName;
		Course = course;
	}
	 
 
	@Override
	public int hashCode() {
		return Objects.hash(Course, rollNo, studName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Course, other.Course) && rollNo == other.rollNo
				&& Objects.equals(studName, other.studName);
	}
}
