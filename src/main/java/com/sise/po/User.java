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


}
