package org.example.service;

import org.example.data.DepartmentRepository;
import org.example.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class JavaService
{
  @Autowired
  private DepartmentRepository departmentRepository;

  @Transactional
  public List<Department> getAllDepartments()
  {
    return departmentRepository.findAll();
  }
}
