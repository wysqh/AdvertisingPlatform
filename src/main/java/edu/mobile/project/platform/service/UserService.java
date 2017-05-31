package edu.mobile.project.platform.service;

import edu.mobile.project.platform.model.BaseObjectResult;
import edu.mobile.project.platform.pojo.UsersEntity;

import java.util.List;

/**
 * Created by gutia on 2017-05-30.
 */
public interface UserService {
    List<UsersEntity> getTest();
    BaseObjectResult<String> userLogin(String acc, String pass);
}
