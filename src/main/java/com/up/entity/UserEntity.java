package com.up.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: UserEntity
 * @Description: UserEntity
 * @author: zsc
 * @date: 2020/5/14 15:25
 */
@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 7680157451141596561L;

    private String name;

    private Integer age;
}
