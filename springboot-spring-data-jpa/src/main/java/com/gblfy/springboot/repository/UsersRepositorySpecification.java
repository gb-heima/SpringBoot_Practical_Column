package com.gblfy.springboot.repository;

import com.gblfy.springboot.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepositorySpecification extends JpaRepository<Users,Integer>, JpaSpecificationExecutor<Users> {
}
