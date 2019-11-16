package com.sise.po;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @ClassName: Role
 * @Description:
 * @Author: Chonor
 * @CreateDate: 2019-11-16 18:26:38
 **/
@Entity
@Table(name = "tb_role")
public class Role implements Serializable {

    private int id;
    private String roleName;

}
