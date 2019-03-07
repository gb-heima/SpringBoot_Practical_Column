package com.gblfy.springboot.repository;

import com.gblfy.springboot.SpringbootSpringDataJpaApplicationTests;
import com.gblfy.springboot.pojo.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserRepositoryCrudRepositoryTest extends SpringbootSpringDataJpaApplicationTests {


    @Autowired
    private UserRepositoryCrudRepository userRepositoryCrudRepository;

    //保存客户数据
    @Test
    public void saveUsers() {
        Users u = new Users();
        u.setName("guobin");
        u.setAge(25);
        u.setAddress("zhongguohaidian");
        userRepositoryCrudRepository.save(u);
    }

    //更新客户数据
    //和保存数据是一个save方法，
    // 这个方法先判断是不是同一个实体类或者同一个对象，
    // 如果是执行更新操作，如果不是，就执行保存操作
    @Test
    public void updateSave() {
        Users u = new Users();
        u.setId(5);
        u.setName("guobin");
        u.setAge(25);
        u.setAddress("zhongguohaidian");
        userRepositoryCrudRepository.save(u);
    }

    /**
     * 通过id查找数据
     */
    @Test
    public void findById() {
        Optional<Users> users = userRepositoryCrudRepository.findById(5);
        System.out.println(users);
        }

    /**
     * 查询全部数据
     */
    @Test
    public void findAll() {
        Iterable<Users> list = userRepositoryCrudRepository.findAll();
        for (Users users : list) {
            System.out.println(users);
        }
    }

    /**
     * 通过id删除数据
     */
    @Test
    public void deleteById() {
        this.userRepositoryCrudRepository.deleteById(5);
    }
}