package com.entor.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.entor.dao.StudentDao;
import com.entor.entity.Classes;
import com.entor.entity.Student;
import com.entor.util.MyBatisUtil;

public class Test4 {

	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		StudentDao dao = sqlSession.getMapper(StudentDao.class);
//		Student s = new Student();
//		s.setId(10022);
//		s.setName("ÁúºìÏß4");
//		s.setUsername("longhongxian4");
//		s.setPassword("1234");
//		s.setSex(1);
//		s.setAge(23);
//		s.setBirthday(new Date());
//		s.setCreateTime(new Timestamp(System.currentTimeMillis()));
//		dao.add(s);
//		dao.update(s);
//		sqlSession.commit();
//		Student s=dao.queryById(10022);
//		System.out.println(s);
//		List<Student>list=dao.queryAll();
//		for(Student s:list) {
//			System.out.println(s);
//		}
		
//		List<Student>list=dao.queryByPage(0,10);
//		for(Student s:list) {
//			System.out.println(s);
//		}
//		List<Student>list=new ArrayList<>();
//		for(int i=1;i<=10;i++) {
//			Student s = new Student();
//			 s.setName("Áúºì2"+i);
//			 s.setUsername("longhon2"+i);
//			 s.setPassword("123");
//			 s.setSex(1);
//			 s.setAge(23);
//			 s.setBirthday(new Date());
//			 s.setCreateTime(new Timestamp(System.currentTimeMillis()));
//			 list.add(s);
//		}
//		dao.addMore(list);
//		sqlSession.commit();;
//		Map<String, String>map=new HashMap<>();
//		map.put("name", "ÕÅ");
//		map.put("username", "zhangsan1");
//		map.put("sex", "1");
//		List<Student>list=dao.queryByCondition(map);
//		for(Student s:list) {
//			System.out.println(s);
//		}
//		Student s=dao.queryClassesBySid(2);
//		System.out.println(s);
//		System.out.println(s.getClasses());
		Classes c=dao.queryClassesByCid(3);
			System.out.println(c);
		for(Student s:c.getStudent()) {
			System.out.println(s);
		}
		sqlSession.close();
	}
}
