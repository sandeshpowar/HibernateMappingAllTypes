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
public class Course {
	private int courseId;
	private String courseName;
	private List<Student> students=new ArrayList();
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
@Id

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
@ManyToMany
@JoinTable(name="stud_course",
			joinColumns= {@JoinColumn(name="studentId")},
			inverseJoinColumns={@JoinColumn(name="courseId")})
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	

}
