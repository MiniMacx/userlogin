package org.userlogin.entity;

/**
 * 用户实体类
 * Created by airmacx on 17-3-21.
 */
public class User {
    private String username;
    private String password;


    public User(){

    }

    public User( String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
