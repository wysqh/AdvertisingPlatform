package edu.mobile.project.platform.service.impl;

import edu.mobile.project.platform.dao.UsersDao;
import edu.mobile.project.platform.model.BaseObjectResult;
import edu.mobile.project.platform.pojo.UsersEntity;
import edu.mobile.project.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gutia on 2017-05-30.
 */
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UsersDao usersDao;

    public List<UsersEntity> getTest() {
       return usersDao.getAllUsers();
    }

    public BaseObjectResult<String> userLogin(String acc, String pass) {
        BaseObjectResult<String> baseObjectResult = new BaseObjectResult<String>();
        UsersEntity usersEntity = usersDao.findUserByAccount(acc);
        if ( usersEntity == null) {
            baseObjectResult.setSuccess(false);
            baseObjectResult.setMessage("账号不存在");
        }
        else if (!usersEntity.getPassword().equals(pass)){
            baseObjectResult.setSuccess(false);
            baseObjectResult.setMessage("密码错误");
        }
        else{
            baseObjectResult.setSuccess(true);
            baseObjectResult.setMessage("登录成功");
        }
        return baseObjectResult;
    }
}
