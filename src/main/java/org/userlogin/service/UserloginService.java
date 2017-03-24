package org.userlogin.service;

/**
 * Created by airmacx on 17-3-21.
 */
public interface UserloginService {

    /**
     * 检查注册用户名是否重复
     * 新用户返回true,否则false
     * @param username
     */
    public boolean checkReg(String username);


    /**
     * 检查登录信息是否一致
     * @param username
     * @param password
     */
    public boolean checkLogin(String username,String password);
}
