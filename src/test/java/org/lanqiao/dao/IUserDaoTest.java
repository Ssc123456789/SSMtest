package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssc on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {


    @Autowired
    private IUserDao iUserDao;
    @Test
    public void updateUserCondition() throws Exception {
        User user=new User();
        user.setName("ssc");
        user.setId(3);
        iUserDao.updateUserCondition(user);
    }
    @Test
    public void getUserIn() throws Exception {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        iUserDao.getUserIn(list);
        System.out.println(iUserDao.getUserIn(list));
    }

}