-- Last updated: 8/12/2026, 11:16:58 AM
# Write your MySQL query statement below
SELECT p.firstName,p.lastName,a.city, a.state from Person p LEFT JOIN Address a ON p.personId=a.personId;