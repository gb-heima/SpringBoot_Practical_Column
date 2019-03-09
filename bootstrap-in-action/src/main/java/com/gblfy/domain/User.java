package com.gblfy.domain;

import javax.persistence.*;

/**
 * @author gblfy
 * @ClassNme User
 * @Description TODO
 * @Date 2019/2/27 14:36
 * @version1.0
 */
@Entity//实体
public class User {

    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增策略
    private Long id;//唯一标识
    @Column(name = "")
    private String name;
    private String email;

    protected User() {//无参构造 设为protected 防止直接使用
    }

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("User[id=%d,name='%s',,email='%s']", id, name, email);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
