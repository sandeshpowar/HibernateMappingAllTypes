package com.scp.hiber.manytomany.MapppingManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	
		private int studentId;
		private String studentName;
		
		private List<Course> courses=new ArrayList();
		
		public Student(int studentId, String studentName) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Id
	
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
		@ManyToMany
		@JoinTable(name="stud_course",
		joinColumns= {@JoinColumn(name="courseId")},
		inverseJoinColumns={@JoinColumn(name="studentId")})
		public List<Course> getCourses() {
			return courses;
		}
		public void setCourses(List<Course> courses) {
			this.courses = courses;
		}
		
}
