package com.gblfy.springboot.repository;

import com.gblfy.springboot.entity.User;

import java.util.List;

public interface UserMapper {
    void deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    void updateByPrimaryKey(User record);

    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<User> selectAll();
}