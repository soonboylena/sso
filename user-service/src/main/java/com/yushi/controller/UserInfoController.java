package com.yushi.controller;

import com.yushi.model.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunb on 2017/6/20.
 */

@RestController
public class UserInfoController {

    @GetMapping("/{id}")
    public UserInfo getUser(@PathVariable String id) {

        UserInfo user = new UserInfo();
        user.setId(id);
        user.setName("张三");

        return user;
    }


}
