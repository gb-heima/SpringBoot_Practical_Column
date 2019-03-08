package com.gblfy.springboot.repository;

import com.gblfy.springboot.SpringbootSpringDataJpaApplicationTests;
import com.gblfy.springboot.pojo.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositorySpecificationTest extends SpringbootSpringDataJpaApplicationTests {


    @Autowired
    private UsersRepositorySpecification usersRepositorySpecification;

    /**
     * jpaSpecificationExecutor 接口 单条件测试
     */
    @Test
    public void jpaSpecificationExecutor() {
        /**
         * Specification<Users> 用于封装条件
         */
        Specification<Users> spec = new Specification<Users>() {
            /**
             * Root<Users>:查询对象属性封装
             * CriteriaQuery<?> query:疯长了我们要执行的查询中各个部分的信息，select from order
             * CriteriaBuilder:查询条件的构造器，定义不同查询条件
             * @param root
             * @param query
             * @param criteriaBuilder
             * @return
             */
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                /**
                 * 参数1：查询的属性
                 * 参数2：查询的指
                 */
                Predicate pre = criteriaBuilder.equal(root.get("name"), "zhanga");

                return pre;
            }
        };
        List<Users> list = usersRepositorySpecification.findAll(spec);
        for (Users users : list) {
            System.out.println(users);
        }
    }

    /**
     * jpaSpecificationExecutor 接口 多条件测试1
     */
    @Test
    public void jpaSpecificationExecutor2() {
        /**
         * Specification<Users> 用于封装条件
         */
        Specification<Users> spec = new Specification<Users>() {
            /**
             * Root<Users>:查询对象属性封装
             * CriteriaQuery<?> query:疯长了我们要执行的查询中各个部分的信息，select from order
             * CriteriaBuilder:查询条件的构造器，定义不同查询条件
             * @param root
             * @param query
             * @param criteriaBuilder
             * @return
             */
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                /**
                 * where name='zhanga' and age = 20
                 * 参数2：查询的指
                 */
                List<Predicate> list = new ArrayList<>();
                list.add(criteriaBuilder.equal(root.get("name"), "zhanga"));
                list.add(criteriaBuilder.equal(root.get("age"), 22));
                Predicate[] arr = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(arr));
            }
        };
        List<Users> list = usersRepositorySpecification.findAll(spec);
        for (Users users : list) {
            System.out.println(users);
        }
    }

    /**
     * jpaSpecificationExecutor 接口 多条件测试2
     */
    @Test
    public void jpaSpecificationExecutor3() {
        /**
         * Specification<Users> 用于封装条件
         */
        Specification<Users> spec = new Specification<Users>() {
            /**
             * Root<Users>:查询对象属性封装
             * CriteriaQuery<?> query:疯长了我们要执行的查询中各个部分的信息，select from order
             * CriteriaBuilder:查询条件的构造器，定义不同查询条件
             * @param root
             * @param query
             * @param cb
             * @return
             */
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                /**
                 * where name='zhanga' and age = 20
                 * 参数2：查询的指
                 */
//                List<Predicate> list = new ArrayList<>();
//                list.add(criteriaBuilder.equal(root.get("name"), "zhanga"));
//                list.add(criteriaBuilder.equal(root.get("age"), 22));
//                Predicate[] arr = new Predicate[list.size()];
                //只有and
//                return cb.and(cb.equal(root.get("name"),"zhanga"),cb.equal(root.get("age"),22));
                //只有or
//                return cb.or(cb.equal(root.get("name"),"zhanga"),cb.equal(root.get("age"),22));
                //and+or
                //name='zhanga' and age=22 or id =2   and 的优先级高于or 相当于
                //(name='zhanga' and age=22) or id =2
                return cb.or(cb.equal(root.get("name"), "zhanga"), cb.equal(root.get("age"), 22), cb.equal(root.get("id"), 2));
            }
        };
        //添加排序规则
        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC,"id"));
        List<Users> list = usersRepositorySpecification.findAll(spec,sort);
        for (Users users : list) {
            System.out.println(users);
        }
    }
}