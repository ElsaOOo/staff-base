package com.yezi.demob.service.impl;

import com.yezi.demob.dao.EmployeeDao;
import com.yezi.demob.entity.Employee;
import com.yezi.demob.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Author: yezi
 * @Date: 2019/4/17 21 06
 * @Description:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    @Transactional
    public Employee addOrUpdateEmployee(Employee employee) {
        if ((employee.getId() != null)) {
            employee.setUpdateTime(new Date());
        } else {
            employee.setCreateTime(new Date());
        }
        return employeeDao.save(employee);
    }

    @Override
    public boolean deleteEmployeeById(int id) {
        employeeDao.deleteById(id);
        return true;
    }

    @Override
    public List<Employee> getEmployeeList() {
        return employeeDao.findAll();
    }

    @Override
    public List<Employee> findEmployeeByName(String name) {
        return employeeDao.findAllByNameIsLike(name);
    }
}
