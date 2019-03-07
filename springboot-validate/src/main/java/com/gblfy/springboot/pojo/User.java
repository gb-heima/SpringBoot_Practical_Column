package com.gblfy.springboot.pojo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * @program: springboot_workspace
 * @description: 这里用一句话描述这个类的作用
 * @author: gblfy
 * @create: 2019-02-23 21:46
 */
public class User {

    @NotBlank(message = "用户名不能为空")//非空校验
    @Length(min = 2, max = 8,message = "最小长度为2，最大长度为8")
    private String name;
    @NotEmpty//非空校验
    private String password;
    @Min(value = 18)
    private Integer age;
    @Email
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
