package org.userlogin.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by airmacx on 17-3-21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
                        "classpath:spring/spring-service.xml"})
public class LoginServiceTest {
    @Resource
    private UserloginService userloginService;

    @Test
    public void checkRegTest() throws Exception{
        String name="airmacx";

        System.out.println(userloginService.checkReg(name));
    }

    @Test
    public void checkLoginTest() throws Exception{
        String name="airmacx";
        String password="airmacx";
        System.out.println(userloginService.checkLogin(name,password));
    }
}
