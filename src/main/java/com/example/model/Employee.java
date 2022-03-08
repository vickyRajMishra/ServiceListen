package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table("Employee")
public class Employee {

    @PrimaryKey
    int id;
    @Column
    String name;
    @Column
    double salary;
    @Column
    char gender;

}
