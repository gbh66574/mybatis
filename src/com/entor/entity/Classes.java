package com.entor.entity;

import java.util.List;

public class Classes {
private int id;
private String name;
//一对多关系中，在一方的实体类中添加多方类集合属性
private List<Student> student;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public List<Student> getStudent() {
	return student;
}
public void setStudent(List<Student> student) {
	this.student = student;
}
@Override
public String toString() {
	return "Classes [id=" + id + ", name=" + name + "]";
}
public Classes(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Classes() {
	super();
}

}
