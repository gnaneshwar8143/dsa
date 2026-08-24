# Write your MySQL query statement below
SELECT MAX(salary) as SecondHighestSalary
from employee
where salary<(select MAX(salary) from employee);