package com.sise.po;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @ClassName: User
 * @Description:
 * @Author: Chonor
 * @CreateDate: 2019-11-16 13:45:46
 **/
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    private int id;
    private String phone;
    private String password;
    private String nikeName;
    private String trueName;
    private String birthday;
    private int sex;

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
