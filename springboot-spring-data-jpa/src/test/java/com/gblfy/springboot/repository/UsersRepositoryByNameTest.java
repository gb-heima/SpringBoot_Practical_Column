package com.gblfy.springboot.repository;

import com.gblfy.springboot.SpringbootSpringDataJpaApplicationTests;
import com.gblfy.springboot.pojo.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsersRepositoryByNameTest extends SpringbootSpringDataJpaApplicationTests {

    @Autowired
    private UsersRepositoryByName usersRepositoryByName;

    //通过name查询人名
    @Test
    public void findByName() {
        List<Users> list = usersRepositoryByName.findByName("zhangsan");
        for (Users users : list) {
            System.out.println(users);
        }
    }

    //通过name和age，都满足的数据
    @Test
    public void findByNameAndAge() {
        List<Users> list = usersRepositoryByName.findByNameAndAge("zhangsan", 22);
        for (Users users : list) {
            System.out.println(users);
        }
    }

    // 查询like name
    // 测试的参数可以是{"zhang%","%zhang%"}
    // 测试的参数如果是{"zhang"},意味着精确查找name为zhang的数据
    @Test
    public void findByNameLike() {
        List<Users> list = usersRepositoryByName.findByNameLike("zhang%");
        for (Users users : list) {
            System.out.println(users);
        }
    }

    //查询以name开头的，满足条件的数据
    @Test
    public void findByNameStartsWith() {
        List<Users> list = usersRepositoryByName.findByNameStartsWith("zhang");
        for (Users users : list) {
            System.out.println(users);
        }
    }

    //查询以name结尾的数据
    @Test
    public void findByNameEndingWith() {
        List<Users> list = usersRepositoryByName.findByNameEndingWith("a");
        for (Users users : list) {
            System.out.println(users);
        }
    }

}