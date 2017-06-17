package edu.mobile.project.platform.service.impl;

import edu.mobile.project.platform.dao.OrderRecordDao;
import edu.mobile.project.platform.dao.ProductDao;
import edu.mobile.project.platform.dao.UsersDao;
import edu.mobile.project.platform.model.BaseObjectResult;
import edu.mobile.project.platform.model.UserStatus;
import edu.mobile.project.platform.pojo.OrderRecordEntity;
import edu.mobile.project.platform.pojo.UsersEntity;
import edu.mobile.project.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by gutia on 2017-05-30.
 */
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UsersDao usersDao;
    @Autowired
    OrderRecordDao orderRecordDao;
    @Autowired
    ProductDao productDao;

    public List<UsersEntity> getTest() {
       return usersDao.getAllUsers();
    }

    public BaseObjectResult<UserStatus> userLogin(String acc, String pass) {
        BaseObjectResult<UserStatus> baseObjectResult = new BaseObjectResult<UserStatus>();
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
            UserStatus userStatus = new UserStatus();
            userStatus.setName(usersEntity.getName());
            userStatus.setbLogin(true);
            userStatus.setUserId(usersEntity.getId());
            baseObjectResult.setData(userStatus);
            baseObjectResult.setSuccess(true);
            baseObjectResult.setMessage("登录成功");
        }
        return baseObjectResult;
    }

    public BaseObjectResult<String> userRegister(String account,  String password, String name,  String emailAddr,  String phone){
        BaseObjectResult<String> baseObjectResult = new BaseObjectResult<String>();
        UsersEntity usersEntity = usersDao.findUserByAccount(account);
        if (usersEntity != null) {
            baseObjectResult.setSuccess(false);
            baseObjectResult.setMessage("用户名已经存在，请重新命名");
            return baseObjectResult;
        }

        if (usersDao.saveUserInfo(account, password, name, emailAddr, phone)) {
            baseObjectResult.setSuccess(true);
            baseObjectResult.setMessage("注册成功");
        }else {
            baseObjectResult.setSuccess(false);
            baseObjectResult.setMessage("注册失败");
        }

        return baseObjectResult;
    }

    public BaseObjectResult<String> savePurchaseInfo(String name, String address, String phone, int money, int payMethod,  int userId, int proId) {
        BaseObjectResult<String> baseObjectResult = new BaseObjectResult<String>();
        List<OrderRecordEntity> orderList = orderRecordDao.findOrderByUserId(userId);
        for (OrderRecordEntity order : orderList) {
            if (order.getProductId() == proId) {
                System.out.println(order.getProductId() + "," + proId);
                baseObjectResult.setSuccess(false);
                baseObjectResult.setMessage("同一用户不能连续购买相同的游戏");
                return baseObjectResult;
            }
        }
        if (orderRecordDao.saveProduct(name, address,phone, money, payMethod, userId, proId)){
            baseObjectResult.setSuccess(true);
            baseObjectResult.setMessage("购买成功");
            return baseObjectResult;
        }

        baseObjectResult.setSuccess(false);
        baseObjectResult.setMessage("因未知原因，购买失败");
        return  baseObjectResult;
    }
}
