package org.userlogin.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.userlogin.entity.User;

import javax.annotation.Resource;

/**
 * Created by airmacx on 17-3-21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class LoginDaoTest {
    @Resource
    private LoginDao loginDao;
    @Test
    public void getUserByNameTest() throws Exception{
        String username="airmacx";
        User u=loginDao.getUserByName(username);
        System.out.println(u.getUsername());

    }
}
