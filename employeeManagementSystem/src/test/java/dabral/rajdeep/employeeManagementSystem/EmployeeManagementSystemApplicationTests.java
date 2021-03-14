package dabral.rajdeep.employeeManagementSystem;

import dabral.rajdeep.employeeManagementSystem.entities.*;
import dabral.rajdeep.employeeManagementSystem.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@SpringBootTest
class EmployeeManagementSystemApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	TravelSingleTableStructureRepository travelRepository;
	@Autowired
	TravelTablePerClassRepository travelTablePerClass;
	@Autowired
	TravelJoinedRepository travelJoinedRepository;
	@Autowired
	employeeComponentMappingRepository employeeComponentMappingRepository;

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
		Employee employee11 = new Employee(111,"Deepak","Khan",125000.00,45);
		Employee employee12 = new Employee(112,"Piyush","Singh",225000.00,50);
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
		employeeRepository.save(employee11);
		employeeRepository.save(employee12);
	}

	@Test
	public void testFindAllEmployee(){
		List<Object[]> employeeObject=employeeRepository.findEmployeeOnSpecificCondition();
		for(Object[] objects: employeeObject){
			//System.out.println(objects[0]+" "+objects[1]+" "+objects[2]+" "+objects[3]);
			System.out.println(objects[0]+" "+objects[1]);
		}
	}


//	@Test
//	@Transactional
//	@Rollback(false)
//	public void testFindEmployeeBySalaryUpdateCondition(){
//		employeeRepository.findEmployeeBySalaryUpdateCondition(1.0);
//	}

	@Test
	@Transactional
	@Rollback(false)
	public void testDeleteEmployeeRecord(){
		employeeRepository.deleteEmployeeRecord(10000);
	}

	@Test
	public void testEmployeeNameEndWithSingh(){
		List<Object[]> list =  employeeRepository.findEmployeeLastNameEndWithSingh();
		for(Object[] objects : list){
			System.out.println(objects[0]+" "+objects[1]+" "+objects[2]);
		}
	}

	@Test
	@Transactional
	@Rollback(false)
	public void testDeleteEmployeeWithAgeGreaterThan45(){
		employeeRepository.deleteEmployeeWithAgeGreaterThan45(45);
	}


	/*
	6. Implement and demonstrate Single Table strategy.
	 */
	@Test
	public void createPersonTravelSingleTableStructure(){
		BikeSingleTableStructureChild bikeObject =  new BikeSingleTableStructureChild("101","Rajdeep" , "bike@101");
		CarSingleTableStructureChild carObject =  new CarSingleTableStructureChild("102","Sumit" , "car@102");
		travelRepository.save(bikeObject);
		travelRepository.save(carObject);
	}

	/*
	7. Implement and demonstrate Joined strategy.
	 */
	@Test
	public void createPersonTravelJoined(){
		BikeJoined bikeObject =  new BikeJoined("101","Rajdeep" , "bike@101");
		CarJoined  carObject =  new CarJoined ("102","Sumit" , "car@102");
		travelJoinedRepository.save(bikeObject);
		travelJoinedRepository.save(carObject);
	}

	/*
	8. Implement and demonstrate Table Per Class strategy.
 	*/
	@Test
	public void createPersonTravelTablePerClass(){
		BikeTablePerClass bikeObject =  new BikeTablePerClass("101","Rajdeep" , "bike@101");
		CarTablePerClass carObject =  new CarTablePerClass("102","Sumit" , "car@102");
		travelTablePerClass.save(bikeObject);
		travelTablePerClass.save(carObject);
	}

	@Test
	public void TestEmployeeComponentMapping(){
		SalaryComponentMapping   salary = new SalaryComponentMapping(15000,1200,5.0,2100);
		EmployeeComponentMapping employee = new EmployeeComponentMapping(101,"Rajdeep" ,"dabral",23,salary);
		employeeComponentMappingRepository.save(employee);
	}
}
