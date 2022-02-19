package tech.zhenhua.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jndi.JndiTemplateEditor;
import tech.zhenhua.employeemanager.model.Employee;

import java.util.Optional;

/**
 * @author
 * @create 2022-02-13-2:11 AM
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
