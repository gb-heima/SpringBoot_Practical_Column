package com.gblfy.springboot.repository;

import com.gblfy.springboot.pojo.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author gblfy
 * @ClassNme UserRepositoryPagingAndSorting
 * @Description TODO
 * @Date 2019/2/25 11:24
 * @version1.0
 */
@Repository
public interface UserRepositoryPagingAndSorting extends PagingAndSortingRepository<Users,Integer> {
}
