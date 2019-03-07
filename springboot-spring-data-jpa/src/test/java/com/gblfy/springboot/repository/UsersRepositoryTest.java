package com.gblfy.springboot.repository;

import com.gblfy.springboot.SpringbootSpringDataJpaApplicationTests;
import com.gblfy.springboot.pojo.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;

public class UsersRepositoryTest extends SpringbootSpringDataJpaApplicationTests {


    @Autowired
    private UsersJpaRepository usersJpaRepository;

    @Test
    public void save(){
        Users u =new Users();
        u.setName("zhangsan");
        u.setAge(22);
        u.setAddress("zhongguohaidian");
        usersJpaRepository.save(u);
    }

    /**
     * RepositoryPagingAndSorting 接口排序
     */
    @Test
    public void pagingAndSorting() {
        //order 定义排序规则
        Sort.Order order = new Sort.Order(Sort.Direction.DESC, "id");
        //sort对象封装了排序规则
        Sort sort = new Sort(order);
        List<Users> list = usersJpaRepository.findAll(sort);
        for (Users users : list) {
            System.out.println(users);
        }
    }
}