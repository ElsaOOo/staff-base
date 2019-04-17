package com.yezi.demob.service;

import com.yezi.demob.entity.Department;

import java.util.List;

/**
 * @Author: yezi
 * @Date: 2019/4/16 23 04
 * @Description:
 */
public interface DepartmentService {

    List<Department> getDepartList();
    Department addOrUpdateDepartment(Department department);
    boolean deleteDepartment(int departId);
}
