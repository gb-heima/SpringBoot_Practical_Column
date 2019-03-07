package com.gblfy.springboot.service.impl;

import com.gblfy.springboot.pojo.User;
import com.gblfy.springboot.service.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author gblfy
 * @ClassNme UserRepositoryImpl
 * @Description TODO
 * @Date 2019/2/27 14:58
 * @version1.0
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    private static AtomicLong counter = new AtomicLong();//计数器 添加用户/次 +1
    private final ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<Long, User>();

    @Override
    public User saveOrUpdateUser(User user) {
        Long id = user.getId();
        if (id == null) {
            id = counter.incrementAndGet();
            user.setId(id);
        }
        this.userMap.put(id, user);//id 对应 user
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        this.userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.userMap.get(id);
    }

    @Override
    public Collection<User> listUsers() {
//        Collection<User> userList = this.userMap.values();
        return this.userMap.values();
    }
}
