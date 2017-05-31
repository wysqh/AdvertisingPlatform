package edu.mobile.project.platform.controller;

import edu.mobile.project.platform.model.BaseObjectResult;
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
    public BaseObjectResult<String> login(@RequestParam String userAcc, @RequestParam String userPass) {
        return userService.userLogin(userAcc, userPass);
    }
}
