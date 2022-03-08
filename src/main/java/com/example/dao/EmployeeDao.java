package com.example.dao;

import com.example.model.Employee;
import com.example.repository.CassandraRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDao {

    @Autowired
    private CassandraRepo cassandraRepo;

    public Employee createEmployee(String employeeJson) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = objectMapper.readValue(employeeJson, Employee.class);
        cassandraRepo.save(employee);
        return employee;
    }
}
