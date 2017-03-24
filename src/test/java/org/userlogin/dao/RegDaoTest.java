package org.userlogin.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.userlogin.entity.User;

import javax.annotation.Resource;

/**
 * Created by airmacx on 17-3-21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class RegDaoTest {
    @Resource
    private RegDao regDao;

    @Test
    public void UserRegtest(){
        String username="macx";
        String password="macx";
        System.out.println("THE RESULT IS  "+regDao.userReg(username,password));
    }


    @Test
    public void findUserByNameTest()throws Exception{
        String username="macx";
        User u=regDao.findUserByName(username);
        System.out.println(u);
    }
}
