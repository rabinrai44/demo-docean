package com.zalostation.docean.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepository repository;

  public List<Employee> getAllEmployees() {
    return repository.findAll();
  }
}
