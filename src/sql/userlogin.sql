CREATE DATABASE userlogin;

use userlogin;

  CREATE TABLE userinfo (
    `username` VARCHAR(16)        NOT NULL
    COMMENT '用户名',
    `password` VARCHAR(16)        NOT NULL
    COMMENT '用户密码',
    PRIMARY KEY (username)
  )ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='用户信息表';

INSERT INTO userinfo (username,password) VALUES ("airmacx","airmacx");