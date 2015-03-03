package org.example.data;

import org.example.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

public interface DepartmentRepository extends JpaRepository<Department, Long>
{
  @Modifying
  @Transactional
  void deleteByName(String name);
}
