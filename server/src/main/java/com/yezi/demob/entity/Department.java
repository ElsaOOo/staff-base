package com.yezi.demob.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

/**
 * @Author: yezi
 * @Date: 2019/4/16 22 40
 * @Description: 部门表
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "d_name")
    private String dName;

    // 部门描述
    @Column(name = "d_desc")
    private String ddesc;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Employee> employees;

}
