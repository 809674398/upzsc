package com.up.service.impl;

import com.up.dao.UserDAO;
import com.up.entity.UserEntity;
import com.up.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: UserServiceImpl
 * @author: zsc
 * @date: 2020/5/14 15:44
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    /**
     * 获取所有用户
     * @author zsc
     * @return: java.lang.String
     * @date 2020/5/14 15:50
    **/
    @Override
    public String findAllUser() {
        List<UserEntity> allUser = userDAO.getAllUser();
        return null == allUser ? null : allUser.toString();
    }
}
