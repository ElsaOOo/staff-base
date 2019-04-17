package com.yezi.demob.controller;

import com.yezi.demob.entity.Department;
import com.yezi.demob.service.DepartmentService;
import com.yezi.demob.utils.OperationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yezi
 * @Date: 2019/4/17 07 56
 * @Description:
 */
@RestController
@RequestMapping(value = "/depart")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/test", method = { RequestMethod.GET, RequestMethod.POST})
    public OperationResult test() {
        return OperationResult.ok("hello");
    }

    @RequestMapping(value = "/getList", method = { RequestMethod.GET, RequestMethod.POST})
    public OperationResult getDepartmentList() {
        return OperationResult.ok(departmentService.getDepartList());
    }

    @RequestMapping(value = "/deleteById", method = { RequestMethod.GET, RequestMethod.POST})
    public OperationResult deleteDepartmentById(int departmentId) {
        return OperationResult.ok(departmentService.deleteDepartment(departmentId));
    }

    @RequestMapping(value = "/addOrUpdate", method = { RequestMethod.GET, RequestMethod.POST})
    public OperationResult addOrUpdateDepartment(@RequestBody Department department) {
        return OperationResult.ok(departmentService.addOrUpdateDepartment(department));
    }
}
