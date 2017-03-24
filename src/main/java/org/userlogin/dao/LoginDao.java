package org.userlogin.dao;

import org.userlogin.entity.User;

/**
 * 登录DAO
 * Created by airmacx on 17-3-21.
 */
public interface LoginDao {
     User getUserByName(String username);
}
