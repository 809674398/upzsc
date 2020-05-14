package com.up.dao;

import com.up.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: userDAO
 * @Description: userDAO
 * @author: zsc
 * @date: 2020/5/14 15:23
 */
@Mapper
@Component
public interface UserDAO {

    /**
     * 获取所有用户
     * @author zsc
     * @return: java.util.List<com.up.entity.UserEntity>
     * @date 2020/5/14 15:42
    **/
    List<UserEntity> getAllUser();

}
