package com.yezi.demob.service.impl;

import com.yezi.demob.dao.DepartmentDao;
import com.yezi.demob.entity.Department;
import com.yezi.demob.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: yezi
 * @Date: 2019/4/16 23 05
 * @Description:
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentDao departmentDao;

    @Override
    public List<Department> getDepartList() {
        return departmentDao.findAll();
    }

    @Override
    @Transactional
    public Department addOrUpdateDepartment(Department department) {
        // JPA 中save方法：当添加的数据id为空时，添加一条数据到数据库， 当id有值时，修改数据库中的数据
        return departmentDao.save(department);
    }

    @Override
    public boolean deleteDepartment(int departId) {
        departmentDao.deleteById(departId);
        return true;
    }
}
