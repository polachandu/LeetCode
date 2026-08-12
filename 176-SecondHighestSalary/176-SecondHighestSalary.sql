-- Last updated: 8/12/2026, 11:16:55 AM
# Write your MySQL query statement below

SELECT IFNULL((SELECT DISTINCT salary  FROM Employee ORDER BY salary DESC LIMIT 1 OFFSET 1),NULL)AS SecondHighestSalary;