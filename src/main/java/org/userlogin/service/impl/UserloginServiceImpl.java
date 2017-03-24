package org.userlogin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.userlogin.dao.LoginDao;
import org.userlogin.dao.RegDao;
import org.userlogin.entity.User;
import org.userlogin.exception.UserNotFoundException;
import org.userlogin.service.UserloginService;

import javax.annotation.Resource;

/**
 * Created by airmacx on 17-3-21.
 */
@Service
public class UserloginServiceImpl implements UserloginService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LoginDao loginDao;
    @Resource
    private RegDao regDao;

    public boolean checkReg(String username) {
        try{
            User u=regDao.findUserByName(username);
            if(u==null){
                return true;
            }
            else {
                return false;
            }
        }catch (Exception e1){
            logger.error(e1.getMessage(),e1);
            throw new UserNotFoundException(e1.getMessage());

        }

    }

    public boolean checkLogin(String username, String password) {
        try{
            User u= loginDao.getUserByName(username);
            if(u!=null && u.getPassword().equals(password)){
                return true;
            }else {
                return false;
            }
        }catch (Exception e1){
            logger.error(e1.getMessage(),e1);
            throw new UserNotFoundException(e1.getMessage());
        }

    }
}
