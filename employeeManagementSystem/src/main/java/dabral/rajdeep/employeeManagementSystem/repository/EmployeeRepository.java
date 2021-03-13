package dabral.rajdeep.employeeManagementSystem.repository;

import dabral.rajdeep.employeeManagementSystem.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    /*
    1.Display the first name, last name of all employees
    having salary greater than average salary ordered in ascending by their age
    and in descending by their salary.
     */
    @Query("select firstName , lastName , age , salary from Employee where salary > (select avg(salary) from Employee ) order by age asc , salary desc")
    List<Object[]> findEmployeeOnSpecificCondition();


    /*
    2. Update salary of all employees by a salary passed as a parameter
        whose existing salary is less than the average salary.
    */
    @Query("")
    List<Employee> findEmployeeBySalaryCondition();

}













