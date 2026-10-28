# Write your MySQL query statement below
select Department.name as Department,Employee.name as Employee,Employee.Salary from Employee join department on employee.departmentId=department.id 
where employee.salary=(
    select MAX(employee.salary) from employee WHERE employee.departmentId=department.id 
);