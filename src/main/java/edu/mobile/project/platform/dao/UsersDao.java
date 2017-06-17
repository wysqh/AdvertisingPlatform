package edu.mobile.project.platform.dao;

import edu.mobile.project.platform.pojo.UsersEntity;

import java.util.List;

/**
 * Created by gutia on 2017-05-29.
 */
public interface UsersDao {
    List<UsersEntity> getAllUsers();
    UsersEntity findUserByAccount(String account);
    public boolean saveUserInfo(String account, String password, String name, String emailAddr, String phone);
}
