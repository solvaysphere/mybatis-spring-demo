package com.hpuswl.mybatis.spring;

import com.hpuswl.mybatis.spring.config.MybatisConfig;
import com.hpuswl.mybatis.spring.entity.User;
import com.hpuswl.mybatis.spring.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {
    public static ApplicationContext getClassPathXmlApplicationContext(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        return applicationContext;
    }

    public static ApplicationContext getAnnotationConfigApplicationContext(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MybatisConfig.class);
        return applicationContext;
    }

    public static void main(String[] args) {
       /* ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object sqlSessionFactory = applicationContext.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MybatisConfig.class);
        SqlSessionFactory sessionFactory = applicationContext.getBean(SqlSessionFactory.class);
        System.out.println(sessionFactory);*/

        /*ApplicationContext applicationContext = getClassPathXmlApplicationContext();
        SqlSessionFactory sqlSessionFactory = applicationContext.getBean(SqlSessionFactory.class);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User saveUser = new User();
            saveUser.setUserName("zhang3");
            mapper.insertUser(saveUser);
            sqlSession.commit();
            System.out.println(saveUser);
            User user = mapper.getUser(1L);
            System.out.println(user);
        }*/

        /*ApplicationContext applicationContext = getAnnotationConfigApplicationContext();
        SqlSessionFactory sqlSessionFactory = applicationContext.getBean(SqlSessionFactory.class);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User saveUser = new User();
            saveUser.setUserName("li4");
            mapper.insertUser(saveUser);
            sqlSession.commit();
            System.out.println(saveUser);
            User user = mapper.getUser(1L);
            System.out.println(user);
        }*/

       /* ApplicationContext applicationContext = getClassPathXmlApplicationContext();

        SqlSessionFactory sqlSessionFactory = applicationContext.getBean(SqlSessionFactory.class);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUser(1L);
            System.out.println(user);
        }*/


        ApplicationContext applicationContext = getAnnotationConfigApplicationContext();

        SqlSessionFactory sqlSessionFactory = applicationContext.getBean(SqlSessionFactory.class);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUser(2L);
            System.out.println(user);
        }
    }
}
