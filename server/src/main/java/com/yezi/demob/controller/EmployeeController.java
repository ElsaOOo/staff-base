package com.yezi.demob.controller;

import com.yezi.demob.entity.Employee;
import com.yezi.demob.service.EmployeeService;
import com.yezi.demob.utils.OperationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: yezi
 * @Date: 2019/4/18 08 48
 * @Description:
 */
@RestController
@RequestMapping(value = "/staff")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/getList", method = { RequestMethod.GET, RequestMethod.POST})
    public OperationResult getStaffList() {
        return OperationResult.ok(employeeService.getEmployeeList());
    }

    @RequestMapping(value = "/addOrUpdate", method = { RequestMethod.GET, RequestMethod.POST})
    public OperationResult addOrUpdateStaff(@RequestBody Employee employee) {
        return OperationResult.ok(employeeService.addOrUpdateEmployee(employee));
    }

    @RequestMapping(value = "/deleteById", method = { RequestMethod.GET, RequestMethod.POST})
    public OperationResult deleteStaffById(@RequestParam(name = "staffId", required = true) Integer staffId) {
        return OperationResult.ok(employeeService.deleteEmployeeById(staffId));
    }

    @RequestMapping(value = "/findStaffsByName", method = { RequestMethod.GET, RequestMethod.POST})
    public OperationResult findStaffsByName(@RequestParam(name = "name", required = true) String name) {
        return OperationResult.ok(employeeService.findEmployeeByName(name));
    }
}
