package edu.mobile.project.platform.controller;

import edu.mobile.project.platform.model.BaseObjectResult;
import edu.mobile.project.platform.model.UserStatus;
import edu.mobile.project.platform.service.UserService;
import edu.mobile.project.platform.utils.ConstUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gutia on 2017-05-30.
 */
@Controller
@RequestMapping(ConstUtil.USERS)
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(ConstUtil.LOGIN)
    @ResponseBody
    public BaseObjectResult<UserStatus> login(@RequestParam String userAcc, @RequestParam String userPass) {
        return userService.userLogin(userAcc, userPass);
    }

    @RequestMapping(ConstUtil.REGISTER)
    @ResponseBody
    public BaseObjectResult<String> register(@RequestParam String account, @RequestParam String password,
                                             @RequestParam String name, @RequestParam String emailAddr, @RequestParam String phone){
        return userService.userRegister(account, password, name, emailAddr, phone);
    }

    @RequestMapping(ConstUtil.SAVE_PURCHASE_INFO)
    @ResponseBody
    public BaseObjectResult<String> savePurchaseInfo(@RequestParam String name, @RequestParam String address,@RequestParam String phone,
                                                     @RequestParam String  money, @RequestParam int payMethod, @RequestParam int userId, @RequestParam int proId){
        return userService.savePurchaseInfo(name,address,phone,Integer.parseInt(money), payMethod, userId, proId);
    }
}
