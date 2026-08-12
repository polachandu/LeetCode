-- Last updated: 8/12/2026, 11:16:53 AM
# Write your MySQL query statement below
SELECT A.Name AS 'Employee' FROM Employee as A, Employee as B WHERE A.ManagerId = B.Id AND A.Salary > B.Salary 