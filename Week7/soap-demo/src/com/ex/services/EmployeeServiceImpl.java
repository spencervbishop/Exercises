package com.ex.services;

import com.ex.model.Employee;
import com.ex.model.EmployeeNotFound;

import javax.jws.WebService;


@WebService(endpointInterface="com.ex.services.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee findEmployee(String eid) throws EmployeeNotFound {
        if(eid.equalsIgnoreCase("32ee-332")){
            throw new EmployeeNotFound(eid + " not found");
        }
        Employee e = new Employee();
        e.setEid("1234");
        e.setFirstName("Spencer");
        e.setLastName("Saunders");
        return e;
    }
}
