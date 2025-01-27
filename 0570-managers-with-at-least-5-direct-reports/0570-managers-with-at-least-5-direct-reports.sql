# Write your MySQL query statement below
Select e1.name
from Employee as e1
Join Employee as e2
On e1.id=e2.managerId
Group by e2.managerId
Having count(*)>=5;
