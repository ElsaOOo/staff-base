package com.yezi.demob.dao;

import com.yezi.demob.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: yezi
 * @Date: 2019/4/16 23 02
 * @Description:
 */
public interface DepartmentDao extends JpaRepository<Department, Integer> {
}
