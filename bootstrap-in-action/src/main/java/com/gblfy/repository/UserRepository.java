package com.gblfy.repository;

import com.gblfy.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author gblfy
 * @ClassNme UserRepository
 * @Description TODO
 * @Date 2019/2/27 14:55
 * @version1.0
 */
public interface UserRepository extends JpaRepository<User,Long> {
}