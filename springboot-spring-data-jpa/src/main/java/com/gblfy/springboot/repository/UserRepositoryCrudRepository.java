package com.gblfy.springboot.repository;

import com.gblfy.springboot.pojo.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryCrudRepository extends CrudRepository<Users,Integer> {
}
