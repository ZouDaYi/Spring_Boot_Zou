package com.sxy.service;

import com.sxy.pojo.User;
import com.sxy.pojo.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/26.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Integer addUser(User user){
        Integer result=userMapper.addUser(user.getName(),user.getAge());
        return result;
    }

}
