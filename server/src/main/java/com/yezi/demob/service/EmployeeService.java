package com.yezi.demob.service;

import com.yezi.demob.entity.Employee;

import java.util.List;

/**
 * @Author: yezi
 * @Date: 2019/4/17 21 03
 * @Description:
 */
public interface EmployeeService {

    Employee addOrUpdateEmployee(Employee employee);
    boolean deleteEmployeeById(int id);
    List<Employee> getEmployeeList();
    List<Employee> findEmployeeByName(String name);
}
