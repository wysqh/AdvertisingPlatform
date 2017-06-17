package edu.mobile.project.platform.service;

import edu.mobile.project.platform.model.BaseObjectResult;
import edu.mobile.project.platform.model.UserStatus;
import edu.mobile.project.platform.pojo.UsersEntity;

import java.util.List;

/**
 * Created by gutia on 2017-05-30.
 */
public interface UserService {
    List<UsersEntity> getTest();
    BaseObjectResult<UserStatus> userLogin(String acc, String pass);
    BaseObjectResult<String> userRegister(String account,  String password, String name,  String emailAddr,  String phone);
    BaseObjectResult<String> savePurchaseInfo(String name, String address, String phone, int money, int payMethod,  int userId, int proId);
}
