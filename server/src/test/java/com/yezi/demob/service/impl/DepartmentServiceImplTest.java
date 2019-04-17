package com.yezi.demob.service.impl;

import com.yezi.demob.entity.Department;
import com.yezi.demob.service.DepartmentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.*;

/**
 * @Author: yezi
 * @Date: 2019/4/17 09 15
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServiceImplTest {
    @Autowired
    DepartmentService departmentService;

    @Test
    public void getDepartList() {

    }

    @Test
    public void addOrUpdateDepartment() {
        Department department = new Department();
        department.setId(3);
        department.setDName("test部");
        department.setDdesc("test2部");
        Department saved = departmentService.addOrUpdateDepartment(department);
        Assert.assertEquals("test部", saved.getDName());
    }

    @Test
    public void deleteDepartment() {
        departmentService.deleteDepartment(3);
    }
}