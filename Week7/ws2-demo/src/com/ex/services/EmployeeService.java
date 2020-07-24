package com.ex.services;

import com.ex.domain.Employee;
import com.ex.domain.EmployeeNotFound;

import javax.jws.WebService;

@WebService
public interface EmployeeService {

    Employee findEmployee(String arg0) throws EmployeeNotFound;
}
