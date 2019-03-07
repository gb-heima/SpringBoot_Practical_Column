package com.gblfy.springboot.service.impl;

import com.gblfy.springboot.entity.User;
import com.gblfy.springboot.repository.UserMapper;
import com.gblfy.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author gblfy
 * @ClassNme UsersServiceImpl
 * @Description TODO
 * @Date 2019/2/22 18:33
 * @version1.0
 */
@Service
@Transactional//事物
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper usersMapper;

    @Override
    public void deleteByPrimaryKey(Integer id) {
        usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User user) {
        return usersMapper.insert(user);
    }

    @Override
    public int insertSelective(User record) {
        return usersMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll() {
        return usersMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void updateByPrimaryKey(User record) {
        usersMapper.updateByPrimaryKey(record);
    }
}
