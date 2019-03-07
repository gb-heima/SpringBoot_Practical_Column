package com.gblfy.springboot.pojo;

import javax.persistence.*;

/**
 * @program: springboot_workspace
 * @description: 这里用一句话描述这个类的作用
 * @author: gblfy
 * @create: 2019-02-24 20:49
 */
@Entity
@Table(name = "t_users")
public class Users {

    /**
     * @Id:表明id是主键
     * @GeneratedValue：生成策略
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "address")
    private String address;
    //一个用户有一个角色
    @ManyToOne
    @JoinColumn(name="roles_id")//表示维护外键
    private Roles roles;

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
