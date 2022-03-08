package com.example.repository;

import com.example.model.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassandraRepo extends CassandraRepository<Employee, Integer> {

}
