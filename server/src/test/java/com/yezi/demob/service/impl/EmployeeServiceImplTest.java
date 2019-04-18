package com.yezi.demob.service.impl;

import com.yezi.demob.entity.Department;
import com.yezi.demob.entity.Employee;
import com.yezi.demob.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: yezi
 * @Date: 2019/4/17 21 18
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceImplTest {

    @Autowired
    EmployeeService employeeService;

    @Test
    public void addOrUpdateEmployee() throws ParseException {
        Employee employee = new Employee();
        Department department = new Department();
        String datePattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        department.setId(3);
        employee.setName("Mee");
        employee.setGender(1);
        employee.setBirthday(sdf.parse("1990-01-01"));
        employee.setJoinDate(sdf.parse("2019-01-01"));
        employee.setPhone("13876545678");
        employee.setStaffNum("89123789");
        employee.setUserName("Mee");
        employee.setDepartment(department);
        Employee saved = employeeService.addOrUpdateEmployee(employee);
        Assert.assertEquals("Mee", saved.getName());
    }

    @Test
    public void findEmployeeByName() {

        List<Employee> employees = employeeService.findEmployeeByName("L");
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}