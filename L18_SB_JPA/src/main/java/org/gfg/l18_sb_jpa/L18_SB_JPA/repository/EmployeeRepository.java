package org.gfg.l18_sb_jpa.L18_SB_JPA.repository;

import org.gfg.l18_sb_jpa.L18_SB_JPA.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

}
