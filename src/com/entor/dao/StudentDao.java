package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.Classes;
import com.entor.entity.Student;

public interface StudentDao {

	public void add(Student s);
	public void deleteById(int id);
	public void deleteMore(String ids);
	public void update(Student s);
	public Student queryById(int id);
	public List<Student> queryAll();
	public List<Student> queryByPage(int start,int pageSize,String condition);
	public int getTotals();
	public List<Student> queryByPage(int currentPage,int pageSize);
	public int getTotals(String condtion);
	public void addMore(List<Student> list);
	public List<Student> queryByCondition(Map<String, String>map);
	public Student queryClassesBySid(int id);
	public Classes queryClassesByCid(int cid);
}
