package com.yezi.demob.dao;

import com.yezi.demob.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: yezi
 * @Date: 2019/4/16 23 02
 * @Description:
 */
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByNameIsLike(String name);
}
