package com.gblfy.springboot.repository;

import com.gblfy.springboot.SpringbootSpringDataJpaApplicationTests;
import com.gblfy.springboot.pojo.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class UserRepositoryPagingAndSortingTest extends SpringbootSpringDataJpaApplicationTests {

    @Autowired
    private UserRepositoryPagingAndSorting userRepositoryPagingAndSorting;

    /**
     * RepositoryPagingAndSorting 接口排序
     */
    @Test
    public void pagingAndSorting() {
        //order 定义排序规则
        Sort.Order order = new Sort.Order(Sort.Direction.DESC, "id");
        //sort对象封装了排序规则
        Sort sort = new Sort(order);
        List<Users> list = (List<Users>) userRepositoryPagingAndSorting.findAll(sort);
//        Iterable<Users> list = userRepositoryPagingAndSorting.findAll(sort);
        for (Users users : list) {
            System.out.println(users);
        }
    }

    /**
     * RepositoryPagingAndSorting 接口 分页
     */
    @Test
    public void pagingAndSorting2() {
//      Pageable:封装了分页的参数，当前页，每页显示的条数，他的当前页是从0开始的
//      PageRequest(page,size): page 当前页  size 每页显示的条数
        //第一页 显示数量2 如果不够2条就显示应有条数
//      Pageable pageable = new PageRequest(0, 2);
        Pageable pageable = new PageRequest(1, 2);
//        返回值Page对象
        Page<Users> page = userRepositoryPagingAndSorting.findAll(pageable);
        System.out.println("总条数:" + page.getTotalElements());
        System.out.println("总页数:" + page.getTotalPages());
        List<Users> list = page.getContent();
        for (Users users : list) {
            System.out.println(users);
        }
    }
    /**
     * RepositoryPagingAndSorting 接口 排序+分页
     */
    @Test
    public void pagingAndSorting3() {
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(0,2,sort);
        Page<Users> page = userRepositoryPagingAndSorting.findAll(pageable);
        System.out.println("总条数:" + page.getTotalElements());
        System.out.println("总页数:" + page.getTotalPages());
        List<Users> list = page.getContent();
        for (Users users : list) {
            System.out.println(users);
        }
    }

}