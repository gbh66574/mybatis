package com.entor.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.entor.entity.Student;
import com.entor.util.MyBatisUtil;

public class Test2 {
 
	public static void main(String[] args) {
		/* Student s=new Student();
		 s.setId(10010);
		 s.setName("������");
		 s.setUsername("longhongxian");
		 s.setPassword("123");
		 s.setSex(1);
		 s.setAge(23);
		 s.setBirthday(new Date());
		 s.setCreateTime(new Timestamp(System.currentTimeMillis()));
		 ��������
		 SqlSession sqlSession=MyBatisUtil.getSqlSession();
	     sqlSession.insert("com.entor.mapper.StudentMapper.add", s);
	     sqlSession.update("com.entor.mapper.StudentMapper.update", s);
	     sqlSession.commit();
		 sqlSession.close();
*/
//		����id��ѯ
		 /*SqlSession sqlSession=MyBatisUtil.getSqlSession();
		 Student s=(Student)sqlSession.selectOne("com.entor.mapper.StudentMapper.queryById", 10010);
		 System.out.println(s);
		 sqlSession.close();*/
//		��ѯ������¼
		/*SqlSession sqlSession=MyBatisUtil.getSqlSession();
		List<Student> list=sqlSession.selectList("com.entor.mapper.StudentMapper.queryAll");
		for(Student s:list) {
			System.out.println(s);
		}
		sqlSession.close();*/
//		ɾ����¼
		/*SqlSession sqlSession=MyBatisUtil.getSqlSession();
		sqlSession.delete("com.entor.mapper.StudentMapper.deleteAll");
		sqlSession.commit(); 
		sqlSession.close();*/
//		ɾ��������¼
		/*SqlSession sqlSession=MyBatisUtil.getSqlSession();
		sqlSession.delete("com.entor.mapper.StudentMapper.deleteMore","9994,9995,9996,9997".split(","));
		sqlSession.commit(); 
		sqlSession.close();*/
//      ��ҳ��ѯ
		/*SqlSession sqlSession=MyBatisUtil.getSqlSession();
		Map<String,Integer> map=new HashMap<>();
		map.put("start", 0);
		map.put("pageSize", 20);
		List<Student> list=sqlSession.selectList("com.entor.mapper.StudentMapper.queryByPage", map);
		for(Student s:list) {
			System.out.println(s);
		}
		sqlSession.close();*/
		
		/*SqlSession sqlSession=MyBatisUtil.getSqlSession();
		List<Student> list=sqlSession.selectList("com.entor.mapper.StudentMapper.queryByUsername", "%zhangsan13%");
		for(Student s:list) {
			System.out.println(s);
		}
		sqlSession.close();*/
		SqlSession sqlSession=MyBatisUtil.getSqlSession();
		Integer totals=(Integer)sqlSession.selectOne("com.entor.mapper.StudentMapper.getToals");
		System.out.println(totals);
		sqlSession.close();
	}
}
