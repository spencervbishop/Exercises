package com.ex.services;

import com.ex.model.Employee;
import com.ex.model.EmployeeNotFound;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style= SOAPBinding.Style.DOCUMENT)
public interface EmployeeService {

    @WebMethod
    Employee findEmployee(String eid) throws EmployeeNotFound;
}
