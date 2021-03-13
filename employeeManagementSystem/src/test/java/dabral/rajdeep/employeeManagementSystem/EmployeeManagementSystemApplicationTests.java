package dabral.rajdeep.employeeManagementSystem;

import dabral.rajdeep.employeeManagementSystem.entities.Employee;
import dabral.rajdeep.employeeManagementSystem.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class EmployeeManagementSystemApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateEmployee(){
		Employee employee1 = new Employee(101,"Rajdeep","Dabral",15000.00,24);
		Employee employee2 = new Employee(102,"Suraj","Dabral",10000.00,21);
		Employee employee3= new Employee(103,"Swati","Uniyal",25000.00,30);
		Employee employee4= new Employee(104,"Sumit","Singh",5000.00,19);
		Employee employee5= new Employee(105,"Abhipriya","Sharma",35000.00,24);
		Employee employee6= new Employee(106,"Rajat","Pal",51000.00,29);
		Employee employee7= new Employee(107,"Dilip","Kumar",15000.00,25);
		Employee employee8= new Employee(108,"Neha","Bhatt",35000.00,28);
		Employee employee9= new Employee(109,"Jyoti","Kumar",5000.00,20);
		Employee employee10 = new Employee(110,"Zoya","Khan",5000.00,22);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);
		employeeRepository.save(employee5);
		employeeRepository.save(employee6);
		employeeRepository.save(employee7);
		employeeRepository.save(employee8);
		employeeRepository.save(employee9);
		employeeRepository.save(employee10);
	}

	@Test
	public void testFindAllEmployee(){
		List<Object[]> employeeObject=employeeRepository.findEmployeeOnSpecificCondition();
		for(Object[] objects: employeeObject){
			//System.out.println(objects[0]+" "+objects[1]+" "+objects[2]+" "+objects[3]);
			System.out.println(objects[0]+" "+objects[1]);
		}
	}
}
