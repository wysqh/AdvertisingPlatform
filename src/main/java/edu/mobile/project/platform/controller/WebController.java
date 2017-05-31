package edu.mobile.project.platform.controller;

import edu.mobile.project.platform.service.UserService;
import edu.mobile.project.platform.utils.ConstUtil;
import edu.mobile.project.platform.dao.UsersDao;
import edu.mobile.project.platform.pojo.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gutia on 2017-05-29.
 */
@Controller
public class WebController {
    @Autowired
    UserService userService;

    @RequestMapping(value = ConstUtil.test)
    @ResponseBody
    public List<UsersEntity> testSpring(){
        return userService.getTest();
    }
}
