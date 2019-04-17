package com.yezi.demob.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: yezi
 * @Date: 2019/4/16 22 42
 * @Description: 员工表
 *
 **/
@Entity
@DynamicUpdate
@DynamicInsert
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer gender;

    private String phone;

    // 登录时用的用户名
    @Column(name = "user_name")
    private String userName;

    private String password;

    // 入职日期
    @Column(name = "join_date")
    private Date joinDate;

    private Date birthday;

    // 员工编号
    @Column(name = "staff_num")
    private String staffNum;

    @ManyToOne()
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

}
