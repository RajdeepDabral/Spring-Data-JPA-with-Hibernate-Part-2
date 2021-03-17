package dabral.rajdeep.employeeManagementSystem.repository;

import dabral.rajdeep.employeeManagementSystem.entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    //JPQL:
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
    @Query("select avg(salary) as avgSalary from Employee")
    double findEmployeesAverageSalary();

    @Modifying
    @Query(" update Employee set salary = :updateSalary where salary < :averageSalary")
    void findUpdateEmployeeSalary(@Param("updateSalary") double sal , @Param("averageSalary") double averageSal);


    /*
    3. Delete all employees with minimum salary.
    */
    @Modifying
    @Query("delete from Employee where salary < :minSalary")
    void deleteEmployeeRecord(@Param("minSalary") double sal);


    // Native SQL Query:
    /*
    4. Display the id, first name, age of all employees where last name ends with "singh"
    */

    @Query(value = "select empid ,empFirstName ,empAge from employeeTable where empLastName Like \'%Singh\' ", nativeQuery = true)
    List<Object[]> findEmployeeLastNameEndWithSingh();

    /*
    5. Delete all employees with age greater than 45(Should be passed as a parameter)
    */
    @Modifying
    @Query(value = "delete from employeeTable where empAge > :ageParam" , nativeQuery = true)
    void deleteEmployeeWithAgeGreaterThan45(@Param("ageParam") double ageParameter);
}













