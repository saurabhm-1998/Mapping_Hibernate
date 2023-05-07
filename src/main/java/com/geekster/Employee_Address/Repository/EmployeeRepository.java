package com.geekster.Employee_Address.Repository;
import com.geekster.Employee_Address.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
