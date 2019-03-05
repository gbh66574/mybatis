package com.entor.test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.entor.entity.Student;

public class Test {
	public static void main(String[] args) {
	 Student s=new Student();
	 s.setId(10009);
	 s.setName("����1");
	 s.setUsername("wangwu1");
	 s.setPassword("123");
	 s.setSex(1);
	 s.setAge(23);
	 s.setBirthday(new Date());
	 s.setCreateTime(new Timestamp(System.currentTimeMillis()));
		try {
//		 1.��ȡ�����ļ����ַ���������
		 Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
//		 2.�������ݿ�־ò����ػ�����
		 SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
//		 3.�������ݿ�Ự���Ӷ���,sqlSession����������jdbc��Connection����
		 SqlSession sqlSession =sqlSessionFactory.openSession();
//		 4.ִ�����ݿ����
//		 sqlSession.insert("com.entor.mapper.StudentMapper.add", s);
		 sqlSession.update("com.entor.mapper.StudentMapper.update", s);
//		 5�ύ����
		 sqlSession.commit();
//		 6.�رջỰ����
		 sqlSession.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
