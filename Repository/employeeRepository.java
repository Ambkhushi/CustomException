package com.project.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.employee.entity.employee;

public interface employeeRepository extends JpaRepository<employee, Long> {

}
