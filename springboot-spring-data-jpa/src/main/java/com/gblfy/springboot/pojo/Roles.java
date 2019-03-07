package com.gblfy.springboot.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author gblfy
 * @ClassNme Roles
 * @Description TODO
 * @Date 2019/2/25 13:45
 * @version1.0
 */
@Entity
@Table(name = "t_roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleid")
    private Integer roleid;
    @Column(name = "rolename")
    private String rolename;


    //一个角色有多个用户
    @OneToMany(mappedBy = "roles")
    private Set<Users> users = new HashSet<>();

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                '}';
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
