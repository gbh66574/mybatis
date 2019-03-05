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
	 s.setName("王五1");
	 s.setUsername("wangwu1");
	 s.setPassword("123");
	 s.setSex(1);
	 s.setAge(23);
	 s.setBirthday(new Date());
	 s.setCreateTime(new Timestamp(System.currentTimeMillis()));
		try {
//		 1.读取配置文件到字符输入流中
		 Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
//		 2.创建数据库持久操作回话工厂
		 SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
//		 3.创建数据库会话连接对象,sqlSession对象类似于jdbc的Connection对象
		 SqlSession sqlSession =sqlSessionFactory.openSession();
//		 4.执行数据库操作
//		 sqlSession.insert("com.entor.mapper.StudentMapper.add", s);
		 sqlSession.update("com.entor.mapper.StudentMapper.update", s);
//		 5提交数据
		 sqlSession.commit();
//		 6.关闭会话连接
		 sqlSession.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
