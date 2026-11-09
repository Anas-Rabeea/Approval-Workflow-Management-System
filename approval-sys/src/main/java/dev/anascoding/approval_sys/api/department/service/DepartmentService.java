package dev.anascoding.approval_sys.api.department.service;

import dev.anascoding.approval_sys.api.department.entity.Department;
import dev.anascoding.approval_sys.api.department.repo.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService
{
    private final DepartmentRepository departmentRepository;


    public void addDepartment(String deptName)
    {
        Department newDept = Department.builder().build();
        departmentRepository.save()
    }

}
