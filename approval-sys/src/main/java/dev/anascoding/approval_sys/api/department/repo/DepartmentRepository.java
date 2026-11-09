package dev.anascoding.approval_sys.api.department.repo;

import dev.anascoding.approval_sys.api.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>
{
}
