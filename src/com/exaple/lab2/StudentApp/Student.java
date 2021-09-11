package com.exaple.lab2.StudentApp;

public class Student implements Comparable<Student> {
	
	int no;
	String name; 
	int age;

	public Student(int no, String name, int age) {
		// TODO Auto-generated constructor stub
		this.no = no;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	public String toString() {
		return "Student [no="+no+", name="+name+", age="+age+"]";
	}

}
