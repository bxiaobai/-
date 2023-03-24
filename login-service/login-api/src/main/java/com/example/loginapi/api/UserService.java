package com.example.loginapi.api;

import com.example.commonutils.po.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commonutils.utils.CommonResult;

/**
* @author Administrator
* @description 针对表【u_user】的数据库操作Service
* @createDate 2023-03-24 14:00:24
*/
public interface UserService extends IService<User> {


    CommonResult login(String name, String password);
}
