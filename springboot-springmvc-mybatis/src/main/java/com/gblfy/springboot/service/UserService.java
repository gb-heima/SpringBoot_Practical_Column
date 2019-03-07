package com.gblfy.springboot.service;

import com.gblfy.springboot.entity.User;

import java.util.List;

/**
 * @author gblfy
 * @ClassNme UsersService
 * @Description TODO
 * @Date 2019/2/22 18:32
 * @version1.0
 */
public interface UserService {

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    void deleteByPrimaryKey(Integer id);

    /**
     * 新增用户
     *
     * @param record
     * @return
     */
    int insert(User record);

    int insertSelective(User record);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

    /**
     * 更新用户信息
     *
     * @param record
     * @return
     */
    void updateByPrimaryKey(User record);
}
