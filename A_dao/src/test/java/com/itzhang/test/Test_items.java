package com.itzhang.test;

import com.itzhang.dao.ItemsDao;
import com.itzhang.domian.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_items {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        /*SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession session = sqlSessionFactory.openSession();
        ItemsDao mapper = session.getMapper(ItemsDao.class);
        Items byId = mapper.findById(2);
        System.out.println(byId);*/

        ItemsDao dao = context.getBean(ItemsDao.class);
        Items byId = dao.findById(1);
        System.out.println(byId);
    }
}
