package dabral.rajdeep.employeeManagementSystem.entities;

import javax.persistence.*;

@Entity
@Table(name = "employeeComponentMapping")
public class EmployeeComponentMapping {
    @Id
    private int id;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    private int age;
    @Embedded
    private SalaryComponentMapping salaryComponentMapping;

    public EmployeeComponentMapping(){

    }
    public EmployeeComponentMapping(int id, String firstName, String lastName, int age, SalaryComponentMapping salaryComponentMapping) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salaryComponentMapping = salaryComponentMapping;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SalaryComponentMapping getSalaryComponentMapping() {
        return salaryComponentMapping;
    }

    public void setSalaryComponentMapping(SalaryComponentMapping salaryComponentMapping) {
        this.salaryComponentMapping = salaryComponentMapping;
    }
}

// fields: id,
//         firstName,
//         lastName,
//         age,
//         basicSalary,
//         bonusSalary,
//         taxAmount,
//         specialAllowanceSalary