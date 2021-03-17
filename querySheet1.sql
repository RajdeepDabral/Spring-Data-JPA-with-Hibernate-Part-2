Show databases
use DB
Show tables

create table employeeTable(
empId integer(10) primary key,
empFirstName varchar(50),
empLastName varchar(50),
empSalary decimal(8,2),
empAge integer(3)
);

Desc employeeTable

drop table employeeTable

select * from employeeTable

delete from employeeTable

select avg(emp_salary) from employee_table

/*Q1. Display the first name, last name of all employees having salary greater 
than average salary ordered in ascending by their age and in descending by their salary.*/

select emp_first_name , emp_last_name , emp_age , emp_salary from employee_table
where emp_salary > (select avg(emp_salary) from employee_table)
order by emp_age asc , emp_salary desc

/*Q2. Update salary of all employees by a salary passed as a 
parameter whose existing salary is less than the average salary.
*/

update dabral.rajdeep.employeeManagementSystem.entities.Employee set salary = :updateSalary
where salary <select AvgSalary from (select avg(salary) as AvgSalary from Employee) as AvgSalaryDataTable



use DB
InheritanceType.SINGLE_TABLE
----------------------------------------

create table travelSingleTableStructure(
personId varchar(10) primary key ,
personName varchar(10) ,
travelMode varchar(10),
bikeId varchar(10),
carId varchar(10)
)
desc travelSingleTableStructure

select * from travelSingleTableStructure

InheritanceType.SINGLE_TABLE
------------------------------------
create table bikeTablePerClass(
personId varchar(10) primary key ,
personName varchar(10) ,
bikeId varchar(10)
);
select * from bikeTablePerClass
	
create table carTablePerClass(
personId varchar(10) primary key ,
personName varchar(10) ,
carId varchar(10)
)
select * from carTablePerClass

InheritanceType.JOINED
---------------------------
create table travelJoined(
personId varchar(10) primary key ,
personName varchar(10)
)
select * from travelJoined

create table bikeJoined(
personId varchar(10),
bikeId varchar(10),
foreign key(personId)
references travelJoined(personId)
)
select * from bikeJoined

create table carJoined(
personId varchar(10) primary key ,
carId varchar(10),
foreign key(personId)
references travelJoined(personId)
)
select * from carJoined


use DB
create table employeeComponentMapping(
id Integer primary key,
firstName varchar(25),
lastName varchar(25),
age Integer ,
basicSalary decimal(8,2),
bonusSalary decimal(8,2),
taxAmount decimal(8,2),
specialAllowanceSalary decimal(8,2)   
)
desc employeeComponentMapping

select * from employeeComponentMapping









