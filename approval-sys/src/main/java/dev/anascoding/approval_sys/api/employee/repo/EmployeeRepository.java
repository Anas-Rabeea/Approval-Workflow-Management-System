package dev.anascoding.approval_sys.api.employee.repo;

import dev.anascoding.approval_sys.api.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
}
