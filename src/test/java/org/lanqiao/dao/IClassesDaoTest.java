package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ssc on 2017/9/4.
 */
//告诉类这是spring和junit4的整合测试类
@RunWith(SpringJUnit4ClassRunner.class)
//加载spring配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IClassesDaoTest {


    @Autowired
    IClassesDao classesDao;
    @Test
    public void getAllClassInfo() throws Exception {

        System.out.println(classesDao.getAllClass());
    }
    @Test
    public void getClassInfoById() throws Exception {
        System.out.println(classesDao.getClassInfoById(1));
    }

}