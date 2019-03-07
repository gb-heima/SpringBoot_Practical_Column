package com.gblfy.springboot.service;

import com.gblfy.springboot.pojo.User;

import java.util.Collection;

/**
 * @author gblfy
 * @ClassNme UserRepository
 * @Description TODO
 * @Date 2019/2/27 14:55
 * @version1.0
 */
public interface UserRepository {
    /**
     * 保存或更新用户
     *
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 根据id删除用户
     *
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据id查询用户
     *
     * @param id
     */
    User getUserById(Long id);

    /**
     * 查询用户列表
     */
    Collection<User> listUsers();
}
