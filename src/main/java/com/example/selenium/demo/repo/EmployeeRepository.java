package com.example.selenium.demo.repo;

import com.example.selenium.demo.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * @project: selenium.demo
 * @author: Dongbo Tang
 * @Date: 18/03/2022
 */

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
