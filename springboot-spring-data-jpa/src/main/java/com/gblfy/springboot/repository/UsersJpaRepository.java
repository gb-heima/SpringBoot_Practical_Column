package com.gblfy.springboot.repository;

import com.gblfy.springboot.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 参数1：当前将要映射的实体类
 * 参数2:当前将要映射的实体类中id主键类型
 */
@Repository
public interface UsersJpaRepository extends JpaRepository<Users,Integer> {

}
