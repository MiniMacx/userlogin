package org.userlogin.dao;

import org.apache.ibatis.annotations.Param;
import org.userlogin.entity.User;

/**
 * Created by airmacx on 17-3-21.
 */
public interface RegDao {
    /**
     * 插入注册信息于表中
     * @param username
     * @param password
     */
     boolean userReg(@Param("username") String username,@Param("password") String password);

     User findUserByName(String name);
}
